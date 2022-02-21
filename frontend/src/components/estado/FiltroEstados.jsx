import { Box, ToggleButton, ToggleButtonGroup } from "@mui/material";
import { useNavigate } from "react-router-dom";
import {
  EM_FILA,
  ERRO,
  PROCESSADO_COM_ERRO,
  PROCESSADO_COM_SUCESSO,
  PROCESSAMENTO
} from "../../shared/estados";
import { useListQueryParam, useSetParam } from "../../shared/useQueryParam";
import IconEstado from "./IconEstado";

function FiltroEstados({ contagemEstado }) {
  const estados = useListQueryParam("estados");

  const setParam = useSetParam();
  const navigate = useNavigate();

  const handleEstados = (event, novosEstados) => {
    navigate(`/?${setParam("estados", novosEstados.join(","))}`);
  };

  function totais(...idEstados) {
    return contagemEstado
      .filter(({ estado }) => idEstados.includes(estado))
      .reduce((acc, { total }) => acc + total, 0);
  }

  return (
    <Box marginBottom={1}>
      <ToggleButtonGroup
        size="small"
        value={estados}
        onChange={handleEstados}
        fullWidth
      >
        <ToggleButton value={EM_FILA} color="primary">
          <IconEstado
            estado={{ id: EM_FILA, descricao: "EM FILA" }}
            semCor={!estados.includes(EM_FILA)}
          />
          FILA {`(${totais(EM_FILA)})`}
        </ToggleButton>
        <ToggleButton value={PROCESSAMENTO} color="warning">
          <IconEstado
            estado={{ id: PROCESSAMENTO, descricao: "EM PROCESSAMENTO" }}
            semCor={!estados.includes(PROCESSAMENTO)}
          />
          PROCESSAMENTO {`(${totais(PROCESSAMENTO)})`}
        </ToggleButton>
        <ToggleButton value={PROCESSADO_COM_SUCESSO} color="success">
          <IconEstado
            estado={{
              id: PROCESSADO_COM_SUCESSO,
              descricao: "PROCESSADO COM SUCESSO"
            }}
            semCor={!estados.includes(PROCESSADO_COM_SUCESSO)}
          />
          SUCESSO {`(${totais(PROCESSADO_COM_SUCESSO)})`}
        </ToggleButton>
        <ToggleButton value={ERRO} color="error">
          <IconEstado
            estado={{ id: ERRO, descricao: "ERRO" }}
            semCor={!estados.includes(ERRO)}
          />
          ERRO {`(${totais(ERRO, PROCESSADO_COM_ERRO)})`}
        </ToggleButton>
      </ToggleButtonGroup>
    </Box>
  );
}

export default FiltroEstados;
