package com.Castoresinterview.Castoresinterview.service;

import com.Castoresinterview.Castoresinterview.model.Log;
import com.Castoresinterview.Castoresinterview.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
  @Autowired
  private LogRepository logRepository;

  public List<Log> listaLogs() {
    return logRepository.findAll();
  }
}
