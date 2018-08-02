package br.jus.tst.esocialjt.dominio;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "EST_ESTADO")
@NamedQueries({ @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e"),
		@NamedQuery(name = "Estado.findByDescricao", query = "SELECT e FROM Estado e WHERE e.descricao = :descricao") })
public class Estado implements Serializable {

	private static final long serialVersionUID = -7090363612697035728L;
	
	public static final Estado EM_FILA = new Estado(1l, "EM FILA");
	public static final Estado PROCESSAMENTO = new Estado(2l, "PROCESSAMENTO");
	public static final Estado PROCESSADO_COM_SUCESSO = new Estado(3l, "PROCESSADO COM SUCESSO");
	public static final Estado PROCESSADO_COM_ERRO = new Estado(4l, "PROCESSADO COM ERRO");
	public static final Estado ERRO = new Estado(5l, "ERRO");

	@Id
	@Basic(optional = false)
	@Column(name = "COD_ESTADO")
	private Long id;

	@Column(name = "TXT_DESCRICAO")
	private String descricao;

	public Estado() {
	}

	public Estado(Long id) {
		this.id = id;
	}
	
	public Estado(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
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
