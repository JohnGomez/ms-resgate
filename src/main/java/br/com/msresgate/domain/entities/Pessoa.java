package br.com.msresgate.domain.entities;

import javax.persistence.*;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Entity
@Table(name = "pessoas")
public class Pessoa extends BaseEntity {

    private String nome;

    @Column(name = "nome_pai")
    private String nomeDoPai;

    @Column(name = "nome_mae")
    private String nomeMae;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "rg")
    private String rg;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data_nascimento", columnDefinition = "DATE")
    private LocalDate nascimento;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "estatp_civil")
    private String estadoCivil;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "contato_id")
    private Contato contatos;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

}
