import React, { Fragment } from "react";
import { Menu } from "semantic-ui-react";

import BaseRow from "../layout/BaseRow";
import BaseLayout from "../layout/BaseLayout";
import ListaAcoes from "./acoes/ListaAcoes";
import SumarioOcorrencias from "./sumario/SumarioOcorrencias";
import PesquisaOcorrencias from "./pesquisa/PesquisaOcorrencias";
import StatusEsocialJt from "./status/StatusEsocialJt";
import StatusEsocialGov from "./status/StatusEsocialGov";

function MenuItems() {
  return (
    <Fragment>
      <Menu.Item>
        <StatusEsocialJt />
        <StatusEsocialGov />
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

export default Dashboard;
