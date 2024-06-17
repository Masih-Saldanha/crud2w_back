package com.crud2wback.api.model;

import java.util.Date;

import com.crud2wback.api.dto.ProdutoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Produto {
  public Produto(ProdutoDTO data) {
    this.nome = data.nome();
    this.tipo = data.tipo();
    this.descricao = data.descricao();
    this.dataInclusao = new Date();
  }
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 50, nullable = false)
  private String nome;

  @Column(nullable = false)
  private TipoProduto tipo;

  @Column(length = 140, nullable = false)
  private String descricao;

  @Column(nullable = false)
  private Date dataInclusao;
}
