package com.Castoresinterview.Castoresinterview.controller;

import com.Castoresinterview.Castoresinterview.model.Log;
import com.Castoresinterview.Castoresinterview.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/logs")
@CrossOrigin(origins = "*")
public class LogController {
  @Autowired
  private LogService logService;

  @GetMapping
  public List<Log> obtenerLogs() {
    return logService.listaLogs();
  }
}
