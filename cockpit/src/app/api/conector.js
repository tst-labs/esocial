const baseUrlDefault = "http://localhost:8888/esocial-pentaho-server";
const baseUrl =
  window.env && window.env.CONECTOR_ETL_SERVICE_URL
    ? window.env.CONECTOR_ETL_SERVICE_URL
    : baseUrlDefault;

export function statusConector() {
  return fetch(`${baseUrl}/actuator/health`).then(response => response.json());
}

export function limpar() {
  return fetch(`${baseUrl}/jobs/limpar?async=false`, {
    method: "POST"
  }).then(response => response.json());
}

export function executarETL() {
  return fetch(`${baseUrl}/jobs/executar-etl?async=false`, {
    method: "POST"
  }).then(response => response.json());
}

export async function conectorUp() {
  return fetch(`${baseUrl}/actuator/health`)
    .then(response => response.ok)
    .catch(() => false);
}
