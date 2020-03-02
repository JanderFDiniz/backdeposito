package com.deposito.diniz.fechamento;

import lombok.Data;
import org.hibernate.mapping.Any;

import java.time.LocalDate;

@Data
public class FechamentoDto {

    private  Integer Id;

    private Integer valorInicial;

    private Integer valorTotal;

    private Any quantidadeInicialProduto;

    private Any quantidadeFinalProduto;

    private Any gastosDia;

    private Any comprasDia;

    private LocalDate dataFechamento;

}
