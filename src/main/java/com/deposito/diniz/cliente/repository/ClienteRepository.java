package com.deposito.diniz.cliente.repository;

import com.deposito.diniz.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
