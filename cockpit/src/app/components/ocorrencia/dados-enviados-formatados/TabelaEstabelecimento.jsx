import React from "react";
import { Table } from "semantic-ui-react";

export default function TabelaEstabelecimento({ dados }) {
  return (
    <Table celled textAlign="center">
      <Table.Header>
        <Table.Row>
          <Table.HeaderCell>CNPJ</Table.HeaderCell>
          <Table.HeaderCell>CNAE</Table.HeaderCell>
          <Table.HeaderCell>Validade</Table.HeaderCell>
        </Table.Row>
      </Table.Header>
      <Table.Body>
        <Table.Row>
          <Table.Cell>{dados.infoEstab.ideEstab.nrInsc}</Table.Cell>
          <Table.Cell>{dados.infoEstab.dadosEstab.cnaePrep}</Table.Cell>
          <Table.Cell>
            {dados.infoEstab.ideEstab.iniValid} até{" "}
            {dados.infoEstab.ideEstab.fimValid || "indefinidamente"}
          </Table.Cell>
        </Table.Row>
      </Table.Body>
    </Table>
  );
}
