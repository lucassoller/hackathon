// package br.com.cwi.crescer.tcc.security;
//
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.List;
//
// import br.com.cwi.crescer.tcc.dominio.Usuario;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
//
// import com.fasterxml.jackson.annotation.JsonIgnore;
//
// public class UserPrincipal implements UserDetails {
//
//     private static final String DEFAULT_ROLE = "ROLE_USER";
//
//     private Long id;
//
//     private String nomeCompleto;
//
//     private String imagem;
//
//     private String email;
//
//     private String telefone;
//
//     @JsonIgnore
//     private String senha;
//
//     private Collection<? extends GrantedAuthority> authorities;
//
//     public Long getId() {
//         return this.id;
//     }
//
//     public void setId(Long id) {
//         this.id = id;
//     }
//
//     public String getNomeCompleto() {
//         return this.nomeCompleto;
//     }
//
//     public void setNomeCompleto(String nome) {
//         this.nomeCompleto = nome;
//     }
//
//     public String getImagem() {
//         return this.imagem;
//     }
//
//     public void setImagem(String imagem) {
//         this.imagem = imagem;
//     }
//
//     public String getTelefone() {
//         return this.telefone;
//     }
//
//     public void setTelefone(String telefone) {
//         this.telefone = telefone;
//     }
//
//     public String getEmail() {
//         return this.email;
//     }
//
//     public void setEmail(String email) {
//         this.email = email;
//     }
//
//     public String getSenha() {
//         return this.senha;
//     }
//
//     public void setSenha(String senha) {
//         this.senha = senha;
//     }
//
//     public UserPrincipal(Long id, String nomeCompleto, String imagem, String email, String senha, String telefone, Collection<? extends GrantedAuthority> authorities) {
//         this.id = id;
//         this.nomeCompleto = nomeCompleto;
//         this.imagem = imagem;
//         this.email = email;
//         this.senha = senha;
//         this.authorities = authorities;
//         this.telefone = telefone;
//     }
//
//     public static UserPrincipal create(Usuario usuario) {
//         List<GrantedAuthority> authorities = Arrays.asList(
//             new SimpleGrantedAuthority(usuario.getRole().orElse(DEFAULT_ROLE))
//         );
//
//         return new UserPrincipal(
//             usuario.getId(),
//             usuario.getNomeCompleto(),
//             usuario.getEmail(),
//             usuario.getSenha(),
//             usuario.getTelefone(),
//             usuario.getImagem(),
//             authorities
//         );
//     }
//
//     @Override
//     public String getUsername() {
//         return email;
//     }
//
//     @Override
//     public String getPassword() {
//         return senha;
//     }
//
//     @Override
//     public Collection<? extends GrantedAuthority> getAuthorities() {
//         return authorities;
//     }
//
//     @Override
//     public boolean isAccountNonExpired() {
//         return true;
//     }
//
//     @Override
//     public boolean isAccountNonLocked() {
//         return true;
//     }
//
//     @Override
//     public boolean isCredentialsNonExpired() {
//         return true;
//     }
//
//     @Override
//     public boolean isEnabled() {
//         return true;
//     }
//
// }