package br.jus.tst.esocialjt.upgrade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EST_CONTROLE_UPGRADE")
public class ControleUpgrade {
    @Id
    public Long codUpgrade;
    public String desUpgrade;

    public Long getCodUpgrade() {
        return codUpgrade;
    }

    public void setCodUpgrade(long codUpgrade) {
        this.codUpgrade = codUpgrade;
    }

    public String getDesUpgrade() {
        return desUpgrade;
    }

    public void setDesUpgrade(String desUpgrade) {
        this.desUpgrade = desUpgrade;
    }
}
