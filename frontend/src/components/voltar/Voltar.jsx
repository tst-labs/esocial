import { Button } from "@mui/material";
import { Link } from "react-router-dom";

function Voltar() {
  return (
    <Button
      variant="outlined"
      size="small"
      color="primary"
      component={Link}
      to="/"
    >
      Voltar
    </Button>
  );
}

export default Voltar;
