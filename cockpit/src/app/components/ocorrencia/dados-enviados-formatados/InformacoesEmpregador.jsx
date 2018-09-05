import React from "react";
import { Table } from "semantic-ui-react";

export default function InformacoesEmpregador({ dados }) {
  return (
    <Table celled textAlign="center">
      <Table.Header>
        <Table.Row>
          <Table.HeaderCell>Razão Social</Table.HeaderCell>
          <Table.HeaderCell>Contato</Table.HeaderCell>
          <Table.HeaderCell>Validade</Table.HeaderCell>
        </Table.Row>
      </Table.Header>
      <Table.Body>
        <Table.Row>
          <Table.Cell>{dados.infoEmpregador.infoCadastro.nmRazao}</Table.Cell>
          <Table.Cell>
            {dados.infoEmpregador.infoCadastro.contato.nmCtt}
          </Table.Cell>
          <Table.Cell>
            {dados.infoEmpregador.idePeriodo.iniValid} até{" "}
            {dados.infoEmpregador.idePeriodo.fimValid || "indefinidamente"}
          </Table.Cell>
        </Table.Row>
      </Table.Body>
    </Table>
  );
}
