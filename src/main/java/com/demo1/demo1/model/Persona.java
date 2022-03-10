
package com.demo1.demo1.model;


import java.util.ArrayList;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String fotoperfil;
    private String fotoback;
    private String mail;
    private String ciudad;
    private String pais;
    

    @OneToMany(mappedBy="persona")
    private List<Proyecto> listaProyectos = new ArrayList<>();
    
    @OneToMany(mappedBy="persona")
    private List<Educacion> listaEducaciones = new ArrayList<>();
   
    @OneToMany(mappedBy="persona")
    private List<Experiencia> listaExperiencias = new ArrayList<>();
    
    @OneToMany(mappedBy="persona")
    private List<Skill> listaSkills = new ArrayList<>();
    
    

    
    @OneToMany(mappedBy="persona")
    private List<Idioma> listaIdiomas = new ArrayList<>();

    @OneToMany(mappedBy="persona")
    private List<Acercade> listaAcercade = new ArrayList<>();

    
    
    public Persona(Long id,String mail, String nombre, String descripcion, String fotoperfil, String fotoback, String ciudad, String pais){
           // List<Proyecto> listaProyectos, List<Educacion> listaEducaciones, List<Experiencia> listaExperiencias,
           // List<Skill> listaSkills, List<Usuario> listaUsuarios , List<Idioma> listaIdiomas,
           // List<Acercade> listaAcercade) {
        this.id = id;
        this.nombre = nombre;
        this.mail= mail;
        this.ciudad=ciudad;
        this.pais=pais;
        this.descripcion = descripcion;
        this.fotoperfil = fotoperfil;
        this.fotoback = fotoback;
     //   this.listaProyectos = listaProyectos;
       // this.listaEducaciones = listaEducaciones;
       // this.listaExperiencias = listaExperiencias;
       // this.listaSkills = listaSkills;
       // this.listaUsuarios = listaUsuarios;
      //  this.listaIdiomas = listaIdiomas;
       // this.listaAcercade = listaAcercade;
    }

    public Persona() {
		
	}
    
    public String getFotoback() {
        return fotoback;
    }

    public void setFotoback(String fotoback) {
        this.fotoback = fotoback;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getFotoperfil() {
        return fotoperfil;
    }

    public void setFotoperfil(String fotoperfil) {
        this.fotoperfil = fotoperfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

  /*  public List<Proyecto> getListaProyectos() {
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

    */


}

