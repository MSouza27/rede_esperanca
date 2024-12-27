package br.com.pessoas.redeesperanca.service;

import br.com.pessoas.redeesperanca.model.Pessoa;
import br.com.pessoas.redeesperanca.repository.PessoaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRespository pessoaRespository;

    public Pessoa cadastrarPessoa(Pessoa pessoa){
        return pessoaRespository.save(pessoa);
    }

    public List<Pessoa> listarPessoa(){
        return pessoaRespository.findAll();
    }
}
