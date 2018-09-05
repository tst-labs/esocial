import React from "react";
import { Table } from "semantic-ui-react";

import LabelEstadoOcorrencia from "../../shared/LabelEstadoOcorrencia";

function DadosBasicos({ ocorrencia }) {
  return (
    <Table celled textAlign="center">
      <Table.Header>
        <Table.Row>
          <Table.HeaderCell>Estado</Table.HeaderCell>
          <Table.HeaderCell>Identificador</Table.HeaderCell>
          <Table.HeaderCell>Tipo</Table.HeaderCell>
          <Table.HeaderCell>Operação</Table.HeaderCell>
          <Table.HeaderCell>Data</Table.HeaderCell>
          <Table.HeaderCell>Data recebimento</Table.HeaderCell>
          <Table.HeaderCell>Ref.</Table.HeaderCell>
        </Table.Row>
      </Table.Header>
      <Table.Body>
        <Table.Row>
          <Table.Cell>
            <LabelEstadoOcorrencia estado={ocorrencia.estado} />
          </Table.Cell>
          <Table.Cell>{ocorrencia.id}</Table.Cell>
          <Table.Cell>{ocorrencia.tipoEvento.descricaoCompleta}</Table.Cell>
          <Table.Cell>{ocorrencia.operacao}</Table.Cell>
          <Table.Cell>{ocorrencia.textoData}</Table.Cell>
          <Table.Cell>{ocorrencia.textoDataRecebimento}</Table.Cell>
          <Table.Cell>{ocorrencia.referencia}</Table.Cell>
        </Table.Row>
      </Table.Body>
    </Table>
  );
}

export default DadosBasicos;
