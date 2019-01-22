import { arrayOf, string } from "prop-types";

import React from "react";
import { Link } from "react-router-dom";

import { AutoSizer, Column, Table } from "react-virtualized";
import { Popup, Icon, Button } from "semantic-ui-react";

import Ocorrencia, {
  ocorrenciaShape
} from "../../../models/ocorrencia/Ocorrencia";
import LabelEstadoOcorrencia from "../../shared/LabelEstadoOcorrencia";

const style = {
  header: {
    textTransform: "none"
  }
};

function BotaoVisualizarOcorrencia({ id }) {
  return (
    <Popup
      inverted
      trigger={
        <Button
          as={Link}
          target="_blank"
          to={`/ocorrencia/${id}`}
          icon={<Icon name="eye" />}
        />
      }
      content="Visualizar detalhes"
      position="top center"
    />
  );
}

BotaoVisualizarOcorrencia.propTypes = {
  id: string
};

function TabelaOcorrencias({ ocorrencias }) {
  ocorrencias.sort(Ocorrencia.sort);

  return (
    <AutoSizer disableHeight>
      {({ width }) => (
        <Table
          width={width}
          height={550}
          headerHeight={50}
          headerStyle={style.header}
          rowHeight={60}
          rowCount={ocorrencias.length}
          rowGetter={({ index }) => ocorrencias[index]}
        >
          <Column width={100} label="ID" dataKey="id" />
          <Column
            width={900}
            label="Tipo"
            dataKey="tipoEvento"
            cellRenderer={({ cellData: tipoEvento }) =>
              tipoEvento.descricaoCompleta
            }
          />
          <Column width={200} label="Data geração" dataKey="textoData" />
          <Column
            width={300}
            label="Situação"
            dataKey="estado"
            cellRenderer={({ cellData: estado }) => (
              <LabelEstadoOcorrencia estado={estado} />
            )}
          />
          <Column
            width={100}
            label="Ações"
            dataKey="id"
            cellRenderer={({ cellData: id }) => (
              <BotaoVisualizarOcorrencia id={id} />
            )}
          />
        </Table>
      )}
    </AutoSizer>
  );
}

TabelaOcorrencias.propTypes = {
  ocorrencias: arrayOf(ocorrenciaShape)
};

export default TabelaOcorrencias;
