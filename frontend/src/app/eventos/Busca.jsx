import { Icon, IconButton, InputAdornment, TextField } from "@mui/material";
import { Box } from "@mui/system";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { useQueryParam, useSetParam } from "../../shared/useQueryParam";

function Busca() {
  const expressaoIni = useQueryParam("expressao") || "";
  const [expressao, setExpressao] = useState(expressaoIni);
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

  return (
    <Box marginBottom={2}>
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
    </Box>
  );
}

export default Busca;
