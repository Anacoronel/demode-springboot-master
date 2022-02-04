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
public class Usuario {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String password;
    private String mail;
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;
    
    
    
    public Usuario(Long id, String usuario, String password, String mail, Persona persona) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.mail = mail;
        this.persona = persona;
    }
    public Usuario() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String pasword) {
        this.password = pasword;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}