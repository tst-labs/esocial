package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotNull;
import java.util.List;

public class InfoReembDep {
    @NotNull
    private String cpfBenef;
    private List<DetReemb> detReembDep;

    public String getCpfBenef() {
        return cpfBenef;
    }

    public void setCpfBenef(String cpfBenef) {
        this.cpfBenef = cpfBenef;
    }

    public List<DetReemb> getDetReembDep() {
        return detReembDep;
    }

    public void setDetReembDep(List<DetReemb> detReembDep) {
        this.detReembDep = detReembDep;
    }
}
