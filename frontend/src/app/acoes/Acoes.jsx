import { useState } from "react";
import { Button, Menu, MenuItem } from "@mui/material";
import { useDialog } from "muibox";
import ExcluirEventosLote from "./ExcluirEventosLote";
import EnviarJson from "./EnviarJson";
import {
  useArquivarErros,
  useArquivarExcluidosRetificados
} from "../../api/ESocialJTServiceApi";
import useFeedback from "../../components/feedback/useFeedback";

function Acoes() {
  const [anchorEl, setAnchorEl] = useState(null);
  const [openDialog, setOpenDialog] = useState(false);
  const [openEnviarJson, setOpenEnviarJson] = useState(false);
  const open = Boolean(anchorEl);
  const dialog = useDialog();
  const arquivarErros = useArquivarErros();
  const arquivarExcluidosRetificados = useArquivarExcluidosRetificados();
  const { showError } = useFeedback();

  const handleClick = (event) => {
    setAnchorEl(event.currentTarget);
  };

  const handleClose = () => {
    setAnchorEl(null);
  };

  const handleExcluirLote = () => {
    handleClose();
    setOpenDialog(true);
  };

  const handleCloseDialog = () => {
    setOpenDialog(false);
  };

  const handleEnviarJson = () => {
    handleClose();
    setOpenEnviarJson(true);
  };

  const handleCloseEnviarJson = () => {
    setOpenEnviarJson(false);
  };

  const handleArquivarErros = async () => {
    handleClose();
    try {
      await dialog.confirm({
        title: "Confirmar arquivamento",
        message:
          "Deseja arquivar todos os eventos com estado PROCESSADO_COM_ERRO ou ERRO?",
        ok: { text: "CONFIRMAR", color: "primary" },
        cancel: { text: "CANCELAR", color: "primary" }
      });

      await arquivarErros.mutateAsync();
    } catch (error) {
      if (error?.message && error.message !== "cancel") {
        showError("Erro ao arquivar eventos: " + error.message);
      }
    }
  };

  const handleArquivarExcluidosRetificados = async () => {
    handleClose();
    try {
      await dialog.confirm({
        title: "Confirmar arquivamento",
        message:
          "Deseja arquivar todos os eventos que foram excluídos ou retificados?",
        ok: { text: "CONFIRMAR", color: "primary" },
        cancel: { text: "CANCELAR", color: "primary" }
      });

      await arquivarExcluidosRetificados.mutateAsync();
    } catch (error) {
      if (error?.message && error.message !== "cancel") {
        showError("Erro ao arquivar eventos: " + error.message);
      }
    }
  };

  return (
    <>
      <Button
        variant="outlined"
        size="small"
        onClick={handleClick}
        aria-controls={open ? "acoes-menu" : undefined}
        aria-haspopup="true"
        aria-expanded={open ? "true" : undefined}
      >
        Ações
      </Button>
      <Menu
        id="acoes-menu"
        anchorEl={anchorEl}
        open={open}
        onClose={handleClose}
        MenuListProps={{
          "aria-labelledby": "acoes-button"
        }}
        anchorOrigin={{
          vertical: "bottom",
          horizontal: "right"
        }}
        transformOrigin={{
          vertical: "top",
          horizontal: "right"
        }}
      >
        <MenuItem onClick={handleExcluirLote}>Excluir eventos em lote</MenuItem>
        <MenuItem onClick={handleEnviarJson}>Enviar JSON manualmente</MenuItem>
        <MenuItem onClick={handleArquivarErros}>
          Arquivar todos eventos com ERRO
        </MenuItem>
        <MenuItem onClick={handleArquivarExcluidosRetificados}>
          Arquivar todos eventos Excluídos ou Retificados
        </MenuItem>
      </Menu>
      <ExcluirEventosLote open={openDialog} onClose={handleCloseDialog} />
      <EnviarJson open={openEnviarJson} onClose={handleCloseEnviarJson} />
    </>
  );
}

export default Acoes;
