package com.demo1.demo1.Controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.demo1.demo1.model.Proyecto;

import com.demo1.demo1.service.iProyectoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProyectoController {
   
    @Autowired

    private iProyectoService proserv;


    List<Proyecto> listaProyectos  = new ArrayList<>();
    
    
    @PostMapping("/pro/new")
    public void agregarProyecto(@RequestBody Proyecto pro){
        proserv.crearProyecto(pro);
    }
    

    public void setProyserv(iProyectoService proserv) {
        this.proserv = proserv;
    }

    @GetMapping("/pro/ver")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proserv.verProyecto();
    }
    
    
    @DeleteMapping("/prodelete/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proserv.borrarProyecto(id);
    }
    @PutMapping("/proaeditar/{id}")
    public Proyecto editProyecto(@PathVariable Long id, @RequestParam("fecha") Date newDate,
    @RequestParam("link") String newLink, @RequestParam("texto") String newText){
        Proyecto pro = proserv.buscarProyecto(id);
        pro.setFecha(newDate);
        pro.setLink(newLink);
        pro.setTexto(newText);
        proserv.crearProyecto(pro);
        return pro;
    }
    
}


 