package com.Angularportfolio.portfolio.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exp_generator")
        @SequenceGenerator(name="exp_generator", sequenceName = "exp_seq", allocationSize=1)
        private Long id;
        private String titulo;
        private String fechaInicio;
        private Boolean actual;
        private String fechaFin;
        private String posicion;
        @Column(length=500)
        private String descripcion;
        private Long perId;

    public Experiencia() {
    }

    public Experiencia(Long id, String titulo, String fechaInicio, Boolean actual, String fechaFin, String posicion, String descripcion, Long perId) {
        this.id = id;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.actual = actual;
        this.fechaFin = fechaFin;
        this.posicion = posicion;
        this.descripcion = descripcion;
        this.perId = perId;
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

    public String getDescripcion() {
        return descripcion;
    }

    public Long getPer_id() {
        return perId;
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

    public void setDescripcion(String decripcion) {
        this.descripcion = decripcion;
    }

    public void setPer_id(Long per_id) {
        this.perId = per_id;
    }
        
        
        


    
}
