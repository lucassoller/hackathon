package br.com.cwi.crescer.tcc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;
import br.com.cwi.crescer.tcc.dominio.Localizacao;

public interface ILocalizacaoRepository extends Repository<Localizacao,Long> {
    List<Localizacao> findAll();
    Optional<Localizacao> save(Localizacao localizacao);
}