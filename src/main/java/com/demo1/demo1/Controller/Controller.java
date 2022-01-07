package com.demo1.demo1.Controller;

import java.util.ArrayList;
import java.util.List;


import com.demo1.demo1.model.Persona;

import com.demo1.demo1.service.iPersonaService;

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
public class Controller {
    @Autowired
    private iPersonaService persoserv;


    List<Persona> listaPersonas  = new ArrayList<>();
    
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        persoserv.crearPersona(pers);
    }
    

    public void setPersoserv(iPersonaService persoserv) {
        this.persoserv = persoserv;
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoserv.verPersonas();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoserv.borrarPersona(id);
    }
    @PutMapping("/personaeditar/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestParam("nombre") String nuevoNombre){
        Persona pers = persoserv.buscarPersona(id);
        pers.setNombre(nuevoNombre);
        persoserv.crearPersona(pers);
        return pers;
    }
    
}


