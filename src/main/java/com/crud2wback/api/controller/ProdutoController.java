package com.crud2wback.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud2wback.api.dto.ProdutoDTO;
import com.crud2wback.api.model.Produto;
import com.crud2wback.api.service.ProdutoService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
  @Autowired
  private ProdutoService produtoService;

  @PostMapping
  public ResponseEntity<Produto> create(@RequestBody @Valid ProdutoDTO req) {
    return produtoService.create(req);
  }
  
  @GetMapping
  public ResponseEntity<List<Produto>> readAll() {
    return produtoService.readAll();
  }
  
  @PutMapping("/{id}")
  public void update(@PathVariable Long id, @RequestBody @Valid ProdutoDTO req) {
    produtoService.update(id, req);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    produtoService.delete(id);
  }
}
