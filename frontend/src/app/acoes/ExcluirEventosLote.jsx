import { useState } from "react";
import {
  Dialog,
  DialogTitle,
  DialogContent,
  DialogActions,
  Button,
  Grid,
  TextField
} from "@mui/material";
import { useDialog } from "muibox";
import TipoEvento from "../../components/tipo-evento/TipoEvento";
import { useBuscarIds, useExcluirLista } from "../../api/ESocialJTServiceApi";
import useFeedback from "../../components/feedback/useFeedback";

function ExcluirEventosLote({ open, onClose }) {
  const [tipo, setTipo] = useState("");
  const [periodoApuracao, setPeriodoApuracao] = useState("");
  const [cpfs, setCpfs] = useState("");
  const buscarIds = useBuscarIds();
  const excluirLista = useExcluirLista();
  const { showInfo, showError, showSuccess } = useFeedback();
  const dialog = useDialog();

  function handleCpfsChange(e) {
    const value = e.target.value?.replace(/[^0-9\n]/g, "");
    setCpfs(value);
  }

  async function handleConsultar() {
    if (!tipo) {
      showError("O campo Tipo é obrigatório");
      return;
    }

    if (!periodoApuracao) {
      showError("O campo Período de Apuração é obrigatório");
      return;
    }

    const cpfList = cpfs
      .split("\n")
      .map((cpf) => cpf.trim())
      .filter((cpf) => cpf.length > 0);

    const filtros = {
      estados: [3],
      tipos: tipo ? [parseInt(tipo)] : [],
      cpf: cpfList,
      periodoApuracao: periodoApuracao ? [periodoApuracao] : []
    };

    try {
      const response = await buscarIds.mutateAsync(filtros);
      const ids = response.data;

      if (ids && ids.length > 0) {
        const mensagem =
          ids.length === 1
            ? "Foi encontrado 1 registro. Confirmar exclusão?"
            : `Foram encontrados ${ids.length} registros. Confirmar exclusão?`;

        try {
          await dialog.confirm({
            title: mensagem,
            ok: { text: "CONFIRMAR", color: "primary" },
            cancel: { text: "CANCELAR", color: "primary" }
          });

          await excluirLista.mutateAsync(ids);
          showSuccess(
            `${ids.length} registro${ids.length > 1 ? "s" : ""} enviado${
              ids.length > 1 ? "s" : ""
            } para exclusão`
          );
          onClose();
        } catch (error) {
          // ignore
        }
      } else {
        showInfo("Nenhum registro encontrado com os filtros especificados.");
      }
    } catch (error) {
      showError(
        "Erro ao buscar registros: " + (error.message || "Erro desconhecido")
      );
    }
  }

  return (
    <Dialog open={open} onClose={onClose} maxWidth="sm" fullWidth>
      <DialogTitle>Excluir Eventos em Lote</DialogTitle>
      <DialogContent>
        <Grid container spacing={2} sx={{ mt: 1 }}>
          <Grid item xs={6}>
            <TipoEvento
              value={tipo}
              onChange={(event) => setTipo(event.target.value)}
              apenasEventosPeriodicos={true}
              required
            />
          </Grid>
          <Grid item xs={6}>
            <TextField
              fullWidth
              size="small"
              label="Período de Apuração"
              value={periodoApuracao}
              onChange={(event) => setPeriodoApuracao(event.target.value)}
              helperText="Exemplo: 2025-12 ou 2025"
              required
            />
          </Grid>
          <Grid item xs={12}>
            <TextField
              fullWidth
              multiline
              size="small"
              label="CPFs (um por linha)"
              value={cpfs}
              onChange={handleCpfsChange}
              rows={4}
              helperText="Se vazio, buscará para todos os CPFs"
            />
          </Grid>
        </Grid>
      </DialogContent>
      <DialogActions>
        <Button onClick={onClose}>Cancelar</Button>
        <Button
          onClick={handleConsultar}
          variant="contained"
          disabled={
            buscarIds.isLoading ||
            excluirLista.isLoading ||
            !tipo ||
            !periodoApuracao
          }
        >
          {buscarIds.isLoading || excluirLista.isLoading
            ? "Processando..."
            : "Consultar"}
        </Button>
      </DialogActions>
    </Dialog>
  );
}

export default ExcluirEventosLote;
