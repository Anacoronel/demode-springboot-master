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

public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texto;
    private Long value;
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;
    public Skill(Long id, String texto, Long value, Persona persona) {
        this.id = id;
        this.texto = texto;
        this.value = value;
        this.persona = persona;
    }
    public Skill() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Long getValue() {
        return value;
    }
    public void setValue(Long value) {
        this.value = value;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}