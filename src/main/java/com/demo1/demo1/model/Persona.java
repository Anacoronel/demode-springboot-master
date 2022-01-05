
package com.demo1.demo1.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;

    @OneToMany(targetEntity = Proyecto.class)
    private List<Proyecto> listaProyectos;
    @OneToMany(targetEntity = Educacion.class)
    private List<Educacion> listaEducaciones;
    @OneToMany(targetEntity = Experiencia.class)
    private List<Experiencia> listaExperiencias;
    @OneToMany(targetEntity = Skill.class)
    private List<Skill> listaSkills;
    @OneToMany(targetEntity = Usuario.class)
    private List<Usuario> listaUsuarios;
    @OneToMany(targetEntity = Ubicacion.class)
    private List<Ubicacion> listaUbicaciones;
    @OneToMany(targetEntity = Idioma.class)
    private List<Idioma> listaIdiomas;
    @OneToMany(targetEntity = Acercade.class)
    private List<Acercade> listaAcercade;

    public Persona(List<Proyecto> listaProyectos, List<Educacion> listaEducaciones, List<Experiencia> listaExperiencias,
            List<Skill> listaSkills, List<Usuario> listaUsuarios, List<Ubicacion> listaUbicaciones,
            List<Idioma> listaIdiomas, List<Acercade> listaAcercade) {
        this.listaProyectos = listaProyectos;
        this.listaEducaciones = listaEducaciones;
        this.listaExperiencias = listaExperiencias;
        this.listaSkills = listaSkills;
        this.listaUsuarios = listaUsuarios;
        this.listaUbicaciones = listaUbicaciones;
        this.listaIdiomas = listaIdiomas;
        this.listaAcercade = listaAcercade;
    }

    public Persona(){

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

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
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

