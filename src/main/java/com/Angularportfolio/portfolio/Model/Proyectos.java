package com.Angularportfolio.portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imgUrl;
    private String descripcion;
    private String linkUrl;
    private Long per_id;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String imgUrl, String descripcion, String linkUrl, Long per_id) {
        this.id = id;
        this.nombre = nombre;
        this.imgUrl = imgUrl;
        this.descripcion = descripcion;
        this.linkUrl = linkUrl;
        this.per_id = per_id;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLinkUrl() {
        return linkUrl;
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

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public void setPer_id(Long per_id) {
        this.per_id = per_id;
    }
    
    
    
    
}
