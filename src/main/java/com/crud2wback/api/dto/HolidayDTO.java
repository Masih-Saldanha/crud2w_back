package com.crud2wback.api.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;

public record HolidayDTO(
  @NotBlank String name,
  Date date
) {
  
}
