import { useState } from "react";
import { Button, Menu, MenuItem } from "@mui/material";
import ExcluirEventosLote from "./ExcluirEventosLote";

function Acoes() {
  const [anchorEl, setAnchorEl] = useState(null);
  const [openDialog, setOpenDialog] = useState(false);
  const open = Boolean(anchorEl);

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
      >
        <MenuItem onClick={handleExcluirLote}>Excluir eventos em lote</MenuItem>
      </Menu>
      <ExcluirEventosLote open={openDialog} onClose={handleCloseDialog} />
    </>
  );
}

export default Acoes;
