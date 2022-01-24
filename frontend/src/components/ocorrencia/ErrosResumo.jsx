import { Box, Typography } from "@mui/material";
import { red } from "@mui/material/colors";

function ErrosResumo({ ocorrencia }) {
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
  let erro;
  if (ultimoEnvio.errosProcessamento.length > 0) {
    erro = ultimoEnvio.errosProcessamento[0];
  } else {
    erro = ultimoEnvio.erroInterno;
  }

  return (
    <Box padding={1} sx={{ backgroundColor: red[50] }}>
      <Typography variant="body2">
        <span style={{ fontWeight: "500" }}>Erro:</span>{" "}
        {erro.descricao || erro}
        {ultimoEnvio.errosProcessamento.length > 1 && (
          <span style={{ fontWeight: "500", whiteSpace: "pre" }}>{` [e mais ${
            ultimoEnvio.errosProcessamento.length - 1
          } erro${
            ultimoEnvio.errosProcessamento.length > 2 ? "s" : ""
          }]`}</span>
        )}
      </Typography>
    </Box>
  );
}

export default ErrosResumo;
