package com.Castoresinterview.Castoresinterview.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Productos")
public class Producto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_Producto")
  private int id;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "precio")
  private String precio;

  @Column(name = "cantidadInventario")
  private Integer cantidadInventario;

  @Column(name = "estado", nullable = false)
  private Boolean estado;

  public Producto() {
  }

  public Producto(int id, String nombre, String precio, int cantidadInventario, Boolean estado) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.cantidadInventario = cantidadInventario;
    this.estado = estado;
  }

  // Getters y Setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPrecio() {
    return precio;
  }

  public void setPrecio(String precio) {
    this.precio = precio;
  }

  public int getCantidadInventario() {
    return cantidadInventario;
  }

  public void setCantidadInventario(int cantidadInventario) {
    this.cantidadInventario = cantidadInventario;
  }

  public Boolean getEstado() {
    return estado;
  }

  public void setEstado(Boolean estado) {
    this.estado = estado;
  }
}
