import { useMutation, useQuery, useQueryClient } from "react-query";
import { ESOCIAL_JT_SERVICE_URL } from "../shared/env";
import createApi, { createQueryFetcher } from "./api";

export const api = createApi(ESOCIAL_JT_SERVICE_URL);
const queryFetcher = createQueryFetcher(api);
const REFRESH_INTERVAL = 10000;

export function useOcorrencias() {
  return useQuery(`/ocorrencias/dados-basicos`, queryFetcher, {
    refetchInterval: REFRESH_INTERVAL
  });
}

export function useDetalheOcorrencia(id) {
  return useQuery(`/ocorrencias/${id}`, queryFetcher, {
    refetchInterval: REFRESH_INTERVAL
  });
}

export function useLimparProducaoRestrita() {
  const queryClient = useQueryClient();
  return useMutation(() => api.post(`/producao-restrita/acoes/limpar`), {
    onSuccess: () => queryClient.setQueryData(`/ocorrencias/dados-basicos`, [])
  });
}

export function useESocialJTStatus() {
  return useQuery(`/actuator/health`, queryFetcher);
}

export function useESocialGovStatus() {
  return useQuery(`/actuator/esocialhealth`, queryFetcher);
}
