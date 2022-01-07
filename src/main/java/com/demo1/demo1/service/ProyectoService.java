package com.demo1.demo1.service;
import java.util.List;
import com.demo1.demo1.Repository.ProyectoRepository;
import com.demo1.demo1.model.Proyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProyectoService implements iProyectoService{
    

    @Autowired
    public ProyectoRepository prorepo;

    @Override
    public List<Proyecto> verProyecto() {
    return prorepo.findAll();
    }
    @Override
    public void crearProyecto(Proyecto pro) {
        prorepo.save(pro);   
    }
    @Override
    public void borrarProyecto(Long id) {
        prorepo.deleteById(id); 
    }
    @Override
    public Proyecto buscarProyecto(Long id){
        return prorepo.findById(id).orElse(null);
    }
    
    
    
}
 