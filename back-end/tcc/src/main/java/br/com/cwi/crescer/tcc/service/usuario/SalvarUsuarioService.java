package br.com.cwi.crescer.tcc.service.usuario;

import br.com.cwi.crescer.tcc.dominio.Usuario;
import br.com.cwi.crescer.tcc.dominio.dto.UsuarioDto;
import br.com.cwi.crescer.tcc.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class SalvarUsuarioService {
    @Autowired
    IUsuarioRepository usuarioRepository;

    @Autowired
    BuscarEmailUsadoService buscarEmailUsadoService;

    public void salvar(UsuarioDto usuarioDto){
        if(Objects.isNull(usuarioDto)){
            throw new IllegalArgumentException();
        }
        if(Objects.isNull(usuarioDto.getNomeCompleto()) || usuarioDto.getNomeCompleto().isEmpty()){
            throw new IllegalArgumentException("O nome não pode estar em branco");
        }
        if(Objects.isNull(usuarioDto.getEmail()) || usuarioDto.getEmail().isEmpty()){
            throw new IllegalArgumentException("O e-mail não pode estar em branco");
        }
        if(Objects.isNull(usuarioDto.getSenha()) || usuarioDto.getSenha().isEmpty()){
           throw new IllegalArgumentException("A senha não pode estar em branco");
        }
        if(Objects.isNull(usuarioDto.getTelefone()) || usuarioDto.getTelefone().isEmpty()){
            throw new IllegalArgumentException("O telefone não pode estar em branco");
        }
        if(usuarioRepository.findByEmail(usuarioDto.getEmail()).isPresent()){
            throw new IllegalArgumentException("Este e-mail já está em uso");
        }

        Usuario usuario = new Usuario();

        usuario.setNomeCompleto(usuarioDto.getNomeCompleto());
        usuario.setEmail(usuarioDto.getEmail());
        usuario.setImagem(usuarioDto.getImagem());
        usuario.setTelefone(usuarioDto.getTelefone());
        usuario.setSenha(usuarioDto.getSenha());
        usuarioRepository.save(usuario);
    }
}
