package br.jus.tst.esocialjt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.tst.esocialjt.dominio.Ocorrencia;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {

}
