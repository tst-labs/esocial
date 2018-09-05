import React from "react";
import { Table } from "semantic-ui-react";
import Ocorrencia from "../../../models/ocorrencia/Ocorrencia";
import { ItemTabelaOcorrencia } from "./TabelaOcorrencias.parts";

export default function TabelaOcorrencias({ ocorrencias, cor }) {
  return (
    <Table color={cor} selectable>
      <Table.Header>
        <Table.Row>
          <Table.HeaderCell width={1}>ID</Table.HeaderCell>
          <Table.HeaderCell>Tipo</Table.HeaderCell>
          <Table.HeaderCell width={2}>Data geração</Table.HeaderCell>
          <Table.HeaderCell width={3} textAlign="center">
            Situação
          </Table.HeaderCell>
          <Table.HeaderCell width={1}>Ações</Table.HeaderCell>
        </Table.Row>
      </Table.Header>

      <Table.Body>
        {ocorrencias.sort(Ocorrencia.sort).map(ocorrencia => (
          <ItemTabelaOcorrencia key={ocorrencia.id} ocorrencia={ocorrencia} />
        ))}
      </Table.Body>
    </Table>
  );
}
