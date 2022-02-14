package br.jus.tst.esocialjt.ocorrencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import br.jus.tst.esocialjt.dominio.Ocorrencia;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long>, JpaSpecificationExecutor<Ocorrencia> {
	@Query("SELECT "
			+ " o.evento.estado.id as estado, "
			+ " COUNT(o.evento.estado.id) as total "
			+ " FROM Ocorrencia o GROUP BY o.evento.estado.id")
	List<ContagemEstado> contarTotalPorEstado();
}
