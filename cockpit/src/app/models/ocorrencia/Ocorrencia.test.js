import Ocorrencia from "./Ocorrencia";
import {
  criarOcorrenciaApiBasicaFalsa,
  criarOcorrenciaDetalhadaFalsa
} from "./_test-utils";
import { FILA, PROCESSAMENTO } from "./EstadoOcorrencia";

describe("Ocorrencia", () => {
  test("deve ser criado a partir de ocorrencia básica", () => {
    const ocorrencia = Ocorrencia.criarComDadosApi(
      criarOcorrenciaApiBasicaFalsa()
    );
    expect(ocorrencia).not.toBeNull();
  });

  test("deve filtrar qualquer informação da ocorrencia", () => {
    const ocorrencia = Ocorrencia.criarComDadosApi(
      criarOcorrenciaApiBasicaFalsa(665)
    );

    expect(ocorrencia.filtrarGenericamente("fila")).toBeTruthy();
    expect(ocorrencia.filtrarGenericamente("1040")).toBeTruthy();
    expect(ocorrencia.filtrarGenericamente("Tabela")).toBeTruthy();
    expect(ocorrencia.filtrarGenericamente("665")).toBeTruthy();
  });

  test("deve mostrar somente caso encontre informação da ocorrência", () => {
    const ocorrencia = Ocorrencia.criarComDadosApi(
      criarOcorrenciaApiBasicaFalsa(665)
    );

    expect(
      ocorrencia.filtrarGenericamente("string that should not be found")
    ).toBeFalsy();
  });

  test("deve filtrar por estado", () => {
    const ocorrencia = Ocorrencia.criarComDadosApi(
      criarOcorrenciaApiBasicaFalsa(665)
    );

    expect(ocorrencia.filtrarPorEstado(FILA)).toBeTruthy();
    expect(ocorrencia.filtrarPorEstado(PROCESSAMENTO)).toBeFalsy();
  });

  test("deve prover uma função de ordenação", () => {
    const ocorrencia1 = Ocorrencia.criarComDadosApi(
      criarOcorrenciaApiBasicaFalsa(1)
    );
    const ocorrencia2 = Ocorrencia.criarComDadosApi(
      criarOcorrenciaApiBasicaFalsa(2)
    );
    const ocorrencia3 = Ocorrencia.criarComDadosApi(
      criarOcorrenciaApiBasicaFalsa(3)
    );

    const ocorrencias = [ocorrencia1, ocorrencia3, ocorrencia2];
    ocorrencias.sort(Ocorrencia.sort);
    expect(ocorrencias[0].id).toBe(3);
    expect(ocorrencias[1].id).toBe(2);
    expect(ocorrencias[2].id).toBe(1);
  });

  test("deve ser criado a partir de ocorrencia detalhada", () => {
    const ocorrencia = Ocorrencia.criarComDadosApi(
      criarOcorrenciaDetalhadaFalsa()
    );
    expect(ocorrencia).not.toBeNull();
    expect(ocorrencia.tipoEvento).toBeTruthy();
    expect(ocorrencia.estado).toBeTruthy();
    expect(ocorrencia.data).toBeTruthy();
    expect(ocorrencia.dataRecebimento).toBeTruthy();
    expect(ocorrencia.operacao).toBeTruthy();
    expect(ocorrencia.referencia).toBeTruthy();
    expect(ocorrencia.dados).toBeTruthy();
    expect(ocorrencia.evento).toBeTruthy();
  });
});
