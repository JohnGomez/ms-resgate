package br.com.msresgate.domain.entities;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "contatos")
public class Contato extends BaseEntity {

    private String email;
    private String telefone;
    private String celular;

    @OneToOne(mappedBy = "contatos")
    private Pessoa pessoa;

}
