import { Icon, IconButton, Tooltip } from "@mui/material";
import {
  EM_FILA,
  PROCESSADO_COM_ERRO,
  PROCESSADO_COM_SUCESSO,
  PROCESSAMENTO,
  ERRO
} from "../../shared/estados";

function IconEstado({ estado, semCor }) {
  if (!estado) {
    estado = { id: EM_FILA, descricao: "EM FILA" };
  }

  let color;
  let icon;

  switch (estado.id) {
    case EM_FILA:
      color = "default";
      icon = "pending";
      break;
    case PROCESSAMENTO:
      icon = "cached";
      color = "warning";
      break;
    case PROCESSADO_COM_SUCESSO:
      color = "success";
      icon = "check_circle_outline";
      break;
    case PROCESSADO_COM_ERRO:
    case ERRO:
      color = "error";
      icon = "error_outline";
      break;
    default:
      color = "default";
      icon = "queue";
  }

  if (semCor) {
    color = undefined;
  }

  return (
    <Tooltip title={estado.descricao}>
      <IconButton
        size="small"
        sx={{ padding: 0, marginRight: 1 }}
        component="span"
        disableRipple
      >
        <Icon color={color}>{icon}</Icon>
      </IconButton>
    </Tooltip>
  );
}

export default IconEstado;
