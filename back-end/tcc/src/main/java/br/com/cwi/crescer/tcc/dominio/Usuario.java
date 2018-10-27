package br.com.cwi.crescer.tcc.dominio;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "USUARIO")
public class Usuario {


//     public static String getSEQUENCE() {
//         return SEQUENCE;
//     }
//
//     private static final String SEQUENCE = "USUARIO_SEQ";

    @Id
//     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
//     @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID_USUARIO", nullable = false, precision = 10, unique = true)
    private Long id;


    @Column(name = "NOME_COMPLETO", nullable = false, length = 50)
    private String nomeCompleto;

    @Column(name = "EMAIL", nullable = false, length = 30, unique = true)
    private String email;

    @JsonIgnore
    @Column(name = "SENHA", nullable = false, length = 128)
    private String senha;

    // @Column(name = "DATA_NASCIMENTO", nullable = false, length = 256)
    // private LocalDate dataNascimento;

    @Column(name = "IMAGEM", length = 512)
    private String imagem;

    @Column(name = "TELEFONE", length = 12, nullable = false)
    private String telefone;

    // @ManyToOne(name = "ID_")
    // @JoinColumn(name = "", nullable = false)
    // @JsonIgnore
    // private  ;

    public Usuario() {
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    // public  get() {
    //     return this.;
    // }

    // public void set( ) {
    //     this. = ;
    // }

    public Optional<String> getRole() {
        return Optional.of("Usuario normal");
    }

    public Usuario(Long id, String nomeCompleto, String email, String senha, String imagem, String telefone){ // ) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.imagem = imagem;
        this.telefone = telefone;
        // this. = ;
    }
}
