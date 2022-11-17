import styled from "@emotion/styled";
import { formataDataTempoLong } from "./dataUtil";
import {
  ADMISSAO_TRABALHADOR,
  AFASTAMENTO_TEMPORARIO,
  ALTERACAO_CADASTRAL,
  ALTERACAO_CONTRATUAL,
  BENEFICIO_RPPS,
  CADASTRO_BENEFICIARIO_ALT,
  CADASTRO_BENEFICIARIO_INI,
  CADASTRO_BENEFICIO_ALT,
  CADASTRO_BENEFICIO_INI,
  CADASTRO_BENEFICIO_TERM,
  CAT,
  CESSAO,
  DESLIGAMENTO,
  EXCLUSAO,
  EXP_RISCO,
  FECHAMENTO_PERIODICOS,
  INFORMACOES_EMPREGADOR,
  MONIT,
  PAGAMENTOS,
  REABERTURA_PERIODICOS,
  REATIVACAO_BENEFICIO,
  REINTEGRACAO,
  REMUNERACAO_RGPS,
  REMUNERACAO_RPPS,
  TABELA_ESTABELECIMENTO,
  TABELA_LOTACAO,
  TABELA_PROCESSO,
  TABELA_RUBRICA,
  TSV_ALTERACAO_CONTRATUAL,
  TSV_INICIO,
  TSV_TERMINO
} from "./tiposOcorrencia";

