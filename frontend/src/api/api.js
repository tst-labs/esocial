import axios from "axios";

function createApi(baseURL) {
  const api = axios.create({ baseURL });

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
