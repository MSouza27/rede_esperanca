package br.com.pessoas.redeesperanca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


@Table(name = "Tabela Cadastro")
public class Cadastro {

    @Id
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    @Column(name = "CPF")
    private String cpf;

    @NotBlank
    @Column(name = "Nome Completo")
    private String nomeCompleto;

    @NotBlank
    @Column(name = "E-mail")
    private String email;

    @NotNull
    private Endereco endereco;

    public Cadastro() {
    }

    public Cadastro(String cpf, String nomeCompleto, String email, Endereco endereco) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }


}
