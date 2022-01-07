package com.demo1.demo1.service;
import java.util.List;
import com.demo1.demo1.Repository.ExperienciaRepository;
import com.demo1.demo1.model.Experiencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ExperienciaService implements iExperienciaService{
    

    @Autowired
    public ExperienciaRepository experepo;

    @Override
    public List<Experiencia> verExperiencias() {
    return experepo.findAll();
    }
    @Override
    public void crearExperiencia(Experiencia exp) {
        experepo.save(exp);   
    }
    @Override
    public void borrarExperiencia(Long id) {
        experepo.deleteById(id); 
    }
    @Override
    public Experiencia buscarExperiencia(Long id){
        return experepo.findById(id).orElse(null);
    }
    
    
}
