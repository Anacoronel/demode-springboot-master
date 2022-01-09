package com.demo1.demo1.Controller;

import java.util.ArrayList;
import java.util.List;


import com.demo1.demo1.model.Idioma;

import com.demo1.demo1.service.iIdiomaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/idioma")

public class IdioController {
       @Autowired
    private iIdiomaService idioserv;


    List<Idioma> listaIdioma  = new ArrayList<>();
    
    
    @PostMapping("/new")
    public void agregarIdioma(@RequestBody Idioma idio){
        idioserv.crearIdioma(idio);
    }
    

    public void setIdioserv(iIdiomaService idioserv) {
        this.idioserv = idioserv;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Idioma> verIdioma(){
        return idioserv.verIdioma();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarIdioma(@PathVariable Long id){
        idioserv.borrarIdioma(id);
    }
    @PutMapping("/edit/{id}")
    public Idioma editIdioma(@PathVariable Long id, @RequestParam("idioma") String newIdio, @RequestParam("nivel")String newNivel){
        Idioma idio = idioserv.buscarIdioma(id);
        idio.setIdioma(newIdio);
        idio.setNivel(newNivel);

        idioserv.crearIdioma(idio);
        return idio;
    }
    
}


 