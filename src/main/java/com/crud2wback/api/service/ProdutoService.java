package com.crud2wback.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud2wback.api.dto.ProdutoDTO;
import com.crud2wback.api.model.Produto;
import com.crud2wback.api.repository.ProdutoRepository;

@Service
public class ProdutoService {
  @Autowired
  private ProdutoRepository holidayRepository;
  
  public Produto create(ProdutoDTO dto) {
    return holidayRepository.save(new Produto(dto));
  }

  public List<Produto> readAll() {
    return holidayRepository.findAll();
  }

  public void update(Long id, ProdutoDTO dto) {
    holidayRepository.findById(id).map(holiday -> {
      holiday.setNome(dto.nome());
      holiday.setTipo(dto.tipo());
      holiday.setDescricao(dto.descricao());
      return holidayRepository.save(holiday);
    });
  }

  public void delete(Long id) {
    holidayRepository.deleteById(id);
  }
}
