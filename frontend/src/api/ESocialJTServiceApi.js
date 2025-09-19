import { useMutation, useQuery, useQueryClient } from "react-query";
import useFeedback from "../components/feedback/useFeedback";
import {
  ESOCIAL_JT_SERVICE_URL,
  KEYCLOAK_ROLES_CONFIG,
  UserRoles
} from "../shared/env";
import createApi, { createQueryFetcher } from "./api";

// Factory function para criar fetchers
const createFetcher = (roleType = null) => {
  const requiredRoles = roleType ? KEYCLOAK_ROLES_CONFIG[roleType] : null;
  const apiInstance = createApi(ESOCIAL_JT_SERVICE_URL, requiredRoles);
  return createQueryFetcher(apiInstance);
};

// Factory function para criar mutations
const createMutationFn = (method, endpoint, roleType = null) => {
  const requiredRoles = roleType ? KEYCLOAK_ROLES_CONFIG[roleType] : null;
  const apiInstance = createApi(ESOCIAL_JT_SERVICE_URL, requiredRoles);
  return (data) => {
    // Para endpoints dinâmicos (com IDs)
    const resolvedEndpoint =
      typeof endpoint === "function" ? endpoint(data) : endpoint;
    return apiInstance[method](resolvedEndpoint, data);
  };
};

// Fetchers pré-definidos para cada role
const fetchers = {
  [UserRoles.USER]: createFetcher(UserRoles.USER),
  [UserRoles.MANAGER]: createFetcher(UserRoles.MANAGER),
  [UserRoles.ADMIN]: createFetcher(UserRoles.ADMIN)
};

const REFRESH_INTERVAL = 5000;
const PAGE_SIZE = 25;

// Funções de query
export function useOcorrencias() {
  return useQuery(`/ocorrencias/dados-basicos`, fetchers[UserRoles.USER], {
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
  return useQuery(query, fetchers[UserRoles.USER], {
    refetchInterval: REFRESH_INTERVAL,
    keepPreviousData: true
  });
}

export function useDetalheOcorrencia(id) {
  return useQuery(`/ocorrencias/${id}`, fetchers[UserRoles.USER], {
    refetchInterval: REFRESH_INTERVAL
  });
}

export function useTiposEnviados() {
  return useQuery(`/ocorrencias/tipos`, fetchers[UserRoles.USER]);
}

export function useESocialJTStatus() {
  return useQuery(`/actuator/health`, fetchers[UserRoles.USER]);
}

export function useESocialGovStatus() {
  return useQuery(`/actuator/esocialhealth`, fetchers[UserRoles.USER]);
}

// Funções de mutation usando enum
export function useLimparProducaoRestrita() {
  const queryClient = useQueryClient();
  return useMutation(
    createMutationFn("post", `/producao-restrita/acoes/limpar`, UserRoles.USER),
    {
      onSuccess: () =>
        queryClient.setQueryData(
          `/ocorrencias/paginado?page=0&size=${PAGE_SIZE}`,
          { empty: true }
        )
    }
  );
}

export function useArquivar() {
  const queryClient = useQueryClient();
  const { showSuccess } = useFeedback();
  return useMutation(
    createMutationFn(
      "post",
      (id) => `/ocorrencias/${id}/acoes/arquivar`,
      UserRoles.USER
    ),
    {
      onSuccess: () =>
        queryClient
          .invalidateQueries()
          .then(() => showSuccess("Evento arquivado"))
    }
  );
}

export function useDesarquivar() {
  const queryClient = useQueryClient();
  const { showInfo } = useFeedback();
  return useMutation(
    createMutationFn(
      "post",
      (id) => `/ocorrencias/${id}/acoes/desarquivar`,
      UserRoles.USER
    ),
    {
      onSuccess: () =>
        queryClient
          .invalidateQueries()
          .then(() => showInfo("Evento desarquivado"))
    }
  );
}

export function useEnviarExclusao() {
  return useMutation(
    createMutationFn(
      "post",
      (id) => `/ocorrencias/${id}/acoes/excluir`,
      UserRoles.USER
    )
  );
}
