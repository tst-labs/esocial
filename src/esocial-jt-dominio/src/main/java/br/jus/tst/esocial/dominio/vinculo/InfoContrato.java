package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class InfoContrato {
	
	@Size(min=1, max=30)
	private String codCargo;
	
	@Size(min=1, max=30)
	private String codFuncao;
	
	@NotNull
	private Integer codCateg;
	
	@Pattern(regexp="\\w{1,30}")
	private String codCarreira;
	
	private Calendar dtIngrCarr;
	
	@NotNull
	@Valid
	private Remuneracao remuneracao;
	
	@NotNull
	@Valid
	private Duracao duracao;
	
	@NotNull
	@Valid
	private LocalTrabalho localTrabalho;
	
	@Valid
	private HorContratual horContratual;
	
	@Valid
	@Size(min=0, max=2)
	private List<FiliacaoSindical> filiacaoSindical;
	
	@Valid
	private AlvaraJudicial alvaraJudicial;
	
	@Valid
	private List<Observacoes> observacoes;
	
	@Valid
	private ServPubl servPubl;

	public List<Observacoes> getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(List<Observacoes> observacoes) {
		this.observacoes = observacoes;
	}

	public String getCodCargo() {
		return codCargo;
	}

	public InfoContrato setCodCargo(String codCargo) {
		this.codCargo = codCargo;
		return this;
	}

	public String getCodFuncao() {
		return codFuncao;
	}

	public InfoContrato setCodFuncao(String codFuncao) {
		this.codFuncao = codFuncao;
		return this;
	}

	public Integer getCodCateg() {
		return codCateg;
	}

	public InfoContrato setCodCateg(Integer codCategoria) {
		this.codCateg = codCategoria;
		return this;
	}

	public String getCodCarreira() {
		return codCarreira;
	}

	public InfoContrato setCodCarreira(String codCarreira) {
		this.codCarreira = codCarreira;
		return this;
	}

	public Calendar getDtIngrCarr() {
		return dtIngrCarr;
	}

	public InfoContrato setDtIngrCarr(Calendar dataIngressoCarreira) {
		this.dtIngrCarr = dataIngressoCarreira;
		return this;
	}

	public Remuneracao getRemuneracao() {
		return remuneracao;
	}

	public InfoContrato setRemuneracao(Remuneracao remuneracao) {
		this.remuneracao = remuneracao;
		return this;
	}

	public Duracao getDuracao() {
		return duracao;
	}

	public InfoContrato setDuracao(Duracao duracao) {
		this.duracao = duracao;
		return this;
	}

	public LocalTrabalho getLocalTrabalho() {
		return localTrabalho;
	}

	public InfoContrato setLocalTrabalho(LocalTrabalho localTrabalho) {
		this.localTrabalho = localTrabalho;
		return this;
	}

	public HorContratual getHorContratual() {
		return horContratual;
	}

	public InfoContrato setHorContratual(HorContratual horaContratual) {
		this.horContratual = horaContratual;
		return this;
	}

	public List<FiliacaoSindical> getFiliacaoSindical() {
		return filiacaoSindical;
	}

	public InfoContrato setFiliacaoSindical(List<FiliacaoSindical> filiacaoSindical) {
		this.filiacaoSindical = filiacaoSindical;
		return this;
	}

	public AlvaraJudicial getAlvaraJudicial() {
		return alvaraJudicial;
	}

	public InfoContrato setAlvaraJudicial(AlvaraJudicial alvaraJudicial) {
		this.alvaraJudicial = alvaraJudicial;
		return this;
	}

	public ServPubl getServPubl() {
		return servPubl;
	}

	public void setServPubl(ServPubl servPubl) {
		this.servPubl = servPubl;
	}

}
