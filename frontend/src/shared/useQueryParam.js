import { useMemo } from "react";
import { useLocation } from "react-router-dom";

export function useQuery() {
  const { search } = useLocation();

  return useMemo(() => new URLSearchParams(search), [search]);
}

export function useQueryParam(param) {
  const query = useQuery();
  return query.get(param);
}

export function useNumericQueryParam(param, defaultValue = 0) {
  const query = useQuery();
  const value = query.get(param);
  return value == null || isNaN(value) ? defaultValue : parseInt(value);
}

export function useListQueryParam(param, defaultValue = []) {
  const query = useQuery();
  const value = query.get(param);
  return value == null
    ? defaultValue
    : value
        .split(",")
        .map((v) => parseInt(v))
        .filter((v) => !isNaN(v));
}

export function useSetParam() {
  const query = useQuery();
  function setParam(param, value) {
    query.set(param, value);
    return query;
  }
  return setParam;
}
