package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

    @Query("SELECT o.id FROM Ocorrencia o WHERE o.retificarRecibo = ?1 AND o.evento.estado.id = ?2 AND o.tipoOcorrencia = ?3")
    List<Long> buscarRetificacoes(String retificarRecibo, Long estadoId, TipoOcorrencia tipoOcorrencia);

    @Query("SELECT o.id, o.retificarRecibo FROM Ocorrencia o WHERE o.retificarRecibo IS NOT NULL AND o.evento.estado.id = ?1")
    List<Object[]> buscarOcorrenciasComRetificacao(Long estadoId);

    @Query("SELECT o FROM Ocorrencia o WHERE o.evento.nrRecibo = ?1")
    List<Ocorrencia> buscarPorRecibo(String recibo);

    @Query("SELECT o.id FROM Ocorrencia o WHERE " +
            "(:#{#estados.isEmpty()} = true OR o.evento.estado IN :estados) AND " +
            "(:#{#tipos.isEmpty()} = true OR o.evento.tipoEvento IN :tipos) AND " +
            "(:#{#cpfs.isEmpty()} = true OR o.cpf IN :cpfs) AND " +
            "(:#{#periodosApuracao.isEmpty()} = true OR o.periodoApuracao IN :periodosApuracao) AND " +
            "o.ocorrenciaExclusaoId IS NULL AND " +
            "o.ocorrenciaRetificacaoId IS NULL")
    List<Long> buscarIdsPorFiltros(
            @Param("estados") List<Estado> estados,
            @Param("tipos") List<TipoEvento> tipos,
            @Param("cpfs") List<String> cpfs,
            @Param("periodosApuracao") List<String> periodosApuracao
    );

}
