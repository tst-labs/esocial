import React, { Fragment } from "react";
import { Menu, Responsive } from "semantic-ui-react";

import AcoesProducaoRestrita from "./AcoesProducaoRestrita";

function ListaAcoes() {
  return (
    <Responsive as={Fragment} minWidth={768}>
      <Menu.Item position="right">
        <AcoesProducaoRestrita />
      </Menu.Item>
    </Responsive>
  );
}

export default ListaAcoes;
