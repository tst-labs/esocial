import { MenuItem } from "@mui/material";
import { useDialog } from "muibox";
import { useNavigate } from "react-router-dom";
import { useLimparProducaoRestrita } from "../../api/ESocialJTServiceApi";
import useFeedback from "../feedback/useFeedback";
import { useLoading } from "../loading/LoadingProvider";

function LimparProducaoRestrita({ onClose }) {
  const dialog = useDialog();
  const setLoading = useLoading();
  const { showSuccess, showError } = useFeedback();
  const navigate = useNavigate();

  const limparPR = useLimparProducaoRestrita();

  async function apagarProducaoRestrita() {
    onClose();
    await dialog.confirm({
      title: `Deseja apagar os dados do ambiente de Produção Restrita?`,
      ok: { text: "CONFIRMAR", color: "primary" },
      cancel: { text: "CANCELAR", color: "primary" }
    });
    setLoading(true);

    limparPR.mutate(
      {},
      {
        onSuccess: () => {
          showSuccess(
            "Dados do ambiente de Produção Restrita apagados com sucesso."
          );
          navigate("/");
        },
        onError: showError,
        onSettled: () => setLoading(false)
      }
    );
  }

  return (
    <MenuItem onClick={apagarProducaoRestrita}>
      Limpar Produção Restrita
    </MenuItem>
  );
}

export default LimparProducaoRestrita;
