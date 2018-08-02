package br.jus.tst.esocialjt.dominio;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "EST_TIPO_ERRO_PROCESSAMENTO")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TipoErroProcessamento.findAll", query = "SELECT e FROM TipoErroProcessamento e"),
		@NamedQuery(name = "TipoErroProcessamento.findByDescricao", query = "SELECT e FROM TipoErroProcessamento e WHERE e.descricao = :descricao") })
public class TipoErroProcessamento implements Serializable {

	private static final long serialVersionUID = 3675898429939256502L;

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "COD_TIPO_ERRO_PROCESSAMENTO")
	private Long id;

	@Size(max = 15)
	@Column(name = "DES_TIPO_OCORRENCIA")
	private String descricao;

	public TipoErroProcessamento() {
	}

	public TipoErroProcessamento(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
