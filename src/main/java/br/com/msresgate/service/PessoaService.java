package br.com.msresgate.service;

import br.com.msresgate.domain.entities.Pessoa;
import br.com.msresgate.domain.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public void save(Pessoa pessoa) {
        repository.save(pessoa);
    }

    public List<Pessoa> findAll() {
        return (List<Pessoa>) repository.findAll();
    }
}
