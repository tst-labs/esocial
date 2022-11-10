import {
  Grid,
  List,
  ListItem,
  ListItemIcon,
  ListItemText,
  Paper
} from "@mui/material";
import { useState } from "react";
import { Link } from "react-router-dom";
import { formataDataLegal } from "../../shared/dataUtil";
import { getResumo, getTitulo } from "../../shared/ocorrenciaUtil";
import { useQuery } from "../../shared/useQueryParam";
import ArquivarButton from "../arquivar/ArquivarButton";
import IconEstado from "../estado/IconEstado";
import ErrosResumo from "./ErrosResumo";

function PainelOcorrencias({ ocorrencias }) {
  const [hoverId, setHoverId] = useState();
  const query = useQuery();

  if (!ocorrencias) return null;

  return (
    <List component={Paper} sx={{ padding: 0 }}>
      {ocorrencias.map((ocorrencia) => (
        <ListItem
          onMouseLeave={() => setHoverId(null)}
          onMouseOver={() => setHoverId(ocorrencia.id)}
          key={ocorrencia.id}
          sx={(theme) => ({
            borderBottom: "1px rgb(224, 224, 224) solid",
            ".MuiListItemSecondaryAction-root ": {
              top: theme.spacing(3)
            }
          })}
          button
          component={Link}
          to={`/eventos/${ocorrencia.id}?${query.toString()}`}
          secondaryAction={
            hoverId === ocorrencia.id || ocorrencia.arquivado ? (
              <ArquivarButton ocorrencia={ocorrencia} />
            ) : (
              <ListItemText
                secondary={formataDataLegal(ocorrencia.dataRecebimento)}
                sx={{ whiteSpace: "nowrap" }}
              />
            )
          }
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
          </Grid>
        </ListItem>
      ))}
    </List>
  );
}

export default PainelOcorrencias;
