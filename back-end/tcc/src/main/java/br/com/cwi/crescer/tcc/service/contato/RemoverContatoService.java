package br.com.cwi.crescer.tcc.service.contato;

import br.com.cwi.crescer.tcc.dominio.Contato;
import br.com.cwi.crescer.tcc.repository.IContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RemoverContatoService {
    @Autowired
    IContatoRepository contatoRepository;

    @Autowired
    BuscarContatoPorIdService buscarContatoPorIdService;

    public void remover(Long id){
        if(Objects.isNull(id)){
            throw new IllegalArgumentException("O id não pode estar em branco");
        }
        Contato contatoParaRemover = buscarContatoPorIdService.buscar(id);
        contatoRepository.delete(contatoParaRemover);
    }
}
