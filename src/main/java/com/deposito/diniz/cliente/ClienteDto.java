package com.deposito.diniz.cliente;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class ClienteDto {

    private Integer id;

    private String nome;

    private String telefone;

    private Integer enderecoId;

    private Integer precoDifer;

    private LocalDate dataCad;

    private Integer doc;

    private Integer segundoTelefone;

}
