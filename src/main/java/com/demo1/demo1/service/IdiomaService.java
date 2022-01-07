package com.demo1.demo1.service;
import java.util.List;
import com.demo1.demo1.Repository.IdiomaRepository;
import com.demo1.demo1.model.Idioma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class IdiomaService implements iIdiomaService {
    
    @Autowired
    public IdiomaRepository idiorepo;

    @Override
    public List<Idioma> verIdioma() {
    return idiorepo.findAll();
    }
    @Override
    public void crearIdioma(Idioma idio) {
        idiorepo.save(idio);   
    }
    @Override
    public void borrarIdioma(Long id) {
        idiorepo.deleteById(id); 
    }
    @Override
    public Idioma buscarIdioma(Long id){
        return idiorepo.findById(id).orElse(null);
    }
    
    
    
}

 