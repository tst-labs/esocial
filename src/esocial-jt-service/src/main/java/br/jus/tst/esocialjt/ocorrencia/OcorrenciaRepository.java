package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long>, JpaSpecificationExecutor<Ocorrencia> {

    @Query(nativeQuery = true,
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

    @Query("SELECT new br.jus.tst.esocialjt.ocorrencia.OcorrenciaSumario(" +
            "o.id, " +
            "o.cpf, " +
            "o.matricula, " +
            "o.referencia, " +
            "o.evento.tipoEvento.id, " +
			"o.evento.estado.descricao, " +
            "o.dataOcorrencia " +
            ") " +
            "FROM Ocorrencia o " +
            "WHERE o.evento.tipoEvento = ?1")
    List<OcorrenciaSumario> getSumario(TipoEvento tipoEvento);
}
