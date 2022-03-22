package br.jus.tst.esocialjt.ocorrencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import br.jus.tst.esocialjt.dominio.Ocorrencia;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long>, JpaSpecificationExecutor<Ocorrencia> {
	
	@Query( nativeQuery = true,
			value = 
			"SELECT DISTINCT(T1.COD_TIPO) "
			+ " FROM EST_EVENTO T1 "
			+ " ORDER BY 1")
	List<Long> buscarTiposEnviados();
	
	@Modifying
	@Query("update Ocorrencia o set o.arquivado = 'S' where o.id = ?1")
	int arquivar(Long id);

	@Modifying
	@Query("update Ocorrencia o set o.arquivado = null where o.id = ?1")
	int desarquivar(Long id);
}
