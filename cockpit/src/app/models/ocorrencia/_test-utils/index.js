// FIXME: relacionar dados com db.json do dev-server

import ocorrenciaDetalhada from "./ocorrencia-detalhada";

const tipoEventoPadrao = {
  codTipo: 1040,
  desTipo: "Tabela de Funções/Cargos em Comissão"
};

export function criarOcorrenciaApiBasicaFalsa(
  id = 1,
  idEstadoEvento = 1,
  tipoEvento = tipoEventoPadrao
) {
  return { id, estadoEvento: { id: idEstadoEvento }, tipoEvento };
}

export function criarOcorrenciaDetalhadaFalsa(
  id = 1,
  idEstadoEvento = 1,
  tipoEvento = tipoEventoPadrao
) {
  return {
    ...ocorrenciaDetalhada,
    id,
    evento: { estado: { id: idEstadoEvento }, tipoEvento }
  };
}
