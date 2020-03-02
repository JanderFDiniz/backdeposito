package com.deposito.diniz.fiado.service;

import com.deposito.diniz.fiado.FiadoDto;
import com.deposito.diniz.fiado.entity.Fiado;

import java.util.List;

public interface FiadoService {

    List<Fiado> getFiados();

    void insertFiado(FiadoDto fiadoDto);
}
