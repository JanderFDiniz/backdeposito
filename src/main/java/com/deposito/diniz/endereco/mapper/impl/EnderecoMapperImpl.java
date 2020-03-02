package com.deposito.diniz.endereco.mapper.impl;


import com.deposito.diniz.endereco.EnderecoDto;
import com.deposito.diniz.endereco.entity.Endereco;
import com.deposito.diniz.endereco.mapper.EnderecoMapper;
import org.springframework.stereotype.Component;

@Component
public class EnderecoMapperImpl implements EnderecoMapper {

    @Override
    public Endereco map(EnderecoDto enderecoDto){
        Endereco endereco = new Endereco();
        endereco.setNome(enderecoDto.getNome());
        endereco.setNumero(enderecoDto.getNumero());
        return  endereco;
    }
}
