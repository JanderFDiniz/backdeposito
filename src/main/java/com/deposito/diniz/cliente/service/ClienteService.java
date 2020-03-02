package com.deposito.diniz.cliente.service;

import com.deposito.diniz.cliente.ClienteDto;
import com.deposito.diniz.cliente.entity.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> getClientes();

    void  insertTest(ClienteDto clienteDto);
}
