import { Icon, IconButton, Tooltip, Typography } from "@mui/material";
import { Box } from "@mui/system";
import { Link } from "react-router-dom";

function Paginacao({ pagina, page }) {
  return (
    pagina.totalElements > 0 && (
      <Box>
        <Typography variant="body2" component="span">
          {`${inicial(pagina)}-${final(pagina)} de ${pagina.totalElements}`}{" "}
        </Typography>
        <Tooltip title="Primeira página">
          <IconButton
            size="small"
            component={Link}
            to={`/`}
            disabled={pagina.first}
          >
            <Icon>keyboard_double_arrow_left</Icon>
          </IconButton>
        </Tooltip>
        <Tooltip title="Página anterior">
          <IconButton
            size="small"
            component={Link}
            to={`/?page=${page - 1}`}
            disabled={pagina.first}
          >
            <Icon>chevron_left</Icon>
          </IconButton>
        </Tooltip>
        <Tooltip title="Próxima página">
          <IconButton
            size="small"
            component={Link}
            to={`/?page=${page + 1}`}
            disabled={pagina.last}
          >
            <Icon>chevron_right</Icon>
          </IconButton>
        </Tooltip>
        <Tooltip title="Última página">
          <IconButton
            size="small"
            component={Link}
            to={`/?page=${pagina.totalPages - 1}`}
            disabled={pagina.last}
          >
            <Icon>keyboard_double_arrow_right</Icon>
          </IconButton>
        </Tooltip>
      </Box>
    )
  );
}

function inicial(pagina) {
  const { number, size } = pagina;
  return number * size + 1;
}

function final(pagina) {
  const { number, size, numberOfElements } = pagina;
  return number * size + numberOfElements;
}
export default Paginacao;
