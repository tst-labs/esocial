import {
  Button,
  Chip,
  Dialog,
  DialogActions,
  DialogContent,
  DialogTitle,
  Grid,
  MenuItem
} from "@mui/material";
import { useState } from "react";
import {
  useESocialGovStatus,
  useESocialJTStatus
} from "../../api/ESocialJTServiceApi";

function Status({ onClose }) {
  const eSocialJTStatus = useESocialJTStatus();
  const eSocialGovStatus = useESocialGovStatus();

  const [open, setOpen] = useState(false);

  function handleClick() {
    setOpen(true);
  }

  function handleClose() {
    setOpen(true);
    onClose();
  }

  return (
    <>
      <MenuItem onClick={handleClick}>Status do sistema</MenuItem>
      <Dialog open={open} onClose={handleClose}>
        <DialogTitle>Status do Sistema</DialogTitle>
        <DialogContent>
          <Grid container spacing={1}>
            <Grid item xs={6}>
              esocial-jt-service:
            </Grid>
            <Grid item xs={6}>
              <StatusChip status={eSocialJTStatus} />
            </Grid>
            <Grid item xs={6}>
              esocial-gov:
            </Grid>
            <Grid item xs={6}>
              <StatusChip status={eSocialGovStatus} />
            </Grid>
          </Grid>
        </DialogContent>
        <DialogActions>
          <Button onClick={handleClose} autoFocus>
            Fechar
          </Button>
        </DialogActions>
      </Dialog>
    </>
  );
}

function StatusChip({ status }) {
  const { data, error, isLoading } = status;

  if (isLoading) {
    return <Chip size="small" variant="outlined" label="Loading..." />;
  }

  if (error) {
    return <Chip size="small" variant="outlined" label="Error" color="error" />;
  }

  return (
    <Chip
      variant="outlined"
      size="small"
      label={data.status}
      color={data.status === "UP" ? "success" : "error"}
    />
  );
}

export default Status;
