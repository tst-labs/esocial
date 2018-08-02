package br.jus.tst.esocialjt.ocorrencia;

import java.util.Date;

import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.TipoEvento;

public class OcorrenciaDadosBasicosDTO {
    private Long id;
    private TipoOcorrencia tipo;
    private Date data;
    private Estado estadoEvento;
    private TipoEvento tipoEvento;

    public OcorrenciaDadosBasicosDTO(Long id, TipoOcorrencia tipoOcorrencia, Date dataOcorrencia, Estado estadoEvento, TipoEvento tipoEvento) {
        this.id = id;
        this.tipo = tipoOcorrencia;
        this.data = dataOcorrencia;
        this.estadoEvento = estadoEvento;
        this.tipoEvento = tipoEvento;     
    }

	public Long getId() {
		return id;
	}

	public TipoOcorrencia getTipo() {
		return tipo;
	}

	public Date getData() {
		return data;
	}

	public Estado getEstadoEvento() {
		return estadoEvento;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
}
