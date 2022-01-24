import { Box, Grid, Paper, Typography } from "@mui/material";
import { red } from "@mui/material/colors";

function ErrosProcessamento({ ocorrencia }) {
  if (
    !ocorrencia.evento ||
    !ocorrencia.evento.enviosEvento ||
    ocorrencia.evento.enviosEvento.length === 0
  ) {
    return null;
  }

  const { enviosEvento } = ocorrencia.evento;
  const ultimoEnvio = enviosEvento[enviosEvento.length - 1];

  if (
    !(
      (ultimoEnvio.errosProcessamento &&
        ultimoEnvio.errosProcessamento.length) ||
      ultimoEnvio.erroInterno
    )
  ) {
    return null;
  }

  ultimoEnvio.errosProcessamento.sort((a, b) => b.id - a.id);

  return (
    <Box component={Paper} padding={2} sx={{ backgroundColor: red[50] }}>
      <Typography variant="h6" sx={{ fontSize: "1rem" }} gutterBottom>
        Erros
      </Typography>
      <Grid container spacing={2}>
        {ultimoEnvio.errosProcessamento.map((erro) => (
          <Grid item key={erro.id}>
            <Typography variant="body2" sx={{ fontWeight: "bold" }}>
              Código: {erro.codMensagem}
            </Typography>
            <Typography variant="body2">{erro.descricao}</Typography>
            {erro.localizacao && (
              <Typography variant="body2">{erro.localizacao}</Typography>
            )}
          </Grid>
        ))}
        {ultimoEnvio.erroInterno && (
          <Grid item>
            <Typography variant="body2" sx={{ fontWeight: "bold" }}>
              Erro interno
            </Typography>
            <Typography variant="body2">{ultimoEnvio.erroInterno}</Typography>
          </Grid>
        )}
      </Grid>
    </Box>
  );
}

export default ErrosProcessamento;
