package br.jus.tst.esocialjt.dominio;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.Type;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.DadosOcorrencia;

@Entity
@Table(name = "EST_OCORRENCIA")
@NamedQueries({ @NamedQuery(name = "Ocorrencia.findAll", query = "SELECT o FROM Ocorrencia o"),
		@NamedQuery(name = "Ocorrencia.ocorrenciasSemEvento", query = "SELECT o FROM Ocorrencia o where o.id NOT IN (SELECT e.ocorrencia.id FROM Evento e)"),
		@NamedQuery(name = "Ocorrencia.findNecessaryDataOnly", 
		query = "SELECT new br.jus.tst.esocialjt.ocorrencia.OcorrenciaDadosBasicosDTO(o.id, o.tipoOcorrencia, o.dataOcorrencia, estadoEvento, ocorrenciaTipoEvento)  "
				+ " FROM Ocorrencia o " 
				+ " LEFT JOIN o.evento ocorrenciaEvento"
				+ " LEFT JOIN ocorrenciaEvento.estado estadoEvento"
				+ " LEFT JOIN ocorrenciaEvento.tipoEvento ocorrenciaTipoEvento" 
				+ " ") })
public class Ocorrencia implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(Ocorrencia.class);

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_OCORRENCIA_ID")
	@SequenceGenerator(name = "SEQ_OCORRENCIA_ID", sequenceName = "SEQ_OCORRENCIA_ID", allocationSize = 1)
	@Column(name = "COD_OCORRENCIA", unique = true, nullable = false, precision = 22, scale = 0)
	private Long id;

	@Column(name = "TXT_TIPO_OCORRENCIA")
	@Enumerated(EnumType.STRING)
	private TipoOcorrencia tipoOcorrencia;

	@Column(name = "TXT_REFERENCIA")
	private String referencia;

	@Column(name = "TXT_OPERACAO")
	@Enumerated(EnumType.STRING)
	private Operacao operacao;

	@Column(name = "DTA_OCORRENCIA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataOcorrencia;

	@Column(name = "DTA_RECEBIMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataRecebimento;

	@Lob
	@Type(type = "org.hibernate.type.TextType")
	@Column(name = "TXT_DADOS_OCORRENCIA")
	@Access(AccessType.PROPERTY)
	private String txtDadosOcorrencia;

	@Transient
	private DadosOcorrencia dadosOcorrencia;

	@JsonManagedReference
	@OneToOne(mappedBy = "ocorrencia", cascade = { CascadeType.ALL,
			CascadeType.REMOVE }, orphanRemoval = true, fetch = FetchType.LAZY, optional = true)
	private Evento evento;

	public Long getId() {
		return id;
	}

	public Ocorrencia setId(Long id) {
		this.id = id;
		return this;
	}

	public TipoOcorrencia getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	public Ocorrencia setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
		return this;
	}

	public String getReferencia() {
		return referencia;
	}

	public Ocorrencia setReferencia(String referencia) {
		this.referencia = referencia;
		return this;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public Ocorrencia setOperacao(Operacao operacao) {
		this.operacao = operacao;
		return this;
	}

	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}

	public Ocorrencia setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
		return this;
	}

	public Date getDataRecebimento() {
		return dataRecebimento;
	}

	public Ocorrencia setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
		return this;
	}

	public DadosOcorrencia getDadosOcorrencia() {
		return dadosOcorrencia;
	}

	public Ocorrencia setDadosOcorrencia(DadosOcorrencia dadosOcorrencia) {
		this.dadosOcorrencia = dadosOcorrencia;

		if (dadosOcorrencia != null) {
			try {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.setSerializationInclusion(Include.NON_NULL);
				txtDadosOcorrencia = objectMapper.writeValueAsString(dadosOcorrencia);
			} catch (IOException e) {
				LOGGER.error(e.getMessage(), e);
			}
		} else {
			txtDadosOcorrencia = null;
		}

		return this;
	}

	public Evento getEvento() {
		return evento;
	}

	public Ocorrencia setEvento(Evento evento) {
		this.evento = evento;
		return this;
	}

	protected String getTxtDadosOcorrencia() {
		return txtDadosOcorrencia;
	}

	protected Ocorrencia setTxtDadosOcorrencia(String txtDadosOcorrencia) {
		this.txtDadosOcorrencia = txtDadosOcorrencia;

		if (StringUtils.isNotBlank(txtDadosOcorrencia)) {
			try {
				dadosOcorrencia = new ObjectMapper().readValue(txtDadosOcorrencia, DadosOcorrencia.class);
			} catch (IOException e) {
				LOGGER.error(e.getMessage(), e);
			}
		} else {
			dadosOcorrencia = null;
		}

		return this;
	}

}
