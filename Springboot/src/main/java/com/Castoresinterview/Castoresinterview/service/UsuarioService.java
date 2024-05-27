package com.Castoresinterview.Castoresinterview.service;

import com.Castoresinterview.Castoresinterview.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
  @Autowired
  private UsuarioRepository usuarioRepository;
  public Set<String> obtenerPermisosPorCredencial(String correo, String password){
    try{
      return usuarioRepository.findByCorreoAndPassword(correo,password)
              .map(usuario -> usuario.getRoles().stream()
                .flatMap(ur->ur.getRol().getPermisos().stream())
                .map(rp->rp.getPermiso().getNombrePermiso())
                .collect(Collectors.toSet())).orElseThrow(()-> new IllegalArgumentException("Credenciales invalidas"));
    }catch(Exception e) {
      return new HashSet<>(Collections.singletonList("Credenciales invalidas"));
    }
  }
}
