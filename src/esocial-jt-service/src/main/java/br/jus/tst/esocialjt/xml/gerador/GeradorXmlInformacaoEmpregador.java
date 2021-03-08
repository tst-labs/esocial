package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.TIdeEventoEvtTabInicial;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.EmpregadorMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlInformacaoEmpregador extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtInfoEmpregador.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		ESocial eSocial = new ESocial();
		
		EvtInfoEmpregador evtInfoEmpregador = converterInfoEmpregador(ocorrencia);
		evtInfoEmpregador.setId(evento.getIdEvento());
		evtInfoEmpregador.setIdeEvento(preencherConstantes(new TIdeEventoEvtTabInicial()));
		eSocial.setEvtInfoEmpregador(evtInfoEmpregador);

		return eSocial;
	}

	private EvtInfoEmpregador converterInfoEmpregador(Ocorrencia ocorrencia) throws GeracaoXmlException {
		EvtInfoEmpregador evtInfoEmpregador;
		InformacoesEmpregador informacaoEmpregador = (InformacoesEmpregador) ocorrencia.getDadosOcorrencia();
		EmpregadorMapper mapper = EmpregadorMapper.INSTANCE;

		switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtInfoEmpregador = mapper.comoEvtInfoEmpregadorInclusao(informacaoEmpregador);
			break;

		case ALTERACAO:
			evtInfoEmpregador = mapper.comoEvtInfoEmpregadorAlteracao(informacaoEmpregador);
			break;

		case EXCLUSAO:
			evtInfoEmpregador = mapper.comoEvtInfoEmpregadorExclusao(informacaoEmpregador);
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(),
					"Operação não suportada: " + ocorrencia.getOperacao());
		}

		return evtInfoEmpregador;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}
}
