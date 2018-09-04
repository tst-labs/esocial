import React from "react";
import { Table } from "semantic-ui-react";

export default function TabelaCarreira({ dados }) {
  return (
    <Table celled textAlign="center">
      <Table.Header>
        <Table.Row>
          <Table.HeaderCell>Nome</Table.HeaderCell>
          <Table.HeaderCell>Lei</Table.HeaderCell>
          <Table.HeaderCell>Código</Table.HeaderCell>
          <Table.HeaderCell>Validade</Table.HeaderCell>
        </Table.Row>
      </Table.Header>
      <Table.Body>
        <Table.Row>
          <Table.Cell>
            {dados.infoCarreira.dadosCarreira.dscCarreira}
          </Table.Cell>
          <Table.Cell>{dados.infoCarreira.dadosCarreira.leiCarr}</Table.Cell>
          <Table.Cell>{dados.infoCarreira.ideCarreira.codCarreira}</Table.Cell>
          <Table.Cell>
            {dados.infoCarreira.ideCarreira.iniValid} até{" "}
            {dados.infoCarreira.ideCarreira.fimValid || "indefinidamente"}
          </Table.Cell>
        </Table.Row>
      </Table.Body>
    </Table>
  );
}
