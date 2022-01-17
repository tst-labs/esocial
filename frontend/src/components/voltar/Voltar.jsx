import { Button } from "@mui/material";
import { useNavigate } from "react-router-dom";

function Voltar() {
  const navigate = useNavigate();

  return (
    <Button
      variant="outlined"
      size="small"
      color="primary"
      onClick={() => navigate(-1)}
    >
      Voltar
    </Button>
  );
}

export default Voltar;
