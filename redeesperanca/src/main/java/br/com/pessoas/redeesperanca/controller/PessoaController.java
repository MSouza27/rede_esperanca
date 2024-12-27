package br.com.pessoas.redeesperanca.controller;

import br.com.pessoas.redeesperanca.model.Pessoa;
import br.com.pessoas.redeesperanca.service.PessoaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody @Valid Pessoa pessoa){
        Pessoa pessoaCadastrada = pessoaService.cadastrarPessoa(pessoa);
        return ResponseEntity.status(201).body(pessoaCadastrada);
    }
    @GetMapping
    public List<Pessoa> listarPessoa(){
        return pessoaService.listarPessoa();
    }


}
