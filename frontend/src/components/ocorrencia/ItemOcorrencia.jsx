import { Box, Button, Grid, Paper, Typography } from "@mui/material";
import { Link } from "react-router-dom";
import { getDataGeracao, getTitulo } from "../../shared/ocorrenciaUtil";
import LabelEstado from "../estado/LabelEstado";

function ItemOcorrencia({ ocorrencia }) {
  return (
    <Box padding={2} marginBottom={2} component={Paper}>
      <Grid container justifyContent="space-between" alignItems="center">
        <Grid item xs={7}>
          <Typography variant="h6" sx={{ fontSize: "1rem" }}>
            {getTitulo(ocorrencia)}
          </Typography>
          <Typography variant="body2">
            {getDataGeracao(ocorrencia.data)}
          </Typography>
        </Grid>
        <Grid item>
          <LabelEstado estado={ocorrencia.estadoEvento} />
          <Button
            variant="outlined"
            size="small"
            color="primary"
            component={Link}
            to={`/eventos/${ocorrencia.id}`}
          >
            Ver mais
          </Button>
        </Grid>
      </Grid>
    </Box>
  );
}

export default ItemOcorrencia;
