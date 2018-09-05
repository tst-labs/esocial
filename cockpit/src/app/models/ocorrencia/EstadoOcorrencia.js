class EstadosApi {
  static FILA = 1;
  static PROCESSAMENTO = 2;
  static PROCESSADO_COM_SUCESSO = 3;
  static PROCESSADO_COM_ERRO = 4;
  static ERRO = 5;
}

class EstadoOcorrencia {
  constructor(id, descricao, cor) {
    this.id = id;
    this.descricao = descricao;
    this.cor = cor;
  }

  static criarComDadosApi(ocorrenciaApi) {
    if (ocorrenciaApi) {
      const id = EstadoOcorrencia.idEventoApi(ocorrenciaApi);
      if (!id || id === EstadosApi.FILA) {
        return FILA;
      } else if (id === EstadosApi.PROCESSAMENTO) {
        return PROCESSAMENTO;
      } else if (id === EstadosApi.PROCESSADO_COM_SUCESSO) {
        return PROCESSADO_COM_SUCESSO;
      } else if (
        id === EstadosApi.PROCESSADO_COM_ERRO ||
        id === EstadosApi.ERRO
      ) {
        return ERRO;
      }
    } else {
      return null;
    }
  }

  static compare(estado1, estado2) {
    if (!estado1 || !estado2) {
      return false;
    } else {
      return estado1.id === estado2.id;
    }
  }

  static idEventoApi(ocorrenciaApi) {
    if (ocorrenciaApi.estadoEvento) {
      return ocorrenciaApi.estadoEvento.id;
    } else if (ocorrenciaApi.evento) {
      return ocorrenciaApi.evento.estado.id;
    } else {
      return null;
    }
  }
}

export const FILA = new EstadoOcorrencia(1, "Em fila", "blue");
export const PROCESSAMENTO = new EstadoOcorrencia(
  2,
  "Em processamento",
  "yellow"
);
export const PROCESSADO_COM_SUCESSO = new EstadoOcorrencia(
  3,
  "Processado com sucesso",
  "green"
);
export const ERRO = new EstadoOcorrencia(4, "Processado com erro", "red");

export const Estados = [FILA, PROCESSAMENTO, PROCESSADO_COM_SUCESSO, ERRO];

export default EstadoOcorrencia;
