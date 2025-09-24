package com.example.parcial2.servicios;


import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDTO;
import com.example.parcial2.modelos.mapas.IMapaCineDTO;
import com.example.parcial2.repositorios.ICineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServicio {

    @Autowired
    private ICineRepositorio repositorio;

    @Autowired
    private IMapaCineDTO mapa;

    //Servicio para guardar un cine
    public CineDTO guardarCine(Cine datosCine) throws Exception {
        try{
            return this.mapa.convertirADTO(this.repositorio.save(datosCine));
        } catch (Exception error){
            throw new Exception("Ups, fallamos al guardar cine:" + error.getMessage());
        }
    }
}
