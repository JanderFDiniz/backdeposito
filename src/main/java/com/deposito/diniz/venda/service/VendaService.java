package com.deposito.diniz.venda.service;

import com.deposito.diniz.venda.VendaDto;
import com.deposito.diniz.venda.entity.Venda;

import java.util.List;

public interface VendaService {
    void saveVenda(VendaDto vendaDto);

    List<Venda> getVendas();

    Venda getVendaById(Integer id);
}
