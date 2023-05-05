package br.jus.tst.esocialjt.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.br.CPF;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import java.io.Serializable;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "EST_EVENTO_TOTALIZADOR")
@NamedQueries({ @NamedQuery(name = "EventoTotalizador.findAll", query = "SELECT e FROM EventoTotalizador e")
})

public class EventoTotalizador implements Serializable {

	private static final long serialVersionUID = -1024704188467704223L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EVT_TOT_ID")
	@SequenceGenerator(name = "SEQ_EVT_TOT_ID", sequenceName = "SEQ_EVT_TOT_ID", allocationSize = 1)
	@Column(name = "COD_EVENTO_TOTALIZADOR", unique = true, nullable = false, precision = 22, scale = 0)
	private Long id;

	@Size(max = 5)
	@Column(name = "TXT_TIPO")
	private String tipo;
	
	@Size(max = 40)
	@Column(name = "TXT_NR_RECIBO_ARQ_BASE")
	private String nrReciboArquivoBase;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "NUM_IND_APURACAO")
	private Byte indApuracao;
	
	@Size(max = 7)
	@Column(name = "TXT_PER_APURACAO")
	private String perApuracao;
	
	@JsonInclude(Include.NON_NULL)
	@CPF
	@Column(name = "NUM_CPF_TRABALHADOR")
	private String cpfTrabalhador;

	@Lob
	@Type(type = "org.hibernate.type.TextType")
	@Column(name = "TXT_XML_EVENTO_TOTALIZADOR")
	private String xmlEventoTotalizador;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "TXT_NR_RECIBO_ARQ_BASE", referencedColumnName = "TXT_NR_RECIBO", insertable = false, updatable = false)
	private Evento evento;

	@JsonIgnore
	@Transient
	private static final XmlMapper xmlMapper = new XmlMapper();

	@JsonIgnore
	@Transient
	private static final Logger LOGGER = LoggerFactory.getLogger(EventoTotalizador.class);

	public Long getId() {
		return id;
	}

	public EventoTotalizador setId(Long id) {
		this.id = id;
		return this;
	}

	public String getTipo() {
		return tipo;
	}

	public EventoTotalizador setTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	public String getNrReciboArquivoBase() {
		return nrReciboArquivoBase;
	}

	public EventoTotalizador setNrReciboArquivoBase(String nrReciboArquivoBase) {
		this.nrReciboArquivoBase = nrReciboArquivoBase;
		return this;
	}

	public Byte getIndApuracao() {
		return indApuracao;
	}

	public EventoTotalizador setIndApuracao(Byte indApuracao) {
		this.indApuracao = indApuracao;
		return this;
	}

	public String getPerApuracao() {
		return perApuracao;
	}

	public EventoTotalizador setPerApuracao(String perApuracao) {
		this.perApuracao = perApuracao;
		return this;
	}

	public String getCpfTrabalhador() {
		return cpfTrabalhador;
	}

	public EventoTotalizador setCpfTrabalhador(String cpfTrabalhador) {
		this.cpfTrabalhador = cpfTrabalhador;
		return this;
	}

	public String getXmlEventoTotalizador() {
		return xmlEventoTotalizador;
	}

	public EventoTotalizador setXmlEventoTotalizador(String xmlEventoTotalizador) {
		this.xmlEventoTotalizador = xmlEventoTotalizador;
		return this;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	@Transient
	public JsonNode getJsonEventoTotalizador() {
		try {
			if (StringUtils.isNotEmpty(xmlEventoTotalizador)) {
				return xmlMapper.readTree(xmlEventoTotalizador);
			}
		} catch (JsonProcessingException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return null;
	}
}
