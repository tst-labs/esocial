package br.jus.tst.esocialjt.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "EST_ERRO_PROCESSAMENTO")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ErroProcessamento.findAll", query = "SELECT e FROM ErroProcessamento e"),
		@NamedQuery(name = "ErroProcessamento.findByDescricao", query = "SELECT e FROM ErroProcessamento e WHERE e.descricao = :descricao"),
		@NamedQuery(name = "ErroProcessamento.findByLocalizacao", query = "SELECT e FROM ErroProcessamento e WHERE e.localizacao = :localizacao") })
public class ErroProcessamento implements Serializable {

	private static final long serialVersionUID = 3577546025813162527L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ERRO_PROCESSAMENTO_ID")
	@SequenceGenerator(name = "SEQ_ERRO_PROCESSAMENTO_ID", sequenceName = "SEQ_ERRO_PROCESSAMENTO_ID", allocationSize = 1)
	@Column(name = "COD_ERRO_PROCESSAMENTO")
	private Long id;

	@Size(max = 4000)
	@Column(name = "DES_ERRO")
	private String descricao;

	@Size(max = 300)
	@Column(name = "TXT_LOCALIZACAO")
	private String localizacao;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_ENVIO_EVENTO", referencedColumnName = "COD_ENVIO_EVENTO")
	private EnvioEvento envioEvento;

	@JoinColumn(name = "COD_TIPO_ERRO_PROCESSAMENTO", referencedColumnName = "COD_TIPO_ERRO_PROCESSAMENTO")
	@ManyToOne
	private TipoErroProcessamento tipoErroProcessamento;

	@Column(name = "COD_MENSAGEM")
	private Long codMensagem;

	public ErroProcessamento() {
	}

	public ErroProcessamento(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public ErroProcessamento setId(Long id) {
		this.id = id;
		return this;
	}

	public String getDescricao() {
		return descricao;
	}

	public ErroProcessamento setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public ErroProcessamento setLoacalizacao(String localizacao) {
		this.localizacao = localizacao;
		return this;
	}

	public EnvioEvento getEnvioEvento() {
		return envioEvento;
	}

	public ErroProcessamento setEnvioEvento(EnvioEvento envioEvento) {
		this.envioEvento = envioEvento;
		return this;
	}

	public ErroProcessamento setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
		return this;
	}

	public TipoErroProcessamento getTipoErroProcessamento() {
		return tipoErroProcessamento;
	}

	public ErroProcessamento setTipoErroProcessamento(TipoErroProcessamento tipoErroProcessamento) {
		this.tipoErroProcessamento = tipoErroProcessamento;
		return this;
	}

	public Long getCodMensagem() {
		return codMensagem;
	}

	public ErroProcessamento setCodMensagem(Long codMensagem) {
		this.codMensagem = codMensagem;
		return this;
	}
}
