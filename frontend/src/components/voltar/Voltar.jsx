import { Button } from "@mui/material";
import { Link } from "react-router-dom";

function Voltar({ page }) {
  return (
    <Button
      variant="outlined"
      size="small"
      color="primary"
      component={Link}
      to={`/?page=${page}`}
    >
      Voltar
    </Button>
  );
}

export default Voltar;
