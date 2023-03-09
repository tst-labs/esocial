import axios from "axios";
import { getToken, updateToken, authRequired } from "../shared/keycloak";

function createApi(baseURL) {
  const api = axios.create({ baseURL });

  if (authRequired) {
    api.interceptors.request.use(async (config) => {
      await updateToken(5);
      // eslint-disable-next-line
      config.headers.Authorization = `Bearer ${getToken()}`;
      return config;
    });
  }

  api.interceptors.response.use(
    (response) => response,
    (error) => {
      let errorData;

      if (error.response) {
        errorData = error.response.data;
      } else {
        errorData = {
          message:
            "Ocorreu um erro com sua requisição. Tente novamente em alguns minutos.",
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
