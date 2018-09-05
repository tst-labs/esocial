import React from "react";
import { Table } from "semantic-ui-react";

export default function TabelaLotacao({ dados }) {
  return (
    <Table celled textAlign="center">
      <Table.Header>
        <Table.Row>
          <Table.HeaderCell>Tipo</Table.HeaderCell>
          <Table.HeaderCell>Código</Table.HeaderCell>
          <Table.HeaderCell>Validade</Table.HeaderCell>
        </Table.Row>
      </Table.Header>
      <Table.Body>
        <Table.Row>
          <Table.Cell>{dados.infoLotacao.dadosLotacao.tpLotacao}</Table.Cell>
          <Table.Cell>{dados.infoLotacao.ideLotacao.codLotacao}</Table.Cell>
          <Table.Cell>
            {dados.infoLotacao.ideLotacao.iniValid} até{" "}
            {dados.infoLotacao.ideLotacao.fimValid || "indefinidamente"}
          </Table.Cell>
        </Table.Row>
      </Table.Body>
    </Table>
  );
}
