package com.deposito.diniz.venda.mapper.Impl;

import com.deposito.diniz.venda.VendaDto;
import com.deposito.diniz.venda.entity.Venda;
import com.deposito.diniz.venda.mapper.VendaMapper;
import org.springframework.stereotype.Component;

@Component
public class VendaMapperImpl implements VendaMapper {

    @Override
    public Venda map(VendaDto vendaDto){
      Venda  venda = new Venda();
        venda.setId(vendaDto.getId());
        venda.setEndereco(vendaDto.getEndereco());
        venda.setNumero(vendaDto.getNumero());
        venda.setCliente(vendaDto.getCliente());
        venda.setTelefone(vendaDto.getTelefone());
        venda.setProduto(vendaDto.getProduto());
        venda.setPreco(vendaDto.getPreco());
        venda.setQuantidade(vendaDto.getQuantidade());
        venda.setDataVenda(vendaDto.getDataVenda());
        venda.setHoraVenda(vendaDto.getHoraVenda());
        venda.setStatus(vendaDto.getStatus());
        venda.setHoraEntrega (vendaDto.getHoraEntrega ());
        venda.setFormaPagamento(vendaDto.getFormaPagamento());
        venda.setTroco(vendaDto.getTroco());

        return venda;

    }




}
