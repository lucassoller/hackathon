package br.com.cwi.crescer.tcc.repository;

import br.com.cwi.crescer.tcc.dominio.Contato;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface IContatoRepository extends Repository<Contato, Long> {
    List<Contato> findAll();

    Optional<Contato> save(Contato contato);

    Optional<Contato> findById(Long id);

    void delete(Contato contato);
}
