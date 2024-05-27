package com.Castoresinterview.Castoresinterview.controller;

import com.Castoresinterview.Castoresinterview.model.Producto;
import com.Castoresinterview.Castoresinterview.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoController {
  @Autowired
  private ProductoService productoService;
  @GetMapping
  public List<Producto> obtenerProductos(){
    return productoService.listaProductos();
  }
  @PostMapping
  public Producto crearProducto(){
    return productoService.guardarProducto();
  }
  @PutMapping("/{id}/estado")
  public Producto actualizarEstado(@PathVariable int id, @RequestParam boolean estado) {
    return productoService.actualizarEstado(id, estado);
  }

  @PutMapping("/{id}")
  public Producto actualizarProducto(@PathVariable int id, @RequestBody Producto producto) {
    return productoService.actualizarProducto(id, producto);
  }
}
