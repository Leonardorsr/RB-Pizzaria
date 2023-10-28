package com.unip.pizzaria.model.db;

import org.springframework.data.repository.CrudRepository;

import com.unip.pizzaria.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
