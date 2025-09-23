package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDetalleCineRepositorio extends JpaRepository<DetalleCine, Integer> {

    //Buscar por ciudad
    List<DetalleCine> findByCiudad(String ciudad);
}
