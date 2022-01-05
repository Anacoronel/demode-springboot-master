package com.demo1.demo1.service;


import java.util.List;
import com.demo1.demo1.Repository.PersonaRepository;
import com.demo1.demo1.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements iPersonaService{
    @Autowired
    public PersonaRepository persorepo;

    @Override
    public List<Persona> verPersonas() {
    return persorepo.findAll();
    }
    @Override
    public void crearPersona(Persona pers) {
        persorepo.save(pers);   
    }
    @Override
    public void borrarPersona(Long id) {
        persorepo.deleteById(id); 
    }
    @Override
    public Persona buscarPersona(Long id){
        return persorepo.findById(id).orElse(null);
    }
    
    
}
