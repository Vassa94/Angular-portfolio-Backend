package com.Angularportfolio.portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {

        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE)
        private Long id;
        private String titulo;
        private String fechaInicio;
        private Boolean actual;
        private String fechaFin;
        private String posicion;
        private String decripcion;
        private Long per_id;

    public Experiencia() {
    }

    public Experiencia(Long id, String titulo, String fechaInicio, Boolean actual, String fechaFin, String posicion, String decripcion, Long per_id) {
        this.id = id;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.actual = actual;
        this.fechaFin = fechaFin;
        this.posicion = posicion;
        this.decripcion = decripcion;
        this.per_id = per_id;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
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

    public String getDecripcion() {
        return decripcion;
    }

    public Long getPer_id() {
        return per_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public void setPer_id(Long per_id) {
        this.per_id = per_id;
    }
        
        
        


    
}
