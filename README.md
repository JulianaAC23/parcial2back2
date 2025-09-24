Hecho con ayuda de Inteligencia Artificial

# 🎬 Cinema Nova - Backend con Spring Boot

Este proyecto es un backend básico para el **Cinema Nova**, encargado de registrar la información base: cines, sus detalles y sus salas.  
Se construyó utilizando **Spring Boot**, con persistencia en MySQL y DTOs para exponer datos.

---

## 🚀 Objetivos del proyecto
- Completar dependencias necesarias en `pom.xml`.
- Crear 3 entidades: **Cine**, **DetalleCine**, **Sala**.
- Configurar relaciones entre entidades:
    - `Cine` ↔️ `DetalleCine` (1:1)
    - `Cine` ↔️ `Sala` (1:N)
- Crear repositorios para cada entidad con una consulta personalizada.
- Implementar un **DTO (CineDTO)** y un **Mapper (MapStruct)** para conversión.
- Desarrollar 3 servicios (uno por entidad) enfocados en **guardar registros**.

---

## ⚙️ Dependencias principales
En el `pom.xml` se añadieron las siguientes dependencias:

- **Spring Web**
- **Spring Data JPA**
- **Spring Boot DevTools**
- **MySQL Driver**
- **H2 Database** (para pruebas en memoria)
- **MapStruct 1.5.5.Final**

---

## 🗂️ Entidades

### Cine
- `id` (PK)
- `nombre`
- `nit`
- Relación 1:1 con **DetalleCine**
- Relación 1:N con **Sala**

### DetalleCine
- `id` (PK)
- `direccion`
- `ciudad`
- `telefono`
- Relación 1:1 con **Cine**

### Sala
- `id` (PK)
- `nombre`
- `capacidad`
- `tipo` (2D, 3D, IMAX…)
- Relación N:1 con **Cine**

---

## 📦 Repositorios

### ICineRepositorio
- Método personalizado: `findByNombreContainingIgnoreCase(String nombre)`
- Método con relación: `findByNombreAndSalas_CapacidadGreaterThan(String nombre, Integer capacidad)`

### IDetalleCineRepositorio
- Método personalizado: `findByCiudad(String ciudad)`

### ISalaRepositorio
- Método personalizado: `findByCapacidadGreaterThanAndTipo(Integer capacidad, String tipo)`

---

## 🛠️ DTO y Mapper

### CineDTO
Campos expuestos:
- `id`
- `nombre`
- `nit`
- `ciudad` (viene de `DetalleCine`)

### CineMapper (MapStruct)
Convierte:
- **Cine → CineDTO**
- **Lista\<Cine> → Lista\<CineDTO>**

---

## 🧩 Servicios

Se implementaron **tres servicios**, cada uno orientado a la operación de **guardar datos** en su respectiva entidad:

- **CineServicio**: guarda registros de cines y retorna un `CineDTO`.
- **DetalleCineServicio**: guarda los detalles relacionados a un cine.
- **SalaServicio**: guarda salas asociadas a un cine.

---

## ✅ Estado actual
- [x] Dependencias configuradas
- [x] Entidades creadas con relaciones
- [x] Repositorios con consultas personalizadas
- [x] DTO + Mapper (MapStruct)
- [x] Servicios con operación de guardar  
