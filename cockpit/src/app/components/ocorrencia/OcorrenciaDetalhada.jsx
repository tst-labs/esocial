import React from "react";
import { Grid, Menu } from "semantic-ui-react";

import BaseLayout from "../layout/BaseLayout";
import BotaoFechar from "../shared/BotaoFechar";
import DadosBasicos from "./parts/DadosBasicos";
import DadosEnviados from "./parts/DadosEnviados";
import DadosEnviadosFormatado from "./parts/DadosEnviadosFormatado";
import DadosEvento from "./parts/DadosEvento";
import ErrosEnvio from "./parts/ErrosEnvio";

import ErroOcorrencia from "../../models/ocorrencia/ErroOcorrencia";

function exibirErrosUltimoEnvio(ocorrencia) {
  const errosUltimoEnvio = ErroOcorrencia.listarErrosOcorrenciaUltimoEnvio(
    ocorrencia
  );
  if (errosUltimoEnvio && errosUltimoEnvio.length > 0) {
    return (
      <Grid.Row>
        <Grid.Column width={16}>
          <ErrosEnvio erros={errosUltimoEnvio} />
        </Grid.Column>
      </Grid.Row>
    );
  } else {
    return null;
  }
}

export default function({ ocorrencia }) {
  return (
    <BaseLayout
      menuItems={
        <Menu.Item position="right">
          <BotaoFechar />
        </Menu.Item>
      }
    >
      <Grid.Row>
        <Grid.Column width={16}>
          <DadosBasicos ocorrencia={ocorrencia} />
        </Grid.Column>
      </Grid.Row>
      {exibirErrosUltimoEnvio(ocorrencia)}
      <Grid.Row>
        <Grid.Column width={16}>
          <DadosEnviadosFormatado dados={ocorrencia.dados} />
        </Grid.Column>
      </Grid.Row>
      <Grid.Row>
        <Grid.Column width={16}>
          <DadosEnviados ocorrencia={ocorrencia} />
        </Grid.Column>
      </Grid.Row>
      <Grid.Row>
        <Grid.Column width={16}>
          <DadosEvento ocorrencia={ocorrencia} />
        </Grid.Column>
      </Grid.Row>
    </BaseLayout>
  );
}
