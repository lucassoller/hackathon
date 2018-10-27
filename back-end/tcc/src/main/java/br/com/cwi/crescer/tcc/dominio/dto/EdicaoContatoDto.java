package br.com.cwi.crescer.tcc.dominio.dto;

public class EdicaoContatoDto {
    private String nomeCompleto;
    private String telefone;

    public EdicaoContatoDto(String nomeCompleto, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

}
