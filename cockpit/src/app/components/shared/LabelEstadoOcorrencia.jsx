import React from "react";
import { Label } from "semantic-ui-react";

function LabelEstadoOcorrencia({ estado }) {
  return <Label color={estado.cor}>{estado.descricao}</Label>;
}

export default LabelEstadoOcorrencia;
