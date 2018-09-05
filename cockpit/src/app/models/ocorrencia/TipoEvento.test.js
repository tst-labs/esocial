import TipoEvento from "./TipoEvento";
import {
  criarOcorrenciaApiBasicaFalsa,
  criarOcorrenciaDetalhadaFalsa
} from "./_test-utils";

describe("TipoEvento", () => {
  test("deve ser criado a partir de ocorrencia básica", () => {
    const ocorrencia = criarOcorrenciaApiBasicaFalsa();
    const tipoEvento = TipoEvento.criarComDadosApi(ocorrencia);
    expect(tipoEvento).not.toBeNull();
  });

  test("deve ser criado a partir de ocorrencia detalhada", () => {
    const ocorrencia = criarOcorrenciaDetalhadaFalsa();
    const tipoEvento = TipoEvento.criarComDadosApi(ocorrencia);
    expect(tipoEvento).not.toBeNull();
  });

  test("deve exibir descricao de ocorrencia", () => {
    const ocorrencia = criarOcorrenciaApiBasicaFalsa();
    const tipoEvento = TipoEvento.criarComDadosApi(ocorrencia);
    expect(tipoEvento.descricao).not.toBeNull();
  });

  test("deve exibir descricao de ocorrencia mesmo se dado for nulo", () => {
    const ocorrencia = criarOcorrenciaApiBasicaFalsa(1, 1, null);
    const tipoEvento = TipoEvento.criarComDadosApi(ocorrencia);
    expect(tipoEvento.descricao).not.toBeNull();
  });
});
