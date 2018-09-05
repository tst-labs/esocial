import EstadoOcorrencia from "./EstadoOcorrencia";
import TipoEvento from "./TipoEvento";

import Ocorrencia from "./Ocorrencia";

export default class OcorrenciaParser {
  constructor(ocorrenciaApi) {
    this.ocorrenciaApi = ocorrenciaApi;
  }

  parse() {
    const ocorrencia = new Ocorrencia();
    ocorrencia.id = this.id;
    ocorrencia.estado = this.estado;
    ocorrencia.tipoEvento = this.tipoEvento;
    ocorrencia.data = this.data;
    ocorrencia.dataRecebimento = this.dataRecebimento;
    ocorrencia.operacao = this.operacao;
    ocorrencia.referencia = this.referencia;
    ocorrencia.dados = this.dados;
    ocorrencia.evento = this.evento;
    return ocorrencia;
  }

  get id() {
    return this.ocorrenciaApi.id;
  }

  get tipoEvento() {
    return TipoEvento.criarComDadosApi(this.ocorrenciaApi);
  }

  get estado() {
    return EstadoOcorrencia.criarComDadosApi(this.ocorrenciaApi);
  }

  get data() {
    if (this.ocorrenciaApi.data) {
      return new Date(this.ocorrenciaApi.data);
    } else if (this.ocorrenciaApi.dataOcorrencia) {
      return new Date(this.ocorrenciaApi.dataOcorrencia);
    } else {
      return null;
    }
  }

  get dataRecebimento() {
    if (this.ocorrenciaApi.dataRecebimento) {
      return new Date(this.ocorrenciaApi.dataRecebimento);
    } else {
      return null;
    }
  }

  get dados() {
    return this.ocorrenciaApi.dadosOcorrencia;
  }

  get evento() {
    return this.ocorrenciaApi.evento;
  }

  get operacao() {
    return this.ocorrenciaApi.operacao;
  }

  get referencia() {
    return this.ocorrenciaApi.referencia;
  }
}
