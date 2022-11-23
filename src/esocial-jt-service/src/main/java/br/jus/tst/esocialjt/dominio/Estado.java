package br.jus.tst.esocialjt.dominio;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
	public static final List<Estado> listaEstados = Arrays.asList(EM_FILA, PROCESSAMENTO, PROCESSADO_COM_SUCESSO, PROCESSADO_COM_ERRO, ERRO);

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Estado estado = (Estado) o;
		return Objects.equals(id, estado.id) && Objects.equals(descricao, estado.descricao);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, descricao);
	}
}
