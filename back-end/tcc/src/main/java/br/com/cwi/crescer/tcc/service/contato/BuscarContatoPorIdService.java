package br.com.cwi.crescer.tcc.service.contato;
import br.com.cwi.crescer.tcc.dominio.Contato;
import br.com.cwi.crescer.tcc.repository.IContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BuscarContatoPorIdService {
    @Autowired
    IContatoRepository contatoRepository;
    public Contato buscar(Long id){
        if(Objects.isNull(id)){
            throw new IllegalArgumentException("O id não pode estar em branco");
        }
        return contatoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Contato não encontrado"));
    }
}
