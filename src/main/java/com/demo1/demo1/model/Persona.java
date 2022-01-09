
package com.demo1.demo1.model;


import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy="persona")
    private List<Proyecto> listaProyectos = new ArrayList<>();
    
    @OneToMany(mappedBy="persona")
    private List<Educacion> listaEducaciones = new ArrayList<>();
   
    @OneToMany(mappedBy="persona")
    private List<Experiencia> listaExperiencias = new ArrayList<>();
    
    @OneToMany(mappedBy="persona")
    private List<Skill> listaSkills = new ArrayList<>();
    
    @OneToOne(mappedBy="persona")
    private Usuario usuario;
    
    @OneToMany(mappedBy="persona")
    private List<Ubicacion> listaUbicaciones = new ArrayList<>();
    
    @OneToMany(mappedBy="persona")
    private List<Idioma> listaIdiomas = new ArrayList<>();

    @OneToMany(mappedBy="persona")
    private List<Acercade> listaAcercade = new ArrayList<>();

    
    
    public Persona() {
		
	}
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public Persona(Long id, String nombre){
        this.setId(id);
        this.setNombre(nombre);
        
    }

    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public List<Educacion> getListaEducaciones() {
        return listaEducaciones;
    }

    public void setListaEducaciones(List<Educacion> listaEducaciones) {
        this.listaEducaciones = listaEducaciones;
    }

    public List<Experiencia> getListaExperiencias() {
        return listaExperiencias;
    }

    public void setListaExperiencias(List<Experiencia> listaExperiencias) {
        this.listaExperiencias = listaExperiencias;
    }

    public List<Skill> getListaSkills() {
        return listaSkills;
    }

    public void setListaSkills(List<Skill> listaSkills) {
        this.listaSkills = listaSkills;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Ubicacion> getListaUbicaciones() {
        return listaUbicaciones;
    }

    public void setListaUbicaciones(List<Ubicacion> listaUbicaciones) {
        this.listaUbicaciones = listaUbicaciones;
    }

    public List<Idioma> getListaIdiomas() {
        return listaIdiomas;
    }

    public void setListaIdiomas(List<Idioma> listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }

    public List<Acercade> getListaAcercade() {
        return listaAcercade;
    }

    public void setListaAcercade(List<Acercade> listaAcercade) {
        this.listaAcercade = listaAcercade;
    }

    


}

