package br.jus.tst.esocial.evento;

public class IdeEvento {

	private Byte indRetif;
	
	private String nrRecibo;
	
	private Byte indApuracao;
	
	private String perApur;
	
	private Byte tpAmb;
	
	private Byte procEmi;
	
	private String verProc;

	public Byte getIndRetif() {
		return indRetif;
	}

	public IdeEvento() {
		setTpAmb((byte) 2);
		setProcEmi((byte) 1);
		setVerProc("1");
		setIndRetif((byte) 1);
		//FIXME IdeEvento nos eventos de pagamento não são do tipo TIdeEveTrab, aparentemente os campos abaixo precisam ser tratados no domínio
		setIndApuracao((byte) 1);
		setPerApur("2018-09");
	}
	
	public void setIndRetif(Byte indRetif) {
		this.indRetif = indRetif;
	}

	public String getNrRecibo() {
		return nrRecibo;
	}

	public void setNrRecibo(String nrRecibo) {
		this.nrRecibo = nrRecibo;
	}

	public Byte getIndApuracao() {
		return indApuracao;
	}

	public void setIndApuracao(Byte indApuracao) {
		this.indApuracao = indApuracao;
	}

	public String getPerApur() {
		return perApur;
	}

	public void setPerApur(String perApur) {
		this.perApur = perApur;
	}

	public Byte getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(Byte tpAmb) {
		this.tpAmb = tpAmb;
	}

	public Byte getProcEmi() {
		return procEmi;
	}

	public void setProcEmi(Byte procEmi) {
		this.procEmi = procEmi;
	}

	public String getVerProc() {
		return verProc;
	}

	public void setVerProc(String verProc) {
		this.verProc = verProc;
	}
	
}
