import { Container, Toolbar } from "@mui/material";
import { styled } from "@mui/system";
import PropTypes from "prop-types";
import React from "react";
import { HABILITA_CABECALHO } from "../../../shared/env";
import Header from "../../header/Header";

const habilitaCabecalho = HABILITA_CABECALHO === "S";

const Root = styled("div")({
  display: "flex"
});

const Main = styled("main")(({ theme }) => ({
  flexGrow: 1,
  padding: habilitaCabecalho ? theme.spacing(0, 2, 12, 2) : 0
}));

function Page({ children, maxWidth = "md" }) {
  return (
    <Root>
      {habilitaCabecalho && <Header />}
      <Main>
        {habilitaCabecalho && <Toolbar />}
        <Container maxWidth={maxWidth} disableGutters={!habilitaCabecalho}>
          {children}
        </Container>
      </Main>
    </Root>
  );
}

Page.propTypes = {
  SidebarComponent: PropTypes.func,
  children: PropTypes.node.isRequired
};

export default Page;
