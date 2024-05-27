package com.Castoresinterview.Castoresinterview.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Permisos")
public class Permiso {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_Permiso")
  private int id;
  @Column(name ="Nombre_Permiso")
  private String nombrePermiso;

  public Permiso(){

  }

  public Permiso(int id, String nombrePermiso) {
    this.id = id;
    this.nombrePermiso = nombrePermiso;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombrePermiso() {
    return nombrePermiso;
  }

  public void setNombrePermiso(String nombrePermiso) {
    this.nombrePermiso = nombrePermiso;
  }
}