export function getTitulo(ocorrencia) {
  return ocorrencia?.evento?.tipoEvento
    ? `S${ocorrencia.evento.tipoEvento.codTipo} - ${ocorrencia.evento.tipoEvento.desTipo}`
    : "Gerando evento...";
}
export function getResumo(ocorrencia) {
  const { tipoOcorrencia, dadosOcorrencia: dados, referencia } = ocorrencia;

  let resumo;

  switch (tipoOcorrencia) {
    case INFORMACOES_EMPREGADOR:
      resumo = (
        <>
          <D k="nrInsc" v={dados.ideEmpregador?.nrInsc} />
        </>
      );
      break;
    case TABELA_ESTABELECIMENTO:
      resumo = (
        <>
          <D k="nrInsc" v={dados.infoEstab?.ideEstab?.nrInsc} />
        </>
      );
      break;
    case TABELA_RUBRICA:
      resumo = (
        <>
          <D k="codRubr" v={dados.infoRubrica?.ideRubrica?.codRubr} />
          <D k="dscRubr" v={dados.infoRubrica?.dadosRubrica?.dscRubr} />
        </>
      );
      break;
    case TABELA_LOTACAO:
      resumo = (
        <>
          <D k="codLotacao" v={dados.infoLotacao?.ideLotacao?.codLotacao} />
        </>
      );
      break;
    case TABELA_PROCESSO:
      resumo = (
        <>
          <D k="tpProc" v={dados.infoProcesso?.ideProcesso?.tpProc} />
          <D k="nrProc" v={dados.infoProcesso?.ideProcesso?.nrProc} />
        </>
      );
      break;
    case ADMISSAO_TRABALHADOR:
      resumo = (
        <>
          <D k="cpfTrab" v={dados.trabalhador?.cpfTrab} />
          <D k="matricula" v={dados.vinculo?.matricula} />
          <D k="cadIni" v={dados.vinculo?.cadIni} />
          <D k="nmTrab" v={dados.trabalhador?.nmTrab} />
        </>
      );
      break;
    case CESSAO:
      resumo = (
        <>
          <D k="cpfTrab" v={dados.ideVinculo?.cpfTrab} />
          <D k="matricula" v={dados.ideVinculo?.matricula} />
        </>
      );
      break;
    case ALTERACAO_CADASTRAL:
      resumo = (
        <>
          <D k="cpfTrab" v={dados.ideTrabalhador?.cpfTrab} />
          <D k="nmTrab" v={dados.alteracao?.dadosTrabalhador?.nmTrab} />
        </>
      );
      break;
    case ALTERACAO_CONTRATUAL:
      resumo = (
        <>
          <D k="cpfTrab" v={dados.ideVinculo?.cpfTrab} />
          <D k="matricula" v={dados.ideVinculo?.matricula} />
          <D k="dscAlt" v={dados.altContratual?.dscAlt} />
        </>
      );
      break;
    case AFASTAMENTO_TEMPORARIO:
    case DESLIGAMENTO:
    case REINTEGRACAO:
    case EXP_RISCO:
    case CAT:
    case MONIT:
      resumo = (
        <>
          <D k="cpfTrab" v={dados.ideVinculo?.cpfTrab} />
          <D k="matricula" v={dados.ideVinculo?.matricula} />
        </>
      );
      break;
    case TSV_INICIO:
      resumo = (
        <>
          <D k="cpfTrab" v={dados.trabalhador?.cpfTrab} />
          <D k="matricula" v={dados.infoTSVInicio?.matricula} />
          <D k="cadIni" v={dados.infoTSVInicio?.cadIni} />
          <D k="nmTrab" v={dados.trabalhador?.nmTrab} />
        </>
      );
      break;
    case TSV_ALTERACAO_CONTRATUAL:
    case TSV_TERMINO:
      resumo = (
        <>
          <D k="cpfTrab" v={dados.ideTrabSemVinculo?.cpfTrab} />
          <D k="matricula" v={dados.ideTrabSemVinculo?.matricula} />
        </>
      );
      break;
    case CADASTRO_BENEFICIARIO_INI:
      resumo = (
        <>
          <D k="cpfBenef" v={dados.beneficiario?.cpfBenef} />
          <D k="nmBenefic" v={dados.beneficiario?.nmBenefic} />
        </>
      );
      break;
    case CADASTRO_BENEFICIARIO_ALT:
      resumo = (
        <>
          <D k="cpfBenef" v={dados.ideBenef?.cpfBenef} />
          <D k="nmBenefic" v={dados.alteracao?.dadosBenef?.nmBenefic} />
        </>
      );
      break;
    case CADASTRO_BENEFICIO_INI:
      resumo = (
        <>
          <D k="cpfBenef" v={dados.beneficiario?.cpfBenef} />
          <D k="nrBeneficio" v={dados.infoBenInicio?.nrBeneficio} />
          <D k="cadIni" v={dados.infoBenInicio?.cadIni} />
          <D k="dsc" v={dados.infoBenInicio?.dadosBeneficio?.dsc} />
        </>
      );
      break;
    case CADASTRO_BENEFICIO_ALT:
      resumo = (
        <>
          <D k="cpfBenef" v={dados.ideBeneficio?.cpfBenef} />
          <D k="nrBeneficio" v={dados.ideBeneficio?.nrBeneficio} />
          <D k="dsc" v={dados.infoBenAlteracao?.dadosBeneficio?.dsc} />
        </>
      );
      break;
    case CADASTRO_BENEFICIO_TERM:
    case REATIVACAO_BENEFICIO:
      resumo = (
        <>
          <D k="cpfBenef" v={dados.ideBeneficio?.cpfBenef} />
          <D k="nrBeneficio" v={dados.ideBeneficio?.nrBeneficio} />
        </>
      );
      break;
    case REMUNERACAO_RGPS:
    case REMUNERACAO_RPPS:
      resumo = (
        <>
          <D k="indApuracao" v={dados.ideEvento?.indApuracao} />
          <D k="perApur" v={dados.ideEvento?.perApur} />
          <D k="cpfTrab" v={dados.ideTrabalhador?.cpfTrab} />
        </>
      );
      break;
    case BENEFICIO_RPPS:
    case PAGAMENTOS:
      resumo = (
        <>
          <D k="indApuracao" v={dados.ideEvento?.indApuracao} />
          <D k="perApur" v={dados.ideEvento?.perApur} />
          <D k="cpfBenef" v={dados.ideBenef?.cpfBenef} />
        </>
      );
      break;
    case REABERTURA_PERIODICOS:
    case FECHAMENTO_PERIODICOS:
      resumo = (
        <>
          <D k="indApuracao" v={dados.ideEvento?.indApuracao} />
          <D k="perApur" v={dados.ideEvento?.perApur} />
        </>
      );
      break;
    case EXCLUSAO:
      resumo = (
        <>
          <D k="tpEvento" v={dados.infoExclusao?.tpEvento} />
          <D k="nrRecEvt" v={dados.infoExclusao?.nrRecEvt} />
        </>
      );
      break;
    default:
      resumo = <D k="referência" v={referencia} />;
  }

  return resumo;
}

const Element = styled("span")(() => ({
  whiteSpace: "nowrap"
}));
const Key = styled("span")(() => ({
  fontWeight: "500"
}));
const Value = styled("span")(() => ({
  marginLeft: 4,
  marginRight: 16,
  display: "inline-block"
}));

function D({ k, v }) {
  return (
    <Element>
      <Key>{k}:</Key>
      <Value>{v || ""}</Value>
    </Element>
  );
}

export function getDataGeracao(data) {
  return data && `Gerado em ${formataDataTempoLong(data)}`;
}
