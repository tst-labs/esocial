import React from "react";
import { Segment } from "semantic-ui-react";

export default function TipoNaoIdentificado({ dados }) {
  return <Segment>Tipo {dados ? dados.tipo : ""} não identificado</Segment>;
}
