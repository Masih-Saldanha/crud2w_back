package com.crud2wback.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud2wback.api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
  
}
