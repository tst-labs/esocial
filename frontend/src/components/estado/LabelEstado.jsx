import { Chip } from "@mui/material";
import {
  EM_FILA,
  PROCESSADO_COM_ERRO,
  PROCESSADO_COM_SUCESSO,
  PROCESSAMENTO,
  ERRO
} from "../../shared/estados";

function LabelEstado({ estado }) {
  if (!estado) return null;

  let color;

  switch (estado.id) {
    case EM_FILA:
      color = "default";
      break;
    case PROCESSAMENTO:
      color = "warning";
      break;
    case PROCESSADO_COM_SUCESSO:
      color = "success";
      break;
    case PROCESSADO_COM_ERRO:
      color = "error";
      break;
    case ERRO:
      color = "error";
      break;
    default:
      color = "default";
  }

  return (
    <Chip
      label={estado.descricao}
      variant="outlined"
      size="small"
      color={color}
      sx={{
        marginX: 2
      }}
    />
  );
}

export default LabelEstado;
