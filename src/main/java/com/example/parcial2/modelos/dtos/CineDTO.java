package com.example.parcial2.modelos.dtos;



public class CineDTO {

    private Integer id;
    private String nombre;
    private String nit;
    private String ciudad;

    public CineDTO() {
    }

    public CineDTO(Integer id, String nombre, String nit, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.ciudad = ciudad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
