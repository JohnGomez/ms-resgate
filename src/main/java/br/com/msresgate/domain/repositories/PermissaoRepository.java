package br.com.msresgate.domain.repositories;

import br.com.msresgate.domain.entities.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Integer> {
}
