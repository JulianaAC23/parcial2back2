package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICineRepositorio extends JpaRepository<Cine, Integer>{

    //Buscar por nombre y cantidad de salas
    List<Cine> findByNombreAndCantidad(@Param("nombre") String nombre, @Param("cantidad") int cantidad);
}
