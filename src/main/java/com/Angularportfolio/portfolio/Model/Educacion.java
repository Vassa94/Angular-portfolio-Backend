package com.Angularportfolio.portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String fechaInicio;
    private Boolean actual ;
    private String fechaFin ;
    private String posicion;
    private String descripcion;
    private Long per_id;

    public Educacion() {
    }

    public Educacion(Long id, String nombre, String fechaInicio, Boolean actual, String fechaFin, String posicion, String descripcion, Long per_id) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.actual = actual;
        this.fechaFin = fechaFin;
        this.posicion = posicion;
        this.descripcion = descripcion;
        this.per_id = per_id;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public Boolean getActual() {
        return actual;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Long getPer_id() {
        return per_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPer_id(Long per_id) {
        this.per_id = per_id;
    }
    
    
    
}
