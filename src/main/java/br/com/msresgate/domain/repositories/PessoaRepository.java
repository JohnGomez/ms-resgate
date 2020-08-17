package br.com.msresgate.domain.repositories;

import br.com.msresgate.domain.entities.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{
}
