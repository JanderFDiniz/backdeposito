package com.deposito.diniz.fechamento.entity;

import lombok.Data;
import org.hibernate.mapping.Any;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Fechamento {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer Id;

    @Column(name = "valorInicial")
    private Integer valorInicial;


    @Column(name = "valorTotal")
    private Integer valorTotal;

    @Column(name = "quantidadeInicialProduto")
    private Any quantidadeInicialProduto;

    @Column(name = "quantidadeFinalProduto")
    private Any quantidadeFinalProduto;


    @Column(name = "gastosDia")
    private Any gastosDia;

    @Column(name = "comprasDia")
    private Any comprasDia;

    @Column(name = "dataFechamento")
    private LocalDate dataFechamento;



}
