import {
  Checkbox,
  FormControlLabel,
  FormGroup,
  Grid,
  Icon,
  IconButton,
  InputAdornment,
  TextField
} from "@mui/material";
import { Box } from "@mui/system";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import TipoEvento from "../../components/tipo-evento/TipoEvento";
import { useQueryParam, useSetParam } from "../../shared/useQueryParam";

function Busca() {
  const expressaoIni = useQueryParam("expressao") || "";
  const tipoIni = useQueryParam("tipo") || "";
  const incluirArquivadosIni = useQueryParam("incluirArquivados") === "true";
  const periodoApuracaoIni = useQueryParam("periodoApuracao") || "";
  const [expressao, setExpressao] = useState(expressaoIni);
  const [tipo, setTipo] = useState(tipoIni);
  const [incluirArquivados, setIncluirArquivados] =
    useState(incluirArquivadosIni);
  const [periodoApuracao, setPeriodoApuracao] = useState(periodoApuracaoIni);
  const setParam = useSetParam();
  const navigate = useNavigate();

  function handleSubmit(event) {
    event.preventDefault();
    navigate(`/?${setParam("expressao", expressao)}`);
  }

  function limpar() {
    setExpressao("");
    navigate(`/?${setParam("expressao", "")}`);
  }

  // eslint-disable-next-line
  useEffect(() => navigate(`/?${setParam("tipo", tipo)}`), [tipo]);

  useEffect(
    () => navigate(`/?${setParam("incluirArquivados", incluirArquivados)}`),
    // eslint-disable-next-line
    [incluirArquivados]
  );

  // eslint-disable-next-line
  useEffect(() => navigate(`/?${setParam("periodoApuracao", periodoApuracao)}`), [periodoApuracao]);

  return (
    <Box marginBottom={2}>
      <Grid container spacing={2}>
        <Grid item xs={7}>
          <form onSubmit={handleSubmit}>
            <TextField
              value={expressao}
              onChange={(e) => setExpressao(e.target.value)}
              fullWidth
              size="small"
              placeholder="Pesquisar dados do evento"
              InputProps={{
                startAdornment: (
                  <InputAdornment position="start">
                    <IconButton edge="start" type="submit">
                      <Icon>search</Icon>
                    </IconButton>
                  </InputAdornment>
                ),
                endAdornment:
                  expressao || expressaoIni ? (
                    <InputAdornment position="end">
                      <IconButton edge="end" onClick={limpar}>
                        <Icon>close</Icon>
                      </IconButton>
                    </InputAdornment>
                  ) : undefined
              }}
            />
          </form>
        </Grid>
        <Grid item xs={2}>
          <TipoEvento
            value={tipo}
            onChange={(event) => setTipo(event.target.value)}
          />
        </Grid>
        <Grid item xs={3}>
          <FormGroup sx={{ color: "rgba(0, 0, 0, 0.6)" }}>
            <FormControlLabel
              control={
                <Checkbox
                  checked={incluirArquivados}
                  onChange={(e) => setIncluirArquivados(e.target.checked)}
                />
              }
              label="Incluir arquivados"
            />
          </FormGroup>
        </Grid>
        <Grid item xs={4}>
          <TextField
            fullWidth
            size="small"
            label="Período de Apuração (perApur)"
            value={periodoApuracao}
            onChange={(event) => setPeriodoApuracao(event.target.value)}
            placeholder="Ex: 2025-12 ou 2025"
          />
        </Grid>
      </Grid>
    </Box>
  );
}

export default Busca;
