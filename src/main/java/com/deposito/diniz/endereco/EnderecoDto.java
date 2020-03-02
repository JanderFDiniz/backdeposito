package com.deposito.diniz.endereco;

import lombok.Data;

@Data
public class EnderecoDto {

    private  Integer Id;

    private String nome;

    private Integer numero;

    private String complemento;

    private Integer cep;

}
