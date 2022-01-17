import { Button, Container, Grid } from "@mui/material";
import AppBar from "@mui/material/AppBar";
import Toolbar from "@mui/material/Toolbar";
import React from "react";
import { Link } from "react-router-dom";
import { NOME_APP, PRODUCAO_RESTRITA } from "../../shared/env";
import HeaderMenu from "./HeaderMenu";

const isProducaoRestrita = PRODUCAO_RESTRITA === "S";

function Header({ maxWidth = "md" }) {
  return (
    <>
      <AppBar
        position="fixed"
        elevation={0}
        sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}
      >
        <Toolbar>
          <Container maxWidth={maxWidth}>
            <Grid container justifyContent="space-between" alignItems="center">
              <Grid item>
                <Button
                  component={Link}
                  to="/"
                  sx={{
                    textTransform: "none",
                    color: "white",
                    fontSize: "1.25rem",
                    fontWeight: 500,
                    height: 40
                  }}
                >
                  {NOME_APP} {isProducaoRestrita && " (Produção Restrita)"}
                </Button>
              </Grid>
              <Grid item>
                <HeaderMenu />
              </Grid>
            </Grid>
          </Container>
        </Toolbar>
      </AppBar>
    </>
  );
}

export default Header;
