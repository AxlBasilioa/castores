package com.Castoresinterview.Castoresinterview.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Roles")
public class Rol {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_Rol")
  private int id;
  @Column(name = "Nombre_Rol")
  private String nombreRol;
  @OneToMany(mappedBy = "rol", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<UsuarioRol> usuarios;
  @OneToMany(mappedBy = "rol", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<RolPermisos> permisos;

  public Rol() {
  }

  public Rol(int id, String nombreRol, Set<UsuarioRol> usuarios, Set<RolPermisos> permisos) {
    this.id = id;
    this.nombreRol = nombreRol;
    this.usuarios = usuarios;
    this.permisos = permisos;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombreRol() {
    return nombreRol;
  }

  public void setNombreRol(String nombreRol) {
    this.nombreRol = nombreRol;
  }

  public Set<UsuarioRol> getUsuarios() {
    return usuarios;
  }

  public void setUsuarios(Set<UsuarioRol> usuarios) {
    this.usuarios = usuarios;
  }

  public Set<RolPermisos> getPermisos() {
    return permisos;
  }

  public void setPermisos(Set<RolPermisos> permisos) {
    this.permisos = permisos;
  }
}


///////////// ?mail=a@a.com&pass=123 -> response ['permiso1','permiso2', 'permiso3']
