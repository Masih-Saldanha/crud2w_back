package com.crud2wback.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud2wback.api.model.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {
  
}
