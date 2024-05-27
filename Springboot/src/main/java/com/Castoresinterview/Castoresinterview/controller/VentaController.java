package com.Castoresinterview.Castoresinterview.controller;

import com.Castoresinterview.Castoresinterview.model.Venta;
import com.Castoresinterview.Castoresinterview.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
@CrossOrigin(origins = "*")
public class VentaController {
  @Autowired
  private VentaService ventaService;

  @GetMapping
  public List<Venta> obtenerVentas(){
    return ventaService.listaVentas();
  }
  @PostMapping
  public Venta crearVenta(@RequestBody Venta venta){
    return ventaService.guardarVenta(venta);
  }
}
