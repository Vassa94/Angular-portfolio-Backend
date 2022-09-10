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
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proy_generator")
    @SequenceGenerator(name="proy_generator", sequenceName = "proy_seq", allocationSize=1)
    private Long id;
    private String nombre;
    @Column(length = 400)
    private String imgUrl;
    @Column(length = 400)
    private String descripcion;
    @Column(length = 400)
    private String linkUrl;
    private Long perId;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String imgUrl, String descripcion, String linkUrl, Long perId) {
        this.id = id;
        this.nombre = nombre;
        this.imgUrl = imgUrl;
        this.descripcion = descripcion;
        this.linkUrl = linkUrl;
        this.perId = perId;
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

    public Long getPerId() {
        return perId;
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

    public void setPerId(Long perId) {
        this.perId = perId;
    }
    
    
    
    
}
