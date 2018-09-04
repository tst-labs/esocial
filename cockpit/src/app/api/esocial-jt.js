import { getBaseUrlForProject } from "./base";
import Ocorrencia from "../models/ocorrencia/Ocorrencia";

const baseUrl = getBaseUrlForProject("esocial-jt-service");

export function statusEsocialJt() {
  return fetch(`${baseUrl}/actuator/health`).then(response => response.json());
}

export function statusEsocialGov() {
  return fetch(`${baseUrl}/actuator/esocial-health`).then(response =>
    response.json()
  );
}

export function limparProducaoRestrita() {
  return fetch(`${baseUrl}/producao-restrita/acoes/limpar`, {
    method: "POST"
  }).then(response => response.json());
}

export function obterOcorrencia(id) {
  return fetch(`${baseUrl}/ocorrencias/${id}`)
    .then(response => response.json())
    .then(Ocorrencia.criarComDadosApi);
}

export async function listarOcorrencias() {
  return fetch(`${baseUrl}/ocorrencias/dados-basicos`)
    .then(response => response.json())
    .then(json => json.map(Ocorrencia.criarComDadosApi));
}
