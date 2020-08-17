package br.com.msresgate.domain.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "permissoes")
public class Permissao extends BaseEntity {
    private String nome;

}
