import EstadoOcorrencia from "./EstadoOcorrencia";
import {
  criarOcorrenciaApiBasicaFalsa,
  criarOcorrenciaDetalhadaFalsa
} from "./_test-utils";

describe("EstadoOcorrencia", () => {
  test("deve ser criado a partir de ocorrencia básica", () => {
    const ocorrencia = criarOcorrenciaApiBasicaFalsa();
    const estadoOcorrencia = EstadoOcorrencia.criarComDadosApi(ocorrencia);
    expect(estadoOcorrencia).not.toBeNull();
  });

  test("deve ser criado a partir de ocorrencia detalhada", () => {
    const ocorrencia = criarOcorrenciaDetalhadaFalsa();
    const estadoOcorrencia = EstadoOcorrencia.criarComDadosApi(ocorrencia);
    expect(estadoOcorrencia).not.toBeNull();
  });

  test("deve obter cor e descricao a partir de ocorrencia", () => {
    const ocorrencia = criarOcorrenciaApiBasicaFalsa();
    const estadoOcorrencia = EstadoOcorrencia.criarComDadosApi(ocorrencia);
    expect(estadoOcorrencia.cor).not.toBeNull();
    expect(estadoOcorrencia.descricao).not.toBeNull();
  });

  test("deve obter cor e descricao a partir de ocorrencia com informações nulas", () => {
    const ocorrencia = criarOcorrenciaApiBasicaFalsa(1, null);
    const estadoOcorrencia = EstadoOcorrencia.criarComDadosApi(ocorrencia);
    expect(estadoOcorrencia.descricao).not.toBeNull();
    expect(estadoOcorrencia.cor).not.toBeNull();
  });
});
