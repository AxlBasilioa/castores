package com.Castoresinterview.Castoresinterview.repository;

import com.Castoresinterview.Castoresinterview.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
