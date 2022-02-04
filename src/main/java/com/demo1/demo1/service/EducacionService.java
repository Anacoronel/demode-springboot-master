package com.demo1.demo1.service;
import java.util.List;


import com.demo1.demo1.Repository.EducacionRepository;
import com.demo1.demo1.model.Educacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements iEducacionService {
    



    @Autowired
    public EducacionRepository edurepo;

    @Override
    public List<Educacion> verEducaciones() {
    return edurepo.findAll();
    }
    
    
    @Override
    public  void crearEducacion(Educacion edu) {
        edurepo.save(edu);   
        
    }
    @Override
    public void borrarEducacion(Long id) {
        edurepo.deleteById(id); 
    }
    @Override
    public Educacion buscarEducacion(Long id){
        return edurepo.findById(id).orElse(null);
    }
    
    
}
