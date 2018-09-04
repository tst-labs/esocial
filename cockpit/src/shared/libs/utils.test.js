import { filter, filterAny } from "./utils";

describe("filter", () => {
  it("deve verificar se string possui outra string desconsiderando **case**", () => {
    expect(filter("searched string", "string")).toBeTruthy();
  });

  it("deve retornar falso caso não possua a string informada", () => {
    expect(filter("searched string", "abc")).toBeFalsy();
  });

  it("deve verificar se string possui outra string mesmo com **case** diferente", () => {
    expect(filter("searched string", "STRING")).toBeTruthy();
  });

  it("caso não exista string de busca deve retornar verdadeiro", () => {
    expect(filter("searched string", null)).toBeTruthy();
  });

  it("caso não exista string a ser buscada deve retornar verdadeiro", () => {
    expect(filter(null, "search")).toBeTruthy();
  });
});

describe("filterByAny", () => {
  it("deve retornar verdadeiro caso encontre pelo menos uma ocorrência", () => {
    expect(filterAny("string", "searched string", "abc")).toBeTruthy();
  });

  it("deve aceitar valor nulo porém ignora-lo como item pesquisado", () => {
    expect(filterAny("string", null, "string")).toBeTruthy();
    expect(filterAny("abc", null, "searched string")).toBeFalsy();
  });

  it("deve retornar verdadeiro sempre que filtro for nulo", () => {
    expect(filterAny(null, "string")).toBeTruthy();
  });

  it("deve retornar falso caso não encontre o termo em nenhuma string", () => {
    expect(
      filterAny("abc", "searched string", "other searched string")
    ).toBeFalsy();
  });
});
