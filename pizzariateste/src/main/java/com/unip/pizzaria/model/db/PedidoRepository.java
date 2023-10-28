package com.unip.pizzaria.model.db;

import org.springframework.data.repository.CrudRepository;

import com.unip.pizzaria.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

}
