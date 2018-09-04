import React from "react";
import { Popup, Icon, Button, Table } from "semantic-ui-react";
import { Link } from "react-router-dom";
import LabelEstadoOcorrencia from "../../shared/LabelEstadoOcorrencia";

function BotaoVisualizarOcorrencia({ ocorrencia }) {
  return (
    <Popup
      inverted
      trigger={
        <Button
          as={Link}
          target="_blank"
          to={`/ocorrencia/${ocorrencia.id}`}
          icon={<Icon name="eye" />}
        />
      }
      content="Visualizar detalhes"
      position="top center"
    />
  );
}

export function ItemTabelaOcorrencia({ ocorrencia }) {
  return (
    <Table.Row key={ocorrencia.id}>
      <Table.Cell>{ocorrencia.id}</Table.Cell>
      <Table.Cell>{ocorrencia.tipoEvento.descricaoCompleta}</Table.Cell>
      <Table.Cell>{ocorrencia.textoData}</Table.Cell>
      <Table.Cell textAlign="center">
        <LabelEstadoOcorrencia estado={ocorrencia.estado} />
      </Table.Cell>
      <Table.Cell>
        <BotaoVisualizarOcorrencia ocorrencia={ocorrencia} />
      </Table.Cell>
    </Table.Row>
  );
}
