package com.demo1.demo1.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String titulo;
    private String institucion;
    private String link;
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;
    
    public Educacion(Long id, Date fecha, String titulo, String institucion, String link, Persona persona) {
        this.id = id;
        this.fecha = fecha;
        this.titulo = titulo;
        this.institucion = institucion;
        this.link = link;
        this.persona = persona;
    }

    public Educacion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
