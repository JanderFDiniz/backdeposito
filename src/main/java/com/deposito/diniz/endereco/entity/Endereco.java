package com.deposito.diniz.endereco.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="")
public class Endereco {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer Id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "cep")
    private Integer cep;
}
