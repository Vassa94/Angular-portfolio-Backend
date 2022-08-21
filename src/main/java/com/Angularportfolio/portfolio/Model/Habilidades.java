package com.Angularportfolio.portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {
 
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private Long nivel;
    private Long per_id;

    public Habilidades() {
    }

    public Habilidades(Long id, String nombre, Long nivel, Long per_id) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.per_id = per_id;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getNivel() {
        return nivel;
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

    public void setNivel(Long nivel) {
        this.nivel = nivel;
    }

    public void setPer_id(Long per_id) {
        this.per_id = per_id;
    }
    
    
    
    
}
