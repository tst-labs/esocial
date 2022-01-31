import {
  Grid,
  List,
  ListItem,
  ListItemIcon,
  ListItemText,
  Paper,
  Tooltip
} from "@mui/material";
import { Link } from "react-router-dom";
import { formataDataLegal } from "../../shared/dataUtil";
import {
  getDataGeracao,
  getResumo,
  getTitulo
} from "../../shared/ocorrenciaUtil";
import IconEstado from "../estado/IconEstado";
import ErrosResumo from "./ErrosResumo";

function PainelOcorrencias({ ocorrencias, page }) {
  if (!ocorrencias) return null;

  return (
    <List component={Paper} sx={{ padding: 0 }}>
      {ocorrencias.map((ocorrencia) => (
        <ListItem
          key={ocorrencia.id}
          sx={{ borderBottom: "1px rgb(224, 224, 224) solid" }}
          button
          component={Link}
          to={`/eventos/${ocorrencia.id}${page ? `?page=${page}` : ""}`}
        >
          <ListItemIcon>
            <IconEstado estado={ocorrencia.evento?.estado} />
          </ListItemIcon>
          <Grid container justifyContent="space-between" wrap="nowrap">
            <Grid item>
              <ListItemText
                primary={getTitulo(ocorrencia)}
                secondary={getResumo(ocorrencia)}
                primaryTypographyProps={{ sx: { fontWeight: "500" } }}
              />
              <ErrosResumo ocorrencia={ocorrencia} />
            </Grid>
            <Grid item>
              <Tooltip title={getDataGeracao(ocorrencia.dataRecebimento)}>
                <ListItemText
                  secondary={formataDataLegal(ocorrencia.dataRecebimento)}
                  sx={{ whiteSpace: "nowrap" }}
                />
              </Tooltip>
            </Grid>
          </Grid>
        </ListItem>
      ))}
    </List>
  );
}

export default PainelOcorrencias;
