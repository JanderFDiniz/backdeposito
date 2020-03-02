package com.deposito.diniz.venda.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "cliente")
    private String cliente;

    @Column(name = "telefone")
    private Integer telefone;

    @Column(name = "produto")
    private String produto;

    @Column(name = "preco")
    private Integer preco;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "dataVenda")
    private LocalDate dataVenda;

    @Column(name = "horaVenda")
    private LocalDate horaVenda;

    @Column(name = "horaEntrega")
    private LocalDate horaEntrega ;

    @Column(name = "status")
    private String status;

    @Column(name = "formaPagamento")
    private String formaPagamento;

    @Column(name = "troco")
    private Integer troco;
}
