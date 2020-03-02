package com.deposito.diniz.cliente.mapper.impl;

import com.deposito.diniz.cliente.ClienteDto;
import com.deposito.diniz.cliente.entity.Cliente;
import com.deposito.diniz.cliente.mapper.ClienteMapper;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public Cliente map(ClienteDto clienteDto)
    {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDto.getId());
        cliente.setNome(clienteDto.getNome());
        cliente.setTelefone(clienteDto.getTelefone());
        cliente.setDataCad(clienteDto.getDataCad());
        cliente.setDoc(clienteDto.getDoc());
        cliente.setPrecoDifer(clienteDto.getPrecoDifer());
        cliente.setEnderecoId(clienteDto.getEnderecoId());
        cliente.setSegundoTelefone(clienteDto.getSegundoTelefone());

        return  cliente;
    }

}
