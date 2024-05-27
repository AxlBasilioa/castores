package com.Castoresinterview.Castoresinterview.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Usuarios")
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_Usuario")
  private int id;
  @Column(name = "Correo")
  private String correo;
  @Column(name = "Password")
  private String password;
  @Column(name = "Nombre")
  private String nombre;
  @OneToMany(mappedBy = "usuario")
  private Set<UsuarioRol> roles;
  public Usuario(){

  }
  public Usuario(int id, String correo, String password, String nombre){
    this.id = id;
    this.correo = correo;
    this.password = password;
    this.nombre = nombre;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Set<UsuarioRol> getRoles() {
    return roles;
  }

  public void setRoles(Set<UsuarioRol> roles) {
    this.roles = roles;
  }
}
