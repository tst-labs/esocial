import React from "react";
import { Label } from "semantic-ui-react";
import { estadoShape } from "../../models/ocorrencia/EstadoOcorrencia";

function LabelEstadoOcorrencia({ estado }) {
  return <Label color={estado.cor}>{estado.descricao}</Label>;
}

LabelEstadoOcorrencia.propTypes = {
  estado: estadoShape
};

export default LabelEstadoOcorrencia;
