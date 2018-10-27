package br.com.cwi.crescer.tcc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.cwi.crescer.tcc.dominio.Localizacao;
import br.com.cwi.crescer.tcc.repository.ILocalizacaoRepository;
import org.springframework.http.HttpStatus;

@RequestMapping("/localizacao")
@RestController
public class LocalizacaoController {

    @Autowired
    ILocalizacaoRepository repository;

    @GetMapping
    public List<Localizacao> listar(){
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody Localizacao localizacao){
        repository.save(localizacao);
    }

}