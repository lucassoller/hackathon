// package br.com.cwi.crescer.tcc.web;
// import br.com.cwi.crescer.tcc.dominio.Contato;
// import br.com.cwi.crescer.tcc.dominio.Usuario;
// import br.com.cwi.crescer.tcc.dominio.dto.ContatoDto;
// import br.com.cwi.crescer.tcc.dominio.dto.EdicaoContatoDto;
// import br.com.cwi.crescer.tcc.dominio.dto.EdicaoDto;
// import br.com.cwi.crescer.tcc.repository.IContatoRepository;
// import br.com.cwi.crescer.tcc.repository.IUsuarioRepository;
// import br.com.cwi.crescer.tcc.repository.projection.UsuarioResponse;
// import br.com.cwi.crescer.tcc.service.contato.SalvarContatoService;
// import br.com.cwi.crescer.tcc.service.contato.EditarContatoService;
// import br.com.cwi.crescer.tcc.service.contato.RemoverContatoService;
// // import br.com.cwi.crescer.tcc.security.UserPrincipal;
// import br.com.cwi.crescer.tcc.service.usuario.*;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// // import org.springframework.security.core.annotation.AuthenticationPrincipal;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RequestMapping("/contato")
// @RestController
// public class ContatoController {

//     @Autowired
//     private IContatoRepository repository;

//     @Autowired
//     private SalvarContatoService salvarUsuarioService;

//     @Autowired
//     private EditarContatoService editarContatoService;

//     @Autowired
//     private RemoverContatoService removerContatoService;

//     @GetMapping
//     public List<Contato> listar(){
//         return repository.findAll();
//     }

//     @PutMapping("/{id}")
//     public void editar(@PathVariable("id") Long id, @RequestBody EdicaoContatoDto edicaoContatoDto){
//         editarContatoService.editar(edicaoContatoDto, id);
//     }

//     @DeleteMapping("/{id}")
//     @ResponseStatus(HttpStatus.NO_CONTENT)
//     public void remover(@PathVariable("id") Long id){
//         removerContatoService.remover(id);
//     }

//     @PostMapping
//     @ResponseStatus(HttpStatus.CREATED)
//     public void salvar(@RequestBody ContatoDto contatoDto){
//         salvarUsuarioService.salvar(contatoDto);
//     }
// }
