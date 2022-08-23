package com.Angularportfolio.portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skill_generator")
    @SequenceGenerator(name="skill_generator", sequenceName = "skill_seq", allocationSize=1)
    private Long id;
    private String nombre;
    private Long nivel;
    private Long perId;

    public Habilidades() {
    }

    public Habilidades(Long id, String nombre, Long nivel, Long perId) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.perId = perId;
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

    public Long getPerId() {
        return perId;
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

    public void setPerId(Long perId) {
        this.perId = perId;
    }
    
    
    
    
}
