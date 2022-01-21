import { Grid } from "@mui/material";
import { useNavigate } from "react-router-dom";
import { useOcorrenciasPaginado } from "../../api/ESocialJTServiceApi";
import DataPanel from "../../components/data/DataPanel";
import Page from "../../components/layout/page/Page";
import PainelOcorrencias from "../../components/ocorrencia/PainelOcorrencias";
import PageHeader from "../../components/page-header/PageHeader";
import { useNumericQueryParam } from "../../shared/useQueryParam";
import Paginacao from "./Paginacao";

function EventosPage() {
  const page = useNumericQueryParam("page");
  const navigate = useNavigate();

  const { data: pagina, isLoading } = useOcorrenciasPaginado(page);
  const { content: ocorrencias } = pagina;

  if ((pagina.totalPages > 0 && page >= pagina.totalPages) || page < 0) {
    navigate("/");
  }

  return (
    <Page>
      <PageHeader
        primary="Eventos"
        secondary="Nesta página é possível visualizar informações de todos eventos enviados para o eSocial"
      />
      <DataPanel
        loading={isLoading}
        isEmpty={pagina.empty}
        emptyMessage="Nenhum evento enviado para o eSocial"
        paperEmptyPanel
      >
        <Grid container justifyContent="space-between">
          <Grid item></Grid>
          <Grid item></Grid>
          <Paginacao pagina={pagina} page={page} />
        </Grid>

        <PainelOcorrencias ocorrencias={ocorrencias} page={page} />

        <Grid container justifyContent="space-between">
          <Grid item></Grid>
          <Grid item></Grid>
          <Paginacao pagina={pagina} page={page} />
        </Grid>
      </DataPanel>
    </Page>
  );
}

export default EventosPage;
