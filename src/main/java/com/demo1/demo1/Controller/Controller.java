package com.demo1.demo1.Controller;

import java.util.ArrayList;
import java.util.List;


import com.demo1.demo1.model.Persona;

import com.demo1.demo1.service.iPersonaService;

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
@RequestMapping("/persona")
public class Controller {
    @Autowired
    private iPersonaService persoserv;


    List<Persona> listaPersonas  = new ArrayList<>();
    
    
    @PostMapping("/new")
    public void agregarPersona(@RequestBody Persona pers){
        persoserv.crearPersona(pers);
    }
    

    public void setPersoserv(iPersonaService persoserv) {
        this.persoserv = persoserv;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoserv.verPersonas();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoserv.borrarPersona(id);
    }
    @PutMapping("/edit/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestBody Persona pers){
        persoserv.buscarPersona(id);
        
        return pers;
    }
}


