package com.deposito.diniz.fiado;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FiadoDto {

    private Integer id;

    private  Integer clienteId;

    private  Integer telefone;

    private Integer produto;

    private Integer quantidade;

    private LocalDate dataVenda;

    private LocalDate dataVaipaga;

    private  Integer preco;
}
