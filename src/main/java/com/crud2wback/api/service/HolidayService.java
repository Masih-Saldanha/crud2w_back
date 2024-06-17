package com.crud2wback.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud2wback.api.dto.HolidayDTO;
import com.crud2wback.api.model.Holiday;
import com.crud2wback.api.repository.HolidayRepository;

public class HolidayService {
  @Autowired
  private HolidayRepository holidayRepository;
  
  public Holiday create(HolidayDTO dto) {
    return holidayRepository.save(new Holiday(dto));
  }

  public List<Holiday> readAll() {
    return holidayRepository.findAll();
  }

  public void update(Long id, HolidayDTO dto) {
    holidayRepository.findById(id).map(holiday -> {
      holiday.setName(dto.name());
      holiday.setDate(dto.date());
      return holidayRepository.save(holiday);
    });
  }

  public void delete(Long id) {
    holidayRepository.deleteById(id);
  }
}
