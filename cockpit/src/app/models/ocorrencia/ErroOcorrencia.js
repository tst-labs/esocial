import uniqid from "uniqid";

export default class ErroEnvioOcorrencia {
  constructor(id, titulo, descricao, localizacao = null) {
    this.id = id;
    this.titulo = titulo;
    this.descricao = descricao;
    this.localizacao = localizacao;
  }

  static listarErrosOcorrenciaUltimoEnvio(ocorrencia) {
    if (
      !ocorrencia.evento ||
      !ocorrencia.evento.enviosEvento ||
      ocorrencia.evento.enviosEvento.length === 0
    ) {
      return null;
    } else {
      const enviosEvento = ocorrencia.evento.enviosEvento;
      const ultimoEnvio = enviosEvento[enviosEvento.length - 1];
      const listaErros = [];

      if (ultimoEnvio.codigoResposta) {
        listaErros.push(
          new ErroEnvioOcorrencia(
            uniqid(),
            "Erro desconhecido",
            ultimoEnvio.codigoResposta.desResposta
          )
        );
      }
      if (ultimoEnvio.erroInterno) {
        listaErros.push(
          new ErroEnvioOcorrencia(
            uniqid(),
            "Erro interno",
            ultimoEnvio.erroInterno
          )
        );
      }
      if (ultimoEnvio.errosProcessamento) {
        listaErros.push(
          ...ultimoEnvio.errosProcessamento.map(
            erro =>
              new ErroEnvioOcorrencia(
                uniqid(),
                `Erro de processamento (${erro.codMensagem})`,
                erro.descricao,
                erro.localizacao
              )
          )
        );
      }

      return listaErros;
    }
  }
}
