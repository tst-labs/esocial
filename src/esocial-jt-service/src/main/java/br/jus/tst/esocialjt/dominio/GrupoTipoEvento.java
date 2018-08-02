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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "EST_GRUPO_TIPO_EVENTO")
@NamedQueries({ @NamedQuery(name = "GrupoTipoEvento.findAll", query = "SELECT e FROM GrupoTipoEvento e"),
		@NamedQuery(name = "GrupoTipoEvento.findByDescricao", query = "SELECT e FROM GrupoTipoEvento e WHERE e.descricao = :descricao") })
public class GrupoTipoEvento implements Serializable {

	private static final long serialVersionUID = -9079287043407466600L;

	public static final GrupoTipoEvento TABELA = new GrupoTipoEvento(1l);
	public static final GrupoTipoEvento NAO_PERIODICO = new GrupoTipoEvento(2l);
	public static final GrupoTipoEvento PERIODICO = new GrupoTipoEvento(3l);

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "COD_GRUPO_TIPO")
	private Long id;

	@Size(max = 100)
	@Column(name = "TXT_DESCRICAO")
	private String descricao;

	public GrupoTipoEvento() {
	}

	public GrupoTipoEvento(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public GrupoTipoEvento setId(Long id) {
		this.id = id;
		return this;
	}

	public String getDescricao() {
		return descricao;
	}

	public GrupoTipoEvento setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof GrupoTipoEvento)) {
			return false;
		}
		GrupoTipoEvento castOther = (GrupoTipoEvento) other;
		return new EqualsBuilder().append(id, castOther.id).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).toHashCode();
	}
}
