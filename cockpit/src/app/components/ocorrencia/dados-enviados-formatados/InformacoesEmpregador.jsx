import { object } from "prop-types";

import React from "react";
import { Table } from "semantic-ui-react";

function InformacoesEmpregador({ dados }) {
  return (
    <Table celled textAlign="center">
      <Table.Header>
        <Table.Row>
          <Table.HeaderCell>Nr Insc</Table.HeaderCell>
          <Table.HeaderCell>Validade</Table.HeaderCell>
        </Table.Row>
      </Table.Header>
      <Table.Body>
        <Table.Row>
          <Table.Cell>{dados.ideEmpregador.nrInsc}</Table.Cell>
          <Table.Cell>
            {dados.infoEmpregador.idePeriodo.iniValid} até{" "}
            {dados.infoEmpregador.idePeriodo.fimValid || "indefinidamente"}
          </Table.Cell>
        </Table.Row>
      </Table.Body>
    </Table>
  );
}

InformacoesEmpregador.propTypes = {
  dados: object,
};

export default InformacoesEmpregador;
