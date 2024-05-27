package com.Castoresinterview.Castoresinterview.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Ventas")
public class Venta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idVenta;
  @Column(name = "id_Producto")
  private int idProducto;
  @Column(name = "Cantidad")
  private int cantidad;
  public Venta(){

  }

  public Venta(int idVenta, int idProducto, int cantidad) {
    this.idVenta = idVenta;
    this.idProducto = idProducto;
    this.cantidad = cantidad;
  }

  public int getIdVenta() {
    return idVenta;
  }

  public void setIdVenta(int idVenta) {
    this.idVenta = idVenta;
  }

  public int getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(int idProducto) {
    this.idProducto = idProducto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
}
