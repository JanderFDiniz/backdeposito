package com.deposito.diniz.venda.repository;

import com.deposito.diniz.venda.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Integer> {
}
