package br.com.cwi.crescer.tcc.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contato {
     // public static String getSEQUENCE() {
    //     return SEQUENCE;
    // }

    // private static final String SEQUENCE = "USUARIO_SEQ";

    @Id
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
    // @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTATO", nullable = false, precision = 10, unique = true)
    private Long id;

    @Column(name = "NOME_COMPLETO", nullable = false, length = 50)
    private String nomeCompleto;

    @Column(name = "TELEFONE", nullable = false, length = 12)
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Contato(Long id, String nomeCompleto, String telefone, Usuario usuario) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.usuario = usuario;
    }

    public Contato() {
    }
}