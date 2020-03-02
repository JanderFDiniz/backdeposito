package com.deposito.diniz.fiado.mapper.impl;

import com.deposito.diniz.fiado.FiadoDto;
import com.deposito.diniz.fiado.entity.Fiado;
import com.deposito.diniz.fiado.mapper.FiadoMapper;
import org.springframework.stereotype.Component;

@Component
public class FiadoMapperImpl implements FiadoMapper {

    @Override
    public Fiado map(FiadoDto fiadoDto)
    {
        Fiado fiado = new Fiado();
        fiado.setId(fiadoDto.getId());
        fiado.setClienteId(fiadoDto.getClienteId());
        fiado.setProduto(fiadoDto.getProduto());
        fiado.setTelefone(fiadoDto.getTelefone());
        fiado.setQuantidade(fiadoDto.getQuantidade());
        fiado.setDataVenda(fiadoDto.getDataVenda());
        fiado.setDataVaiPaga(fiadoDto.getDataVaipaga());
        fiado.setPreco(fiadoDto.getPreco());

        return  fiado;
    }
}
