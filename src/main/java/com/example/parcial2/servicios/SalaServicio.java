package com.example.parcial2.servicios;


import com.example.parcial2.modelos.Sala;
import com.example.parcial2.repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServicio {

    @Autowired
    private ISalaRepositorio repositorio;

    //Servicio para guardar una Sala
    public Sala guardarSala(Sala datosSala) throws Exception {
        try {
            return this.repositorio.save(datosSala);
        } catch (Exception error) {
            throw new Exception("Ups, fallamos al guardar sala:" + error.getMessage());
        }
    }
}
