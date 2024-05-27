package com.Castoresinterview.Castoresinterview.controller;

import com.Castoresinterview.Castoresinterview.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class UsuarioController {
  @Autowired
  private UsuarioService usuarioService;
  @PostMapping("/login")
  public ResponseEntity<Set<String>> login(@RequestParam String correo, @RequestParam String password){
    Set<String> permisos = usuarioService.obtenerPermisosPorCredencial(correo, password);
    return ResponseEntity.status(200).body(permisos);
  }
}
