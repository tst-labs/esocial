import { useMutation, useQuery, useQueryClient } from "react-query";
import useFeedback from "../components/feedback/useFeedback";
import { ESOCIAL_JT_SERVICE_URL } from "../shared/env";
import createApi, { createQueryFetcher } from "./api";

export const api = createApi(ESOCIAL_JT_SERVICE_URL);
const queryFetcher = createQueryFetcher(api);
const REFRESH_INTERVAL = 5000;
const PAGE_SIZE = 25;

export function useOcorrencias() {
  return useQuery(`/ocorrencias/dados-basicos`, queryFetcher, {
    refetchInterval: REFRESH_INTERVAL
  });
}

export function useOcorrenciasPaginado(
  page = 0,
  estados = [],
  expressao = "",
  tipo = "",
  incluirArquivados = false
) {
  const query = `/ocorrencias/paginado?page=${page}&size=${PAGE_SIZE}&estados=${estados.join()}&expressao=${expressao}&tipos=${tipo}&incluirArquivados=${incluirArquivados}`;
  return useQuery(query, queryFetcher, {
    refetchInterval: REFRESH_INTERVAL,
    keepPreviousData: true
  });
}

export function useDetalheOcorrencia(id) {
  return useQuery(`/ocorrencias/${id}`, queryFetcher, {
    refetchInterval: REFRESH_INTERVAL
  });
}

export function useTiposEnviados() {
  return useQuery(`/ocorrencias/tipos`, queryFetcher);
}

export function useLimparProducaoRestrita() {
  const queryClient = useQueryClient();
  return useMutation(() => api.post(`/producao-restrita/acoes/limpar`), {
    onSuccess: () =>
      queryClient.setQueryData(
        `/ocorrencias/paginado?page=0&size=${PAGE_SIZE}`,
        { empty: true }
      )
  });
}

export function useESocialJTStatus() {
  return useQuery(`/actuator/health`, queryFetcher);
}

export function useESocialGovStatus() {
  return useQuery(`/actuator/esocialhealth`, queryFetcher);
}

export function useArquivar() {
  const queryClient = useQueryClient();
  const { showSuccess } = useFeedback();
  return useMutation((id) => api.post(`/ocorrencias/${id}/acoes/arquivar`), {
    onSuccess: () =>
      queryClient
        .invalidateQueries()
        .then(() => showSuccess(`Evento arquivado`))
  });
}

export function useDesarquivar() {
  const queryClient = useQueryClient();
  const { showInfo } = useFeedback();
  return useMutation((id) => api.post(`/ocorrencias/${id}/acoes/desarquivar`), {
    onSuccess: () =>
      queryClient
        .invalidateQueries()
        .then(() => showInfo(`Evento desarquivado`))
  });
}
