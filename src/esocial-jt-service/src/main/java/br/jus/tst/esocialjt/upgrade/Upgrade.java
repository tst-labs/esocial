package br.jus.tst.esocialjt.upgrade;

public enum Upgrade {
    CAMPO_CPF_MATRICULA(1, "Atualização de valores de CPF e Matricula na entidade Ocorrencia");

    public final long codUpgrade;
    public final String desUpgrade;

    Upgrade(long codUpgrade, String desUpgrade) {
        this.codUpgrade = codUpgrade;
        this.desUpgrade = desUpgrade;
    }
}
