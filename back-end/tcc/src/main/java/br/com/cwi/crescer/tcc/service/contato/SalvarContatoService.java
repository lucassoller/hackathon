package br.com.cwi.crescer.tcc.service.contato;

import br.com.cwi.crescer.tcc.dominio.Contato;
import br.com.cwi.crescer.tcc.dominio.dto.ContatoDto;
import br.com.cwi.crescer.tcc.repository.IContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class SalvarContatoService {
    @Autowired
    IContatoRepository contatoRepository;

    public void salvar(ContatoDto contatoDto){
        if(Objects.isNull(contatoDto)){
            throw new IllegalArgumentException();
        }
        if(Objects.isNull(contatoDto.getNomeCompleto()) || contatoDto.getNomeCompleto().isEmpty()){
            throw new IllegalArgumentException("O nome do contato não pode estar em branco");
        }
        if(Objects.isNull(contatoDto.getTelefone()) || contatoDto.getTelefone().isEmpty()){
            throw new IllegalArgumentException("O telefone não pode estar em branco");
        }

        Contato contato = new Contato();

        contato.setNomeCompleto(contatoDto.getNomeCompleto());
        contato.setTelefone(contatoDto.getTelefone());
        contatoRepository.save(contato);
    }
}
