package br.jus.tst.esocialjt.dominio;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "EST_TIPO")
public class TipoEvento implements Serializable {

	private static final long serialVersionUID = -3273472159459191662L;

	public static final TipoEvento S1000 = new TipoEvento(1000l);
	public static final TipoEvento S1005 = new TipoEvento(1005l);
	public static final TipoEvento S1010 = new TipoEvento(1010l);
	public static final TipoEvento S1020 = new TipoEvento(1020l);
	public static final TipoEvento S1070 = new TipoEvento(1070l);
	public static final TipoEvento S2200 = new TipoEvento(2200l);
	public static final TipoEvento S2205 = new TipoEvento(2205l);
	public static final TipoEvento S2206 = new TipoEvento(2206l);
	public static final TipoEvento S2210 = new TipoEvento(2210l);
	public static final TipoEvento S2220 = new TipoEvento(2220l);
	public static final TipoEvento S2230 = new TipoEvento(2230l);
	public static final TipoEvento S2231 = new TipoEvento(2231l);
	public static final TipoEvento S2240 = new TipoEvento(2240l);
	public static final TipoEvento S2298 = new TipoEvento(2298l);
	public static final TipoEvento S2299 = new TipoEvento(2299l);
	public static final TipoEvento S2300 = new TipoEvento(2300l);
	public static final TipoEvento S2306 = new TipoEvento(2306l);
	public static final TipoEvento S2399 = new TipoEvento(2399l);

	public static final TipoEvento S2400 = new TipoEvento(2400l);
	public static final TipoEvento S2405 = new TipoEvento(2405l);
	public static final TipoEvento S2410 = new TipoEvento(2410l);
	public static final TipoEvento S2416 = new TipoEvento(2416l);
	public static final TipoEvento S2418 = new TipoEvento(2418l);
	public static final TipoEvento S2420 = new TipoEvento(2420l);
		
	public static final TipoEvento S1200 = new TipoEvento(1200l);
	public static final TipoEvento S1202 = new TipoEvento(1202l);
	public static final TipoEvento S1207 = new TipoEvento(1207l);
	public static final TipoEvento S1210 = new TipoEvento(1210l);
	public static final TipoEvento S1298 = new TipoEvento(1298l);	
	public static final TipoEvento S1299 = new TipoEvento(1299l);	

	public static final TipoEvento S3000 = new TipoEvento(3000l);

	public static final TipoEvento INFORMACOES_EMPREGADOR = S1000;
	public static final TipoEvento TABELA_ESTABELECIMENTO = S1005;
	public static final TipoEvento TABELA_RUBRICA = S1010;
	public static final TipoEvento TABELA_LOTACAO = S1020;
	public static final TipoEvento TABELA_PROCESSO = S1070;
	public static final TipoEvento ADMISSAO_TRABALHADOR = S2200;
	public static final TipoEvento ALTERACAO_CADASTRAL = S2205;
	public static final TipoEvento ALTERACAO_CONTRATUAL = S2206;
	public static final TipoEvento CAT = S2210;
	public static final TipoEvento MONIT = S2220;
	public static final TipoEvento AFASTAMENTO_TEMPORARIO = S2230;
	public static final TipoEvento CESSAO = S2231;
	public static final TipoEvento EXP_RISCO = S2240;
	public static final TipoEvento REINTEGRACAO = S2298;
	public static final TipoEvento DESLIGAMENTO = S2299;
	public static final TipoEvento TSV_INICIO = S2300;
	public static final TipoEvento TSV_ALTERACAO_CONTRATUAL = S2306;
	public static final TipoEvento TSV_TERMINO = S2399;
	public static final TipoEvento CADASTRO_BENEFICIARIO_INI = S2400;
	public static final TipoEvento CADASTRO_BENEFICIARIO_ALT = S2405;
	public static final TipoEvento CADASTRO_BENEFICIO_INI = S2410;
	public static final TipoEvento CADASTRO_BENEFICIO_ALT = S2416;
	public static final TipoEvento REATIVACAO_BENEFICIO = S2418;
	public static final TipoEvento CADASTRO_BENEFICIO_TERM = S2420;
	public static final TipoEvento REMUNERACAO_RGPS = S1200;
	public static final TipoEvento REMUNERACAO_RPPS = S1202;
	public static final TipoEvento BENEFICIO_RPPS = S1207;
	public static final TipoEvento PAGAMENTOS = S1210;
	public static final TipoEvento REABERTURA_PERIODICOS = S1298;
	public static final TipoEvento FECHAMENTO_PERIODICOS = S1299;

	public static final TipoEvento EXCLUSAO = S3000;

	public static final TipoEvento[] naoPeriodicos = {
			S2200, S2205, S2206, S2230, S2231, S2298, S2299,
			S2300, S2306, S2399,
			S2400, S2405, S2410, S2416, S2418, S2420
	};

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
