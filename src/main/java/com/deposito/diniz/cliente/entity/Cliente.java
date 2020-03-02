package com.deposito.diniz.cliente.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer Id;

    @Column(name = "nome")
    private  String nome;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "enderecoId")
    private Integer enderecoId;

    @Column(name = "precoDifer")
    private Integer precoDifer;

    @Column(name = "dataCad")
    private LocalDate dataCad;

    @Column(name = "doc")
    private Integer doc;

    @Column(name = "segundoTelefone")
    private  Integer segundoTelefone;
}
