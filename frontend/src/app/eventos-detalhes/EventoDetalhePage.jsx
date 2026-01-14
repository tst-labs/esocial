import { Button, Grid } from "@mui/material";
import { useNavigate, useParams } from "react-router-dom";
import {
  useDetalheOcorrencia,
  useEnviarExclusao
} from "../../api/ESocialJTServiceApi";
import ArquivarButton from "../../components/arquivar/ArquivarButton";
import DataPanel from "../../components/data/DataPanel";
import LabelEstado from "../../components/estado/LabelEstado";
import JsonPanel from "../../components/json-panel/JsonPanel";
import Page from "../../components/layout/page/Page";
import ErrosProcessamento from "../../components/ocorrencia/ErrosProcessamento";
import PageHeader from "../../components/page-header/PageHeader";
import Voltar from "../../components/voltar/Voltar";
import { getDataGeracao, getTitulo } from "../../shared/ocorrenciaUtil";
import { useDialog } from "muibox";
import { useLoading } from "../../components/loading/LoadingProvider";
import useFeedback from "../../components/feedback/useFeedback";
import { PROCESSADO_COM_SUCESSO } from "../../shared/estados";

function EventoDetalhePage() {
  const { id } = useParams();
  const dialog = useDialog();
  const setLoading = useLoading();
  const enviarExclusao = useEnviarExclusao();
  const { showSuccess, showError } = useFeedback();
  const navigate = useNavigate();

  const { data: ocorrencia = {}, isLoading } = useDetalheOcorrencia(id);

  const codTipo = ocorrencia.evento?.tipoEvento?.codTipo;
  const permiteExcluir =
    ((codTipo >= 1200 && codTipo <= 1299) ||
      (codTipo >= 2200 && codTipo <= 2499)) &&
    ocorrencia?.evento?.estado?.id === PROCESSADO_COM_SUCESSO;

  async function handleExcluir() {
    await dialog.confirm({
      title: `Deseja enviar o evento de exclusão (S-3000) para este evento?`,
      ok: { text: "CONFIRMAR", color: "primary" },
      cancel: { text: "CANCELAR", color: "primary" }
    });
    setLoading(true);

    enviarExclusao.mutate(id, {
      onSuccess: () => {
        showSuccess(
          "Evento de exclusão enviado com sucesso. Verifique o retorno do eSocial."
        );
        navigate("/");
      },
      onError: showError,
      onSettled: () => setLoading(false)
    });
  }

  return (
    <Page>
      <DataPanel loading={isLoading}>
        <PageHeader
          primary={getTitulo(ocorrencia)}
          secondary={
            `ID: ${id} | ` + getDataGeracao(ocorrencia.dataRecebimento)
          }
          commands={[
            <ArquivarButton ocorrencia={ocorrencia} />,
            <LabelEstado estado={ocorrencia?.evento?.estado} />,
            <Voltar />
          ]}
          ocorrencia={ocorrencia}
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
          {permiteExcluir && (
            <Grid item xs={12}>
              <Button
                size="large"
                fullWidth
                variant="contained"
                color="error"
                onClick={handleExcluir}
              >
                Enviar Evento de Exclusão
              </Button>
            </Grid>
          )}
        </Grid>
      </DataPanel>
    </Page>
  );
}

export default EventoDetalhePage;
