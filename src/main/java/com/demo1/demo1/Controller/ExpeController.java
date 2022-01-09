package com.demo1.demo1.Controller;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.demo1.demo1.model.Experiencia;

import com.demo1.demo1.service.iExperienciaService;

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
@RequestMapping("/experiencia")

public class ExpeController {
    @Autowired
    private iExperienciaService expeserv;


    List<Experiencia> listaExperiencias  = new ArrayList<>();
    
    
    @PostMapping("/new")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expeserv.crearExperiencia(exp);
    }
    

    public void setExpeserv(iExperienciaService expeserv) {
        this.expeserv = expeserv;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expeserv.verExperiencias();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expeserv.borrarExperiencia(id);
    }

    @PutMapping("/edit/{id}")
    public Experiencia editExper(@PathVariable Long id, @RequestParam("fecha") Date nuevoFecha,
    @RequestParam("puesto")String nuevoPuesto, @RequestParam("empresa")String nuevaEmpresa,
    @RequestParam("link")String nuevoLink)
    {
        Experiencia exp = expeserv.buscarExperiencia(id);

        exp.setFecha(nuevoFecha);
        exp.setPuesto(nuevoPuesto);
        exp.setEmpresa(nuevaEmpresa);
        exp.setLink(nuevoLink);
        expeserv.crearExperiencia(exp);

        return exp;
    }

    
}


