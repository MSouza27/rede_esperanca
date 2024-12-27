package br.com.pessoas.redeesperanca.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record Endereco(
        @NotBlank String rua,

        @NotBlank String numero,

        @NotBlank String bairro,

        @NotBlank String cidade,

        @NotBlank String estado,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,

        String complemento
) {

}
