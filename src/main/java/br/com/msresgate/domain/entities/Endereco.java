package br.com.msresgate.domain.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "enderecos")
public class Endereco extends BaseEntity{

    private String logradouro;
    private String cep;
    private String numero;
    private String bairro;
    private String cidade;

    @OneToOne(mappedBy = "endereco")
    private Pessoa pessoa;

}
