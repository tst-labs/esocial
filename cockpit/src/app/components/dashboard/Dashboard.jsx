import { arrayOf, func, string } from "prop-types";
import { ocorrenciaShape } from "../../models/ocorrencia/Ocorrencia";

import React, { Fragment } from "react";
import { Menu } from "semantic-ui-react";

import BaseRow from "../layout/BaseRow";
import BaseLayout from "../layout/BaseLayout";
import ListaAcoes from "./acoes/ListaAcoes";
import SumarioOcorrencias from "./sumario/SumarioOcorrencias";
import PesquisaOcorrencias from "./pesquisa/PesquisaOcorrencias";
import StatusEsocialJt from "./status/StatusEsocialJt";
import StatusEsocialGov from "./status/StatusEsocialGov";
import StatusConector from "./status/StatusConector";

function MenuItems() {
  return (
    <Fragment>
      <Menu.Item>
        <StatusEsocialJt />
        <StatusEsocialGov />
        <StatusConector />
      </Menu.Item>
      <ListaAcoes />
    </Fragment>
  );
}

function Dashboard({ ocorrencias, onSelectSumario, filtroEstado }) {
  return (
    <BaseLayout menuItems={<MenuItems />}>
      <SumarioOcorrencias
        ocorrencias={ocorrencias}
        onSelectSumario={onSelectSumario}
      />
      <BaseRow>
        <PesquisaOcorrencias
          ocorrencias={ocorrencias}
          filtroEstado={filtroEstado}
        />
      </BaseRow>
    </BaseLayout>
  );
}

Dashboard.propTypes = {
  ocorrencias: arrayOf(ocorrenciaShape),
  onSelectSumario: func,
  filtroEstado: string
};

export default Dashboard;
