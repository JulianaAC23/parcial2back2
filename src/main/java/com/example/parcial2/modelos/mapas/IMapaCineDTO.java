package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaCineDTO {

    IMapaCineDTO INSTANCE= Mappers.getMapper(IMapaCineDTO.class);

    //Convirtiendo un modelo en DTO
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "nit", target = "nit")
    @Mapping(source = "detalle.ciudad", target = "ciudad")
    CineDTO convertirADTO(Cine cine);

    //Convierto lista en DTO
    List<CineDTO> convertirListaDTO(List<Cine> lista);
}
