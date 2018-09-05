import React from "react";
import { Segment, Label, Popup, Container } from "semantic-ui-react";

import Ocorrencia from "../../../models/ocorrencia/Ocorrencia";

function segmentProps(color, selected, props) {
  return {
    size: "large",
    color,
    inverted: selected,
    style: { cursor: "pointer" },
    ...props
  };
}

function ItemSumarioOcorrenciaPorEstado({
  estado,
  ocorrencias,
  selected,
  onClick,
  ...props
}) {
  const segment = (
    <Segment
      {...segmentProps(estado.cor, selected, props)}
      onClick={() => onClick(estado)}
      textAlign="center"
    >
      <span>{estado.descricao}</span>
      <Label color={estado.cor} floating>
        {Ocorrencia.filtrarListaPorEstado(ocorrencias, estado).length}
      </Label>
    </Segment>
  );
  return (
    <Container fluid>
      <Popup
        inverted
        trigger={segment}
        content={
          selected
            ? "Clique para desativar filtro"
            : `Clique para filtrar por estado ${estado.descricao.toLowerCase()}`
        }
      />
    </Container>
  );
}

export default ItemSumarioOcorrenciaPorEstado;
