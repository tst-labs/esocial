package br.jus.tst.esocialjt.evento;

import br.jus.tst.esocialjt.dominio.EventoTotalizador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventoTotalizadorRepository extends JpaRepository<EventoTotalizador, Long> {
    List<EventoTotalizador> findByTipoAndPerApuracaoOrderById(String tipo, String perApuracao);
}
