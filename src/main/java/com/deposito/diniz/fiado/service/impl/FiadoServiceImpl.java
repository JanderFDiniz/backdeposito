package com.deposito.diniz.fiado.service.impl;

import com.deposito.diniz.fiado.FiadoDto;
import com.deposito.diniz.fiado.entity.Fiado;
import com.deposito.diniz.fiado.mapper.FiadoMapper;
import com.deposito.diniz.fiado.repository.FiadoRepository;
import com.deposito.diniz.fiado.service.FiadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiadoServiceImpl implements FiadoService {

    @Autowired
    private FiadoRepository fiadoRepository;

    @Autowired
    private FiadoService fiadoService;

    @Autowired
    private FiadoMapper fiadoMapper;

    public List<Fiado> getFiados()
    {return  fiadoRepository.findAll();}

    public void insertFiado(FiadoDto fiadoDto){
        Fiado fiado = fiadoMapper.map(fiadoDto);
        fiadoRepository.save(fiado);
    }

}
