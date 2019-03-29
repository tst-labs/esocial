import Ocorrencia from "../models/ocorrencia/Ocorrencia";

const baseUrlDefault = "http://localhost:8080/esocial-jt-service";
const baseUrl =
  window.env && window.env.ESOCIAL_SERVICE_URL
    ? window.env.ESOCIAL_SERVICE_URL
    : baseUrlDefault;

export function statusEsocialJt() {
  return fetch(`${baseUrl}/actuator/health`).then(response => response.json());
}

export function statusEsocialGov() {
  return fetch(`${baseUrl}/actuator/esocialhealth`).then(response =>
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
