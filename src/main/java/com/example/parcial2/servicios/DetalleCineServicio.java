package com.example.parcial2.servicios;


import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.repositorios.IDetalleCineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineServicio {

    @Autowired
    private IDetalleCineRepositorio repositorio;

    //Servicio para guardar un detalle cine
    public DetalleCine guardarDetalleCine(DetalleCine datosDetalleCine) throws Exception{
        try{
            return this.repositorio.save(datosDetalleCine);
        } catch (Exception error) {
            throw new Exception("Ups, fallamos al guardar detalle del cine:" + error.getMessage());
        }
    }
}
