package br.jus.tst.esocialjt.dominio;

import br.jus.tst.esocialjt.util.OcorrenciaJsonSerializer;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "EST_EVENTO")
@NamedQueries({@NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e"),
		@NamedQuery(name = "Evento.recuperarEventoPorIdEvento", query = "SELECT e FROM Evento e WHERE e.idEvento =:idEvento"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Evento implements Serializable {

	private static final long serialVersionUID = -3712811249360102207L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EVT_ID")
	@SequenceGenerator(name = "SEQ_EVT_ID", sequenceName = "SEQ_EVT_ID", allocationSize = 1)
	@Column(name = "COD_EVENTO", unique = true, nullable = false, precision = 22, scale = 0)
	private Long id;

	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "COD_OCORRENCIA")
	@JsonSerialize(using = OcorrenciaJsonSerializer.class)
	@JsonBackReference
	private Ocorrencia ocorrencia;

	@JoinColumn(name = "COD_ESTADO", referencedColumnName = "COD_ESTADO")
	@ManyToOne
	private Estado estado;

	@Size(max = 36)
	@Column(name = "TXT_ID_EVENTO")
	private String idEvento;

	@JoinColumn(name = "COD_TIPO", referencedColumnName = "COD_TIPO")
	@ManyToOne
	private TipoEvento tipoEvento;
	
	@OneToMany(mappedBy = "evento", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@OrderBy("id asc")
	private Set<EnvioEvento> enviosEvento = new LinkedHashSet<>();

	@Size(max = 40)
	@Column(name = "TXT_NR_RECIBO")
	private String nrRecibo;

	@JsonInclude(Include.NON_EMPTY)
	@OneToMany(mappedBy = "evento", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<EventoTotalizador> eventoTotalizador = new LinkedHashSet<>();

	@JsonIgnore
	@Transient
	private boolean estadoAlterado;

	public Long getId() {
		return id;
	}

	public Evento setId(Long id) {
		this.id = id;
		return this;
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public Evento setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
		return this;
	}

	public Estado getEstado() {
		return estado;
	}

	public Evento setEstado(Estado estado) {
		estadoAlterado = !Objects.equals(this.estado, estado);
		this.estado = estado;
		return this;
	}

	public String getIdEvento() {
		return idEvento;
	}

	public Evento setIdEvento(String idEvento) {
		this.idEvento = idEvento;
		return this;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public Evento setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
		return this;
	}
	
	public Set<EnvioEvento> getEnviosEvento() {
		return enviosEvento;
	}

	public Evento setEnviosEvento(Set<EnvioEvento> enviosEvento) {
		this.enviosEvento = enviosEvento;
		return this;
	}

	public void adicionarEnvioEvento(EnvioEvento envioEvento) {
		this.enviosEvento.add(envioEvento);
		envioEvento.setEvento(this);
	}

	public String getNrRecibo() {
		return nrRecibo;
	}

	public void setNrRecibo(String nrRecibo) {
		this.nrRecibo = nrRecibo;
	}

	public Set<EventoTotalizador> getEventoTotalizador() {
		return eventoTotalizador;
	}

	public void setEventoTotalizador(Set<EventoTotalizador> eventoTotalizador) {
		this.eventoTotalizador = eventoTotalizador;
	}

	public boolean isEstadoAlterado() {
		return estadoAlterado;
	}

	public void setEstadoAlterado(boolean estadoAlterado) {
		this.estadoAlterado = estadoAlterado;
	}
}
