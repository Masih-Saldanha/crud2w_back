package com.crud2wback.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.crud2wback.api.dto.ProdutoDTO;
import com.crud2wback.api.exception.ProdutoNotFoundException;
import com.crud2wback.api.model.Produto;
import com.crud2wback.api.model.TipoProduto;
import com.crud2wback.api.repository.ProdutoRepository;

@Service
public class ProdutoService {
  @Autowired
  private ProdutoRepository produtoRepository;
  
  public ResponseEntity<Produto> create(ProdutoDTO dto) {
    if (dto.tipo() != TipoProduto.MOVEL && dto.tipo() != TipoProduto.ELETRONICO) {
      throw new ProdutoNotFoundException("Tipo de produto não encontrado/válido");
    } else {
      Produto produtoSalvo = produtoRepository.save(new Produto(dto));
      return new ResponseEntity<>(produtoSalvo, HttpStatus.CREATED);
    }
  }

  public ResponseEntity<List<Produto>> readAll() {
    List<Produto> produtos = produtoRepository.findAll();
    return new ResponseEntity<>(produtos, HttpStatus.OK);
  }

  public void update(Long id, ProdutoDTO dto) {
    Optional<Produto> produtoExiste = produtoRepository.findById(id);
    if (!produtoExiste.isPresent()) {
      throw new ProdutoNotFoundException("Id de produto não encontrada");
    } else if (dto.tipo() != TipoProduto.MOVEL && dto.tipo() != TipoProduto.ELETRONICO) {
      throw new ProdutoNotFoundException("Tipo de produto não encontrado/válido");
    } else {
      produtoExiste.map(produto -> {
        produto.setNome(dto.nome());
        produto.setTipo(dto.tipo());
        produto.setDescricao(dto.descricao());
        return produtoRepository.save(produto);
      });
    }
  }

  public void delete(Long id) {
    Optional<Produto> produtoExiste = produtoRepository.findById(id);
    if (!produtoExiste.isPresent()) {
      throw new ProdutoNotFoundException("Id de produto não encontrada");
    } else {
      produtoRepository.deleteById(id);
    }
    produtoRepository.deleteById(id);
  }
}
