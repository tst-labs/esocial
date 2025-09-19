import axios from "axios";
import { getToken, updateToken, authRequired } from "../shared/keycloak";
import { hasAnyRole } from "./auth-utils";

function createApi(baseURL, requiredRoles = null) {
  const api = axios.create({ baseURL });

  if (authRequired) {
    api.interceptors.request.use(async (config) => {
      await updateToken(5);
      config.headers.Authorization = `Bearer ${getToken()}`;
      const token = getToken();

      // Se a(s) role(s) informada(s) não for igual ao que existe no token
      if (!hasAnyRole(requiredRoles, token)) {
        const error = new Error("Acesso negado. Permissões insuficientes!");
        error.status = 403;
        error.isAuthorizationError = true;
        throw error;
      }
      return config;
    });
  }

  api.interceptors.response.use(
    (response) => response,
    (error) => {
      let errorData;

      if (error.response) {
        errorData = error.response.data;

        // Adiciona informações de status se não existirem
        if (!errorData.status) {
          errorData.status = error.response.status;
        }
      } else if (error.isAuthorizationError) {
        // Erro de autorização personalizado
        errorData = {
          message: error.message,
          status: error.status || 403,
          isAuthorizationError: true
        };
      } else {
        errorData = {
          message:
            "Ocorreu um erro com sua requisição. Tente novamente em alguns minutos.",
          status: 500,
          isRequestError: true
        };
      }

      throw errorData;
    }
  );

  return api;
}

export function createQueryFetcher(api) {
  return ({ queryKey }) => api(...queryKey).then((res) => res.data);
}

export default createApi;
