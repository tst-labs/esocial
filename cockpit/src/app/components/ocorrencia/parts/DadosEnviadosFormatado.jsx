import React from "react";
import TipoNaoIdentificado from "../dados-enviados-formatados/TipoNaoIdentificado";
import InformacoesEmpregador from "../dados-enviados-formatados/InformacoesEmpregador";
import TabelaEstabelecimento from "../dados-enviados-formatados/TabelaEstabelecimento";
import TabelaLotacao from "../dados-enviados-formatados/TabelaLotacao";
import TabelaCargo from "../dados-enviados-formatados/TabelaCargo";
import TabelaCarreira from "../dados-enviados-formatados/TabelaCarreira";
import TabelaFuncao from "../dados-enviados-formatados/TabelaFuncao";

export default function DadosEnviadosFormatado({ dados }) {
  if (!dados) {
    return <TipoNaoIdentificado />;
  }

  const { tipo } = dados;
  switch (tipo) {
    case ".TabelaFuncao":
      return <TabelaFuncao dados={dados} />;
    case ".TabelaCarreira":
      return <TabelaCarreira dados={dados} />;
    case ".TabelaCargo":
      return <TabelaCargo dados={dados} />;
    case ".TabelaLotacao":
      return <TabelaLotacao dados={dados} />;
    case ".TabelaEstabelecimento":
      return <TabelaEstabelecimento dados={dados} />;
    case ".InformacoesEmpregador":
      return <InformacoesEmpregador dados={dados} />;
    default:
      return <TipoNaoIdentificado dados={dados} />;
  }
}
