export default class TipoEvento {
  static criarComDadosApi(ocorrenciaApi) {
    const tipoEvento = new TipoEvento();
    const tipoEventoApi = TipoEvento.__tipoEventoFromOcorrenciaApi(
      ocorrenciaApi
    );
    if (tipoEventoApi) {
      tipoEvento.id = tipoEventoApi.codTipo;
      tipoEvento.descricao = tipoEventoApi.desTipo;
    }

    return tipoEvento;
  }

  static __tipoEventoFromOcorrenciaApi(ocorrenciaApi) {
    if (ocorrenciaApi.tipoEvento) {
      return ocorrenciaApi.tipoEvento;
    } else if (ocorrenciaApi.evento) {
      return ocorrenciaApi.evento.tipoEvento;
    } else {
      return null;
    }
  }

  get descricaoCompleta() {
    if (this.id && this.descricao) {
      return `${this.id} ${this.descricao}`;
    } else {
      return "Evento em preparação";
    }
  }
}
