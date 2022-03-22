import { Grid } from "@mui/material";
import { useParams } from "react-router-dom";
import { useDetalheOcorrencia } from "../../api/ESocialJTServiceApi";
import ArquivarButton from "../../components/arquivar/ArquivarButton";
import DataPanel from "../../components/data/DataPanel";
import LabelEstado from "../../components/estado/LabelEstado";
import JsonPanel from "../../components/json-panel/JsonPanel";
import Page from "../../components/layout/page/Page";
import ErrosProcessamento from "../../components/ocorrencia/ErrosProcessamento";
import PageHeader from "../../components/page-header/PageHeader";
import Voltar from "../../components/voltar/Voltar";
import { getDataGeracao, getTitulo } from "../../shared/ocorrenciaUtil";

function EventoDetalhePage() {
  const { id } = useParams();

  const { data: ocorrencia = {}, isLoading } = useDetalheOcorrencia(id);
  return (
    <Page>
      <DataPanel loading={isLoading}>
        <PageHeader
          primary={getTitulo(ocorrencia)}
          secondary={getDataGeracao(ocorrencia.dataRecebimento)}
          commands={[
            <ArquivarButton ocorrencia={ocorrencia} />,
            <LabelEstado
              estado={ocorrencia.evento && ocorrencia.evento.estado}
            />,
            <Voltar />
          ]}
        />
        <Grid container spacing={2}>
          <Grid item xs={12}>
            <ErrosProcessamento ocorrencia={ocorrencia} />
          </Grid>
          <Grid item xs={12}>
            <JsonPanel
              primary="Dados enviados"
              secondary="Estrutura de dados enviada para o eSocial"
              src={ocorrencia.dadosOcorrencia}
            />
          </Grid>
          {ocorrencia.evento && (
            <Grid item xs={12}>
              <JsonPanel
                primary="Dados do evento"
                secondary="Informações complementares sobre o evento, como número do recibo e lote"
                src={ocorrencia.evento}
                collapsed
              />
            </Grid>
          )}
        </Grid>
      </DataPanel>
    </Page>
  );
}

export default EventoDetalhePage;
