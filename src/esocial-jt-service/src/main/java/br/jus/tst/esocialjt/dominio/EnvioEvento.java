package br.jus.tst.esocialjt.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "EST_ENVIO_EVENTO")
@NamedQuery(name = "EnvioEvento.findAll", query = "SELECT e FROM EnvioEvento e")
public class EnvioEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ENV_EVT_ID")
	@SequenceGenerator(name = "SEQ_ENV_EVT_ID", sequenceName = "SEQ_ENV_EVT_ID", allocationSize = 1)
	@Column(name = "COD_ENVIO_EVENTO")
	private Long id;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_EVENTO", referencedColumnName = "COD_EVENTO")
	private Evento evento;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "COD_LOTE", referencedColumnName = "COD_LOTE")
	private Lote lote;

	@ManyToOne
	@JoinColumn(name = "COD_RESPOSTA", referencedColumnName = "COD_IDENTIFICADOR")
	private CodigoResposta codRespostaProcessamento;

	@Temporal(TemporalType.DATE)
	@Column(name = "DTA_GERACAO_EVENTO")
	private Date dtaGeracaoEvento;

	@Column(name = "NUM_VERSAO")
	private String versao;

	@Lob
	@Type(type = "org.hibernate.type.TextType")
	@Column(name = "TXT_ERRO_INTERNO")
	private String erroInterno;

	@Transient
	@JsonIgnore
	private String xmlEvento;

	@OneToMany(mappedBy = "envioEvento", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ErroProcessamento> errosProcessamento = new HashSet<>();

	public EnvioEvento() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<ErroProcessamento> getErrosProcessamento() {
		return errosProcessamento;
	}

	public void setErrosProcessamento(Set<ErroProcessamento> errosProcessamento) {
		this.errosProcessamento = errosProcessamento;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public CodigoResposta getCodRespostaProcessamento() {
		return codRespostaProcessamento;
	}

	public void setCodRespostaProcessamento(CodigoResposta codRespostaProcessamento) {
		this.codRespostaProcessamento = codRespostaProcessamento;
	}

	public Date getDtaGeracaoEvento() {
		return dtaGeracaoEvento;
	}

	public void setDtaGeracaoEvento(Date dtaGeracaoEvento) {
		this.dtaGeracaoEvento = dtaGeracaoEvento;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getErroInterno() {
		return erroInterno;
	}

	public void setErroInterno(String erroInterno) {
		this.erroInterno = erroInterno;
	}

	public String getXmlEvento() {
		return xmlEvento;
	}

	public void setXmlEvento(String xmlEvento) {
		this.xmlEvento = xmlEvento;
	}
}