import { Button } from "@mui/material";
import { Link } from "react-router-dom";
import { useQuery } from "../../shared/useQueryParam";

function Voltar() {
  const query = useQuery();
  return (
    <Button
      variant="outlined"
      size="small"
      color="primary"
      component={Link}
      to={`/?${query.toString()}`}
    >
      Voltar
    </Button>
  );
}

export default Voltar;
