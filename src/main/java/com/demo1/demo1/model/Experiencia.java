package com.demo1.demo1.model;


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
public class Experiencia {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private String fechaHasta;
    private String puesto;
    private String empresa;
    private String link;
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;
    
    public Experiencia(Long id, String fecha, String fechaHasta, String puesto, String empresa, String link, Persona persona) {
        this.id = id;
        this.fecha = fecha;
        this.fechaHasta=fechaHasta;
        this.puesto = puesto;
        this.empresa = empresa;
        this.link = link;
        this.persona = persona;
    }
    public Experiencia() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFechaHasta() {
        return fechaHasta;
    }
    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
 