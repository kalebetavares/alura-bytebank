package br.com.bytebank.bank.model;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Kalebe Tavares
 * @version 0.1
 *
 */

public class Cliente  implements java.io.Serializable{
    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", cpf='" + this.cpf + '\'' +
                ", profissao='" + this.profissao + '\'' +
                '}';
    }
}
