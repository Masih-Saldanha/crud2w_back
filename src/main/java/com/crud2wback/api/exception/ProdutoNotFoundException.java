package com.crud2wback.api.exception;

public class ProdutoNotFoundException extends RuntimeException {
  public ProdutoNotFoundException(String message) {
    super(message);
  }
}
