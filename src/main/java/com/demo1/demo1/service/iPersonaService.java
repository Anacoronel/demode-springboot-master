package com.demo1.demo1.service;


import java.util.List;

import com.demo1.demo1.model.Persona;


public interface iPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona(Persona pers);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    
}
