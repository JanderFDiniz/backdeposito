package com.deposito.diniz.endereco.service.impl;


import com.deposito.diniz.endereco.entity.Endereco;
import com.deposito.diniz.endereco.mapper.EnderecoMapper;
import com.deposito.diniz.endereco.repository.EnderecoRepository;
import com.deposito.diniz.endereco.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private EnderecoMapper enderecoMapper;

    @Override
    public List<Endereco> getEndereco()
    {
        return  enderecoRepository.findAll();
    }
}
