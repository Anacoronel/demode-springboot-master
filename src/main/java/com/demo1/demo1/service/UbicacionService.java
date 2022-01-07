package com.demo1.demo1.service;
import java.util.List;
import com.demo1.demo1.Repository.UbicacionRepository;
import com.demo1.demo1.model.Ubicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UbicacionService implements iUbicacionService {
    

    @Autowired
    public UbicacionRepository ubirepo;

    @Override
    public List<Ubicacion> verUbicacion() {
    return ubirepo.findAll();
    }
    @Override
    public void crearUbicacion(Ubicacion ubi) {
        ubirepo.save(ubi);   
    }
    @Override
    public void borrarUbicacion(Long id) {
        ubirepo.deleteById(id); 
    }
    @Override
    public Ubicacion buscarUbicacion(Long id){
        return ubirepo.findById(id).orElse(null);
    }
    
    
    
}
 