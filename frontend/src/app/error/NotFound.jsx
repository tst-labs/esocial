import React from "react";
import Page from "../../components/layout/page/Page";
import { Button, Box } from "@mui/material";
import { useNavigate } from "react-router-dom";
import PageHeader from "../../components/page-header/PageHeader";

function NotFound() {
  const navigate = useNavigate();
  return (
    <Page>
      <PageHeader
        primary="Desculpe, esta página não existe"
        secondary="Selecione uma opção no menu ou volte para a página anterior"
      />
      <Box marginTop={4}>
        <Button onClick={() => navigate(-1)} variant="outlined" color="primary">
          Voltar
        </Button>
      </Box>
    </Page>
  );
}
export default NotFound;
