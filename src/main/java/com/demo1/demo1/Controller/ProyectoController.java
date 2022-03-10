package com.demo1.demo1.Controller;
import java.util.ArrayList;

import java.util.List;


import com.demo1.demo1.model.Proyecto;

import com.demo1.demo1.service.iProyectoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/proyecto")


public class ProyectoController {
   
    @Autowired

    private iProyectoService proserv;


    List<Proyecto> listaProyectos  = new ArrayList<>();
    
    
    @PostMapping("/new")
    public Proyecto agregarProyecto(@RequestBody Proyecto pro){
        proserv.crearProyecto(pro);
        return pro;
    }
    

    public void setProyserv(iProyectoService proserv) {
        this.proserv = proserv;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proserv.verProyecto();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
	public  Proyecto buscarProyecto(@PathVariable Long id){
            return proserv.buscarProyecto(id);
             
        }

    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proserv.borrarProyecto(id);
    }
    @PutMapping("/edit/{id}")
    public Proyecto editProyecto(@PathVariable Long id, @RequestBody Proyecto pro){
         proserv.buscarProyecto(id);
        
                 
        pro.setFecha(pro.getFecha());
        pro.setLink(pro.getLink());
        pro.setTecnologia(pro.getTecnologia());
        pro.setTexto(pro.getTexto());
        proserv.crearProyecto(pro);
        return pro;
    }
    
}


 