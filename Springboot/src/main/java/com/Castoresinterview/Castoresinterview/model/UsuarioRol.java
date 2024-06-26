package com.Castoresinterview.Castoresinterview.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios_Roles")
public class UsuarioRol {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_Usuarios_Roles")
  private int id;
  @ManyToOne
  @JoinColumn(name="id_Usuario", referencedColumnName = "id_Usuario")
  private Usuario usuario;
  @ManyToOne
  @JoinColumn(name = "id_Rol", referencedColumnName = "id_Rol")
  private Rol rol;
  public UsuarioRol(){}
  public UsuarioRol(int id, Usuario usuario, Rol rol) {
    this.id = id;
    this.usuario = usuario;
    this.rol = rol;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Rol getRol() {
    return rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }
}
