package com.deposito.diniz.venda;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;


@Data
public class VendaDto {

    private Integer id;

    private String endereco;

    private Integer numero;

    private String cliente;

    private Integer telefone;

    private String produto;

    private Integer preco;

    private Integer quantidade;

    private LocalDate dataVenda;

    private LocalDate horaVenda;

    private LocalDate horaEntrega ;

    private String status;


    private String formaPagamento;

    private Integer troco;

}
