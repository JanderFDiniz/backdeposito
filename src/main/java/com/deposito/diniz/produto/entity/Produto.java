package com.deposito.diniz.produto.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer Id;

    @Column(name = "produto")
    private  String produto;
}
