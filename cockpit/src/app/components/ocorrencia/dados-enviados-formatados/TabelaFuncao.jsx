import React from "react";
import { Table } from "semantic-ui-react";

export default function TabelaFuncao({ dados }) {
  return (
    <Table celled textAlign="center">
      <Table.Header>
        <Table.Row>
          <Table.HeaderCell>Nome</Table.HeaderCell>
          <Table.HeaderCell>CBO</Table.HeaderCell>
          <Table.HeaderCell>Código</Table.HeaderCell>
          <Table.HeaderCell>Validade</Table.HeaderCell>
        </Table.Row>
      </Table.Header>
      <Table.Body>
        <Table.Row>
          <Table.Cell>{dados.infoFuncao.dadosFuncao.dscFuncao}</Table.Cell>
          <Table.Cell>{dados.infoFuncao.dadosFuncao.codCBO}</Table.Cell>
          <Table.Cell>{dados.infoFuncao.ideFuncao.codFuncao}</Table.Cell>
          <Table.Cell>
            {dados.infoFuncao.ideFuncao.iniValid} até{" "}
            {dados.infoFuncao.ideFuncao.fimValid || "indefinidamente"}
          </Table.Cell>
        </Table.Row>
      </Table.Body>
    </Table>
  );
}
