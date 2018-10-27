package br.com.cwi.crescer.tcc.service.usuario;

import br.com.cwi.crescer.tcc.dominio.Usuario;
import br.com.cwi.crescer.tcc.dominio.dto.LoginRequestDto;
import br.com.cwi.crescer.tcc.dominio.dto.LoginResponseDto;
// import br.com.cwi.crescer.tcc.security.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginService {

    @Autowired
    BuscarUsuarioPorEmailService buscarUsuarioPorEmailService;

//     @Autowired
//     AuthenticationService authenticationService;

    public LoginResponseDto logar (LoginRequestDto loginRequestDto){
        String email = loginRequestDto.getEmail();

        String senha = loginRequestDto.getSenha();

        if(Objects.isNull(email) || email.isEmpty()){
            throw new IllegalArgumentException("O e-mail não pode estar em branco");
        }
        if(Objects.isNull(senha) || senha.isEmpty()){
            throw new IllegalArgumentException("A senha não pode estar em branco");
        }

        Usuario usuario = buscarUsuarioPorEmailService.buscar(email);


        if(!senha.equals(usuario.getSenha())){
            throw new IllegalArgumentException("Senha incorreta");
        }

//         String token = authenticationService.authenticate(email, usuario.getSenha());

        String token = "123";
        return new LoginResponseDto(email, token, usuario.getId());
    }
}
