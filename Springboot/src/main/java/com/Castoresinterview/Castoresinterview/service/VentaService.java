package com.Castoresinterview.Castoresinterview.service;

import com.Castoresinterview.Castoresinterview.model.Venta;
import com.Castoresinterview.Castoresinterview.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {
  @Autowired
  private VentaRepository ventaRepository;

  //SAVE DATA ALL
  public List<Venta> listaVentas(){
    return ventaRepository.findAll();
  }
  //QUERY DATA 1
  public Venta guardarVenta(Venta venta){
    return ventaRepository.save(venta);
  }
}
