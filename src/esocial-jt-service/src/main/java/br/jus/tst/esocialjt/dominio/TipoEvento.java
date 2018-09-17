package br.jus.tst.esocialjt.dominio;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "EST_TIPO")
public class TipoEvento implements Serializable {

	private static final long serialVersionUID = -3273472159459191662L;

	public static final TipoEvento S1000 = new TipoEvento(1000l);
	public static final TipoEvento S1005 = new TipoEvento(1005l);
	public static final TipoEvento S1010 = new TipoEvento(1010l);
	public static final TipoEvento S1020 = new TipoEvento(1020l);
	public static final TipoEvento S1030 = new TipoEvento(1030l);
	public static final TipoEvento S1035 = new TipoEvento(1035l);
	public static final TipoEvento S1040 = new TipoEvento(1040l);
	public static final TipoEvento S1050 = new TipoEvento(1050l);
	public static final TipoEvento S1060 = new TipoEvento(1060l);
	public static final TipoEvento S1070 = new TipoEvento(1070l);
	public static final TipoEvento S2200 = new TipoEvento(2200l);
	public static final TipoEvento S2205 = new TipoEvento(2205l);
	public static final TipoEvento S2206 = new TipoEvento(2206l);
	public static final TipoEvento S2230 = new TipoEvento(2230l);
	public static final TipoEvento S2298 = new TipoEvento(2298l);
	public static final TipoEvento S2299 = new TipoEvento(2299l);
	public static final TipoEvento S2300 = new TipoEvento(2300l);
	
	public static final TipoEvento INFORMACOES_EMPREGADOR = S1000;
	public static final TipoEvento TABELA_ESTABELECIMENTO = S1005; 
	public static final TipoEvento TABELA_RUBRICA = S1010; 
	public static final TipoEvento TABELA_LOTACAO = S1020; 
	public static final TipoEvento TABELA_CARGO = S1030;  
	public static final TipoEvento TABELA_CARREIRA = S1035;  
	public static final TipoEvento TABELA_FUNCAO = S1040;  
	public static final TipoEvento TABELA_HORARIO = S1050; 
	public static final TipoEvento TABELA_AMBIENTE = S1060; 
	public static final TipoEvento TABELA_PROCESSO = S1070;  
	public static final TipoEvento ADMISSAO_TRABALHADOR = S2200;  
	public static final TipoEvento ALTERACAO_CADASTRAL = S2205;  
	public static final TipoEvento ALTERACAO_CONTRATUAL = S2206;
	public static final TipoEvento AFASTAMENTO_TEMPORARIO = S2230;
	public static final TipoEvento REINTEGRACAO = S2298;
	public static final TipoEvento DESLIGAMENTO = S2299;
	public static final TipoEvento TSV_INICIO = S2300;
	

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "COD_TIPO")
	private Long id;

	@Size(max = 100)
	@Column(name = "DES_TIPO")
	private String desTipo;

	@JoinColumn(name = "COD_GRUPO_TIPO", referencedColumnName = "COD_GRUPO_TIPO")
	@ManyToOne
	private GrupoTipoEvento grupoTipoEvento;

	public TipoEvento() {
	}

	public TipoEvento(Long id) {
		this.id = id;
	}

	public Long getCodTipo() {
		return id;
	}

	public void setCodTipo(Long id) {
		this.id = id;
	}

	public String getDesTipo() {
		return desTipo;
	}

	public void setDesTipo(String desTipo) {
		this.desTipo = desTipo;
	}

	public GrupoTipoEvento getGrupoTipoEvento() {
		return grupoTipoEvento;
	}

	public void setGrupoTipoEvento(GrupoTipoEvento grupoTipoEvento) {
		this.grupoTipoEvento = grupoTipoEvento;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoEvento other = (TipoEvento) obj;
		return new EqualsBuilder().append(id, other.id).isEquals();
	}

}
