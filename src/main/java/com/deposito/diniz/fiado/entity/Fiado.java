package com.deposito.diniz.fiado.entity;

import com.deposito.diniz.produto.entity.Produto;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name="")
public class Fiado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column
    private Integer clienteId;

    @Column
    private Integer telefone;

    @Column
    private Integer produto;

    @Column
    private Integer quantidade;

    @Column
    private LocalDate dataVenda;

    @Column
    private LocalDate dataVaiPaga;

    @Column
    private Integer preco;

}
