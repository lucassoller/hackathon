package br.com.cwi.crescer.tcc.service.contato;

import br.com.cwi.crescer.tcc.dominio.Contato;
import br.com.cwi.crescer.tcc.dominio.dto.EdicaoContatoDto;
import br.com.cwi.crescer.tcc.repository.IContatoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class EditarContatoService {
    @Autowired
    IContatoRepository contatoRepository;

    @Autowired
    BuscarContatoPorIdService buscarContatoPorIdService;


    public void editar(EdicaoContatoDto edicaoContatoDto, Long idContato){
        if(Objects.isNull(edicaoContatoDto)){
            throw new IllegalArgumentException();
        }

        Contato contatoParaEditar = buscarContatoPorIdService.buscar(idContato);

        if(!Objects.isNull(edicaoContatoDto.getNomeCompleto()) && !edicaoContatoDto.getNomeCompleto().isEmpty()){
            contatoParaEditar.setNomeCompleto(edicaoContatoDto.getNomeCompleto());
        }

        if(!Objects.isNull(edicaoContatoDto.getTelefone()) && !edicaoContatoDto.getTelefone().isEmpty()){
            contatoParaEditar.setTelefone(edicaoContatoDto.getTelefone());
        }
        
        contatoRepository.save(contatoParaEditar);
    }
}
