import { Icon, IconButton, Tooltip, Typography } from "@mui/material";
import { Box } from "@mui/system";
import { Link } from "react-router-dom";
import { useSetParam } from "../../shared/useQueryParam";

function Paginacao({ pagina, page, expressao }) {
  const setParam = useSetParam();
  return (
    pagina.totalElements > 0 && (
      <Box>
        {expressao && (
          <Typography
            variant="body2"
            component="span"
            sx={{ fontStyle: "italic" }}
            marginRight={2}
          >
            {`Pesquisa: "${expressao}"`}{" "}
          </Typography>
        )}
        <Typography variant="body2" component="span">
          {`${inicial(pagina)}-${final(pagina)} de ${pagina.totalElements}`}{" "}
        </Typography>
        <Tooltip title="Primeira página">
          <IconButton
            size="small"
            component={Link}
            to={`/?${setParam("page", 0).toString()}`}
            disabled={pagina.first}
          >
            <Icon>keyboard_double_arrow_left</Icon>
          </IconButton>
        </Tooltip>
        <Tooltip title="Página anterior">
          <IconButton
            size="small"
            component={Link}
            to={`/?${setParam("page", page - 1).toString()}`}
            disabled={pagina.first}
          >
            <Icon>chevron_left</Icon>
          </IconButton>
        </Tooltip>
        <Tooltip title="Próxima página">
          <IconButton
            size="small"
            component={Link}
            to={`/?${setParam("page", page + 1).toString()}`}
            disabled={pagina.last}
          >
            <Icon>chevron_right</Icon>
          </IconButton>
        </Tooltip>
        <Tooltip title="Última página">
          <IconButton
            size="small"
            component={Link}
            to={`/?${setParam("page", pagina.totalPages - 1).toString()}`}
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
