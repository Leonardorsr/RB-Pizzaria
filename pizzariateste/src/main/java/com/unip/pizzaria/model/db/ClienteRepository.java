package com.unip.pizzaria.model.db;

import org.springframework.data.repository.CrudRepository;

import com.unip.pizzaria.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
