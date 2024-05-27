package com.Castoresinterview.Castoresinterview.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles_Permisos")
public class RolPermisos {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_Rol_Permiso")
  private int id;
  @ManyToOne
  @JoinColumn(name="id_Rol", referencedColumnName = "id_Rol")
  private Rol rol;
  @ManyToOne
  @JoinColumn(name="id_Permiso", referencedColumnName = "id_Permiso")
  private Permiso permiso;
  public RolPermisos(){

  }

  public RolPermisos(int id, Rol rol, Permiso permiso) {
    this.id = id;
    this.rol = rol;
    this.permiso = permiso;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Rol getRol() {
    return rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public Permiso getPermiso() {
    return permiso;
  }

  public void setPermiso(Permiso permiso) {
    this.permiso = permiso;
  }
}
