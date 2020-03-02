package com.deposito.diniz.cliente.service.impl;

import com.deposito.diniz.cliente.ClienteDto;
import com.deposito.diniz.cliente.entity.Cliente;
import com.deposito.diniz.cliente.mapper.ClienteMapper;
import com.deposito.diniz.cliente.repository.ClienteRepository;
import com.deposito.diniz.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteMapper clienteMapper;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    public void  insertTest(ClienteDto clienteDto) {
        Cliente cliente = clienteMapper.map(clienteDto);
        clienteRepository.save(cliente);
    }
}
