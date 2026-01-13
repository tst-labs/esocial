package br.jus.tst.esocialjt.evento;

import br.jus.tst.esocialjt.dominio.EventoTotalizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventoTotalizadorRepository extends JpaRepository<EventoTotalizador, Long> {

    @Query("SELECT et FROM EventoTotalizador et " +
           "JOIN et.evento e " +
           "JOIN e.ocorrencia o " +
           "WHERE et.tipo = :tipo " +
           "AND et.perApuracao = :perApuracao " +
           "AND o.ocorrenciaExclusaoId IS NULL " +
           "AND o.ocorrenciaRetificacaoId IS NULL " +
           "ORDER BY et.id ASC")
    List<EventoTotalizador> findByTipoAndPerApuracaoOrderById(@Param("tipo") String tipo, @Param("perApuracao") String perApuracao);
}
