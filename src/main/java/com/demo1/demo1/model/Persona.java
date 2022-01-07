
package com.demo1.demo1.model;
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
    @OneToOne(targetEntity = Usuario.class)
    private List<Usuario> listaUsuarios;
    @OneToMany(targetEntity = Ubicacion.class)
    private List<Ubicacion> listaUbicaciones;
    @OneToMany(targetEntity = Idioma.class)
    private List<Idioma> listaIdiomas;
    @OneToMany(targetEntity = Acercade.class)
    private List<Acercade> listaAcercade;

    
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

    


}

