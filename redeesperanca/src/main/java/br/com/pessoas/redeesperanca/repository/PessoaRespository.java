package br.com.pessoas.redeesperanca.repository;

import br.com.pessoas.redeesperanca.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRespository extends JpaRepository<Pessoa, Long> {


}
