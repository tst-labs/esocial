import { Icon, IconButton, Tooltip } from "@mui/material";
import { useArquivar, useDesarquivar } from "../../api/ESocialJTServiceApi";
import { useLoading } from "../loading/LoadingProvider";

function ArquivarButton({ ocorrencia }) {
  const { mutateAsync: arquivar } = useArquivar();
  const { mutateAsync: desarquivar } = useDesarquivar();
  const setLoading = useLoading();

  return (
    <Tooltip title={ocorrencia.arquivado ? "Desarquivar" : "Arquivar"}>
      <IconButton
        edge="end"
        aria-label="delete"
        onClick={async (e) => {
          e.preventDefault();
          setLoading(true);
          if (ocorrencia.arquivado) {
            await desarquivar(ocorrencia.id);
          } else {
            await arquivar(ocorrencia.id);
          }
          ocorrencia.arquivado = !ocorrencia.arquivado;
          setLoading(false);
        }}
      >
        <Icon>{ocorrencia.arquivado ? "inventory" : "archive"}</Icon>
      </IconButton>
    </Tooltip>
  );
}

export default ArquivarButton;
