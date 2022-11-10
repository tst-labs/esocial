import { Box, Grid, Paper, Typography } from "@mui/material";
import { red, amber } from "@mui/material/colors";

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

  if (!(ultimoEnvio.errosProcessamento?.length || ultimoEnvio.erroInterno)) {
    return null;
  }

  ultimoEnvio.errosProcessamento.sort((a, b) => b.id - a.id);

  const erros = ultimoEnvio.errosProcessamento.filter(
    (err) => err.tipoErroProcessamento?.id !== 2
  );
  const advertencias = ultimoEnvio.errosProcessamento.filter(
    (err) => err.tipoErroProcessamento?.id === 2
  );

  return (
    <>
      {(erros.length > 0 || ultimoEnvio.erroInterno) && (
        <Box
          component={Paper}
          padding={2}
          sx={{ backgroundColor: red[50] }}
          marginBottom={advertencias.length ? 2 : 0}
        >
          <Typography variant="h6" sx={{ fontSize: "1rem" }} gutterBottom>
            Erros
          </Typography>
          <Grid container spacing={2}>
            {erros.map((erro) => (
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
                <Typography variant="body2">
                  {ultimoEnvio.erroInterno}
                </Typography>
              </Grid>
            )}
          </Grid>
        </Box>
      )}
      {advertencias.length > 0 && (
        <Box component={Paper} padding={2} sx={{ backgroundColor: amber[200] }}>
          <Typography variant="h6" sx={{ fontSize: "1rem" }} gutterBottom>
            Advertências
          </Typography>
          <Grid container spacing={2}>
            {advertencias.map((erro) => (
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
          </Grid>
        </Box>
      )}
    </>
  );
}

export default ErrosProcessamento;
