import { formataDataTempoLong } from "./dataUtil";

export function getTitulo(ocorrencia) {
  return ocorrencia && ocorrencia.tipoEvento
    ? `S${ocorrencia.tipoEvento.codTipo} - ${ocorrencia.tipoEvento.desTipo}`
    : "Gerando evento...";
}

export function getDataGeracao(data) {
  return data && `Gerado em ${formataDataTempoLong(data)}`;
}
