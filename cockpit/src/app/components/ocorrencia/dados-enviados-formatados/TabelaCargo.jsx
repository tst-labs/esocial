import React from "react";
import { Table } from "semantic-ui-react";

export default function TabelaCargo({ dados }) {
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
          <Table.Cell>{dados.infoCargo.dadosCargo.nmCargo}</Table.Cell>
          <Table.Cell>{dados.infoCargo.dadosCargo.codCBO}</Table.Cell>
          <Table.Cell>{dados.infoCargo.ideCargo.codCargo}</Table.Cell>
          <Table.Cell>
            {dados.infoCargo.ideCargo.iniValid} até{" "}
            {dados.infoCargo.ideCargo.fimValid || "indefinidamente"}
          </Table.Cell>
        </Table.Row>
      </Table.Body>
    </Table>
  );
}
