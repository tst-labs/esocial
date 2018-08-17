package br.jus.tst.esocialjt.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.Type;

/**
 * The persistent class for the EST_LOTE database table.
 * 
 */
@Entity
@Table(name = "EST_LOTE")
@NamedQuery(name = "EstLote.findAll", query = "SELECT e FROM Lote e")
public class Lote implements Serializable {

	private static final long serialVersionUID = -7794939058462667613L;
	private static final int MAX_ERROR_SIZE = 4000;

	@Id
	@SequenceGenerator(name = "EST_LOTE_CODLOTE_GENERATOR", sequenceName = "SEQ_LOTE_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EST_LOTE_CODLOTE_GENERATOR")
	@Column(name = "COD_LOTE", unique = true, nullable = false, precision = 22, scale = 0)
	private long id;

	@JoinColumn(name = "COD_ESTADO", referencedColumnName = "COD_ESTADO")
	@ManyToOne
	private Estado estado;

	@JoinColumn(name = "COD_RESPOSTA", referencedColumnName = "COD_IDENTIFICADOR")
	@ManyToOne
	private CodigoResposta codigoResposta;

	@Column(name = "DTA_ENVIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEnvio;

	@Column(name = "TXT_PROTOCOLO")
	private String protocolo;

	@Lob
	@Type(type = "org.hibernate.type.TextType")
	@Column(name = "TXT_RETORNO")
	private String retorno;

	@Lob
	@Type(type = "org.hibernate.type.TextType")
	@Column(name = "TXT_XML_LOTE")
	private String xmlLote;

	@Lob
	@Type(type = "org.hibernate.type.TextType")
	@Column(name = "TXT_ERRO_INTERNO")
	private String erroInterno;

	@OneToMany(mappedBy = "lote", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<EnvioEvento> enviosEvento = new ArrayList<>();

	public CodigoResposta getCodigoResposta() {
		return codigoResposta;
	}

	public void setCodigoResposta(CodigoResposta codigoResposta) {
		this.codigoResposta = codigoResposta;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public List<EnvioEvento> getEnviosEvento() {
		return enviosEvento;
	}

	public void setEnviosEvento(List<EnvioEvento> enviosEvento) {
		this.enviosEvento = enviosEvento;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long codLote) {
		this.id = codLote;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public Lote setEstado(Estado estado) {
		this.estado = estado;
		return this;
	}

	public CodigoResposta getResposta() {
		return this.codigoResposta;
	}

	public Lote setResposta(CodigoResposta codigoResposta) {
		this.codigoResposta = codigoResposta;
		return this;
	}

	public Date getDtaEnvio() {
		return this.dataEnvio;
	}

	public Lote setDtaEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
		return this;
	}

	public String getProtocolo() {
		return this.protocolo;
	}

	public Lote setProtocolo(String txtProtocolo) {
		this.protocolo = txtProtocolo;
		return this;
	}

	public String getRetorno() {
		return this.retorno;
	}

	public Lote setRetorno(String retorno) {
		this.retorno = retorno;
		return this;
	}

	@JsonIgnore
	public String getXmlLote() {
		return xmlLote;
	}

	public Lote setXmlLote(String xmlLote) {
		this.xmlLote = xmlLote;
		return this;
	}

	@JsonIgnore
	public String getErroInterno() {
		return erroInterno;
	}

	public Lote setErroInterno(String erroInterno) {
		if (erroInterno != null) {
			this.erroInterno = erroInterno.substring(0, Math.min(erroInterno.length(), MAX_ERROR_SIZE - 1));
		} else {
			this.erroInterno = null;
		}

		return this;
	}
	
	public Lote adicionarEnvioEvento(EnvioEvento envioEvento) {
		this.enviosEvento.add(envioEvento);
		return this;
	}

}