package com.crud2wback.api.dto;

import com.crud2wback.api.model.TipoProduto;

import jakarta.validation.constraints.NotBlank;

public record ProdutoDTO(
  @NotBlank String nome,
  TipoProduto tipo,
  @NotBlank String descricao
) {
  
}
