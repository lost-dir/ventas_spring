package com.example.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ventas.model.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {

}
