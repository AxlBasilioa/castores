package com.Castoresinterview.Castoresinterview.service;

import com.Castoresinterview.Castoresinterview.model.Producto;
import com.Castoresinterview.Castoresinterview.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
  @Autowired
  private ProductoRepository productoRepository;
  public List<Producto> listaProductos(){
    return productoRepository.findAll();
  }
  public Producto guardarProducto(Producto producto) {
    return productoRepository.save(producto);
  }
  public Producto guardarProducto(){
    Producto producto = new Producto();
    producto.setNombre("nuevo producto");
    producto.setPrecio("0");
    producto.setCantidadInventario(0);
    producto.setEstado(true); // Activo
    return guardarProducto(producto);
  }
  public Producto actualizarEstado(int id, boolean estado) {
    Producto producto = productoRepository.findById((long) id)
      .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    producto.setEstado(estado);
    return productoRepository.save(producto);
  }

  public Producto actualizarProducto(int id, Producto productoActualizado) {
    Producto producto = productoRepository.findById((long) id)
      .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    producto.setNombre(productoActualizado.getNombre());
    producto.setPrecio(productoActualizado.getPrecio());
    producto.setCantidadInventario(productoActualizado.getCantidadInventario());
    producto.setEstado(productoActualizado.getEstado());
    return productoRepository.save(producto);
  }
}
