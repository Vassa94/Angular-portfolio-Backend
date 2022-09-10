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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "edu_generator")
    @SequenceGenerator(name="edu_generator", sequenceName = "edu_seq", allocationSize=1)
    private Long id;
    private String nombre;
    private String fechaInicio;
    private Boolean actual ;
    private String fechaFin ;
    @Column(length = 400)
    private String descripcion;

    private String titulo;
    private Long perId;

    public Educacion() {
    }

    public Educacion(Long id, String nombre, String fechaInicio, Boolean actual, String fechaFin, String posicion, String descripcion, String titulo, Long perId) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.actual = actual;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.perId = perId;
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

    public String getDescripcion() {
        return descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Long getPerId() {
        return perId;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPerId(Long perId) {
        this.perId = perId;
    }
    
    
    
}
