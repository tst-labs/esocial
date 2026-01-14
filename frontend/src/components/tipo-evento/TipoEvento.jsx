import { MenuItem, TextField } from "@mui/material";
import { useTiposEnviados } from "../../api/ESocialJTServiceApi";

function TipoEvento({
  value,
  onChange,
  apenasEventosPeriodicos = false,
  ...props
}) {
  const { data: tiposEnviados = [] } = useTiposEnviados();

  const tiposFiltrados = apenasEventosPeriodicos
    ? tiposEnviados.filter((tipo) => String(tipo).startsWith("12"))
    : tiposEnviados;

  return (
    <TextField
      select
      fullWidth
      size="small"
      label="Tipo"
      value={value}
      onChange={onChange}
      {...props}
    >
      <MenuItem value="">
        <em>Todos</em>
      </MenuItem>
      {tiposFiltrados.map((option) => (
        <MenuItem key={option} value={option}>{`S${option}`}</MenuItem>
      ))}
    </TextField>
  );
}

export default TipoEvento;
