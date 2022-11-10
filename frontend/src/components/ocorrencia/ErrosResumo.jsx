import { Box, Typography } from "@mui/material";
import { red, amber } from "@mui/material/colors";

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

  const erros = ultimoEnvio.errosProcessamento.filter(
    (err) => err.tipoErroProcessamento?.id !== 2
  );
  const advertencias = ultimoEnvio.errosProcessamento.filter(
    (err) => err.tipoErroProcessamento?.id === 2
  );

  let erro;
  if (erros.length > 0) {
    erro = erros[0];
  } else {
    erro = ultimoEnvio.erroInterno;
  }

  let advertencia;
  if (advertencias.length > 0) {
    advertencia = advertencias[0];
  }

  return (
    <>
      {erro && (
        <Box padding={1} sx={{ backgroundColor: red[50] }}>
          <Typography variant="body2">
            <span style={{ fontWeight: "500" }}>Erro:</span>{" "}
            {erro.descricao || erro}
            {erros.length > 1 && (
              <span
                style={{ fontWeight: "500", whiteSpace: "pre" }}
              >{` [e mais ${erros.length - 1} erro${
                erros.length > 2 ? "s" : ""
              }]`}</span>
            )}
          </Typography>
        </Box>
      )}
      {advertencia && (
        <Box padding={1} sx={{ backgroundColor: amber[200] }}>
          <Typography variant="body2">
            <span style={{ fontWeight: "500" }}>Advertência:</span>{" "}
            {advertencia.descricao}
            {advertencias.length > 1 && (
              <span
                style={{ fontWeight: "500", whiteSpace: "pre" }}
              >{` [e mais ${advertencias.length - 1} advertências${
                advertencias.length > 2 ? "s" : ""
              }]`}</span>
            )}
          </Typography>
        </Box>
      )}
    </>
  );
}

export default ErrosResumo;
