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
import TipoEvento from "../../components/tipo-evento/TipoEvento";

function ExcluirEventosLote({ open, onClose }) {
  const [tipo, setTipo] = useState("");
  const [periodoApuracao, setPeriodoApuracao] = useState("");
  const [cpfs, setCpfs] = useState("");

  function handleCpfsChange(e) {
    const value = e.target.value?.replace(/[^0-9\n]/g, "");
    setCpfs(value);
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
            />
          </Grid>
        </Grid>
      </DialogContent>
      <DialogActions>
        <Button onClick={onClose}>Cancelar</Button>
      </DialogActions>
    </Dialog>
  );
}

export default ExcluirEventosLote;
