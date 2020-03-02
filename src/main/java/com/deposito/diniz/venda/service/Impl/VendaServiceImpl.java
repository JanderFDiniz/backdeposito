package com.deposito.diniz.venda.service.Impl;

import com.deposito.diniz.venda.VendaDto;
import com.deposito.diniz.venda.entity.Venda;
import com.deposito.diniz.venda.mapper.VendaMapper;
import com.deposito.diniz.venda.repository.VendaRepository;
import com.deposito.diniz.venda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private VendaMapper vendaMapper;

    @Autowired
    private  VendaService vendaService;

    @Override
    public void saveVenda(VendaDto vendaDto){
        Venda venda = vendaMapper.map(vendaDto);
        venda.setDataVenda(LocalDate.now());

        vendaRepository.save(venda);
    }


    @Override
    public List<Venda> getVendas() {
        return vendaRepository.findAll();
    }

    @Override
    public Venda getVendaById(Integer id){
        Optional venda = vendaRepository.findById(id);
        if(venda.isPresent()){

        }
        return new Venda();

    }

}
