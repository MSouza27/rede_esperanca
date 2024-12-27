package br.com.pessoas.redeesperanca.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.awt.image.BufferedImage;
import java.util.Objects;

@Entity
@Table(name = "Cadastro_pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "Nome")
    private String nome;

    @NotNull
    @Column(name = "Idade")
    private int idade;

    @NotNull
    @Column(name = "Altura")
    private double altura;

    @NotBlank
    @Column(name = "Cor_Cabelo")
    private String corCabelo;

    @NotBlank
    @Column(name = "Tipo_Cabelo")
    private String tipoCabelo;

    @NotBlank
    @Column(name = "Tamanho_Cabelo")
    private String tamanhoCabelo;

    @NotBlank
    @Column(name = "Cor_Olhos")
    private String corOlhos;

    @NotBlank
    @Column(name = "Tipo_Corpo")
    private String tipoCorpo;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, int idade, double altura, String corCabelo, String tipoCabelo,
                  String tamanhoCabelo, String corOlhos, String tipoCorpo, BufferedImage imagem) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.corCabelo = corCabelo;
        this.tipoCabelo = tipoCabelo;
        this.tamanhoCabelo = tamanhoCabelo;
        this.corOlhos = corOlhos;
        this.tipoCorpo = tipoCorpo;

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public String getTipoCabelo() {
        return tipoCabelo;
    }

    public String getTamanhoCabelo() {
        return tamanhoCabelo;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public String getTipoCorpo() {
        return tipoCorpo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}