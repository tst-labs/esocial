import React, { Fragment } from "react";
import { Menu, Responsive } from "semantic-ui-react";

import AcoesProducaoRestrita from "./AcoesProducaoRestrita";
import AcoesCarregarDados from "./AcoesCarregarDados";

function ListaAcoes() {
  return (
    <Responsive as={Fragment} minWidth={768}>
      <Menu.Item position="right">
        <AcoesCarregarDados />
        <AcoesProducaoRestrita />
      </Menu.Item>
    </Responsive>
  );
}

export default ListaAcoes;
