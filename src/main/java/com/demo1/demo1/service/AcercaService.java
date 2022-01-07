package com.demo1.demo1.service;
import java.util.List;

import com.demo1.demo1.Repository.AcercaRepository;
import com.demo1.demo1.model.Acercade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaService implements iAcercaService {
    


    @Autowired
    public AcercaRepository acercarepo;

    @Override
    public List<Acercade> verAcercade() {
    return acercarepo.findAll();
    }
    @Override
    public void crearAcercade(Acercade acercade) {
        acercarepo.save(acercade);   
    }
    @Override
    public void borrarAcercade(Long id) {
        acercarepo.deleteById(id); 
    }
    @Override
    public Acercade buscarAcercade(Long id){
        return acercarepo.findById(id).orElse(null);
    }
    
    
}
