package com.demo1.demo1.Controller;



import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/experiencia")

public class ExpeController {
    @Autowired
    private iExperienciaService expeserv;


    List<Experiencia> listaExperiencias  = new ArrayList<>();
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/new")
    public Experiencia agregarExperiencia(@RequestBody Experiencia exp){
        expeserv.crearExperiencia(exp);
        return exp;
    }
    

    public void setExpeserv(iExperienciaService expeserv) {
        this.expeserv = expeserv;
    }
    @CrossOrigin(origins = "http://localhost:4200")

    @GetMapping("/")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expeserv.verExperiencias();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
	public  Experiencia buscarExperiencia(@PathVariable Long id){
            return expeserv.buscarExperiencia(id);
             
        }
    
    @CrossOrigin(origins = "http://localhost:4200")

    @DeleteMapping("/delete/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expeserv.borrarExperiencia(id);
    }
    @CrossOrigin(origins = "http://localhost:4200")

    @PutMapping("/edit/{id}")
    public Experiencia editExper(@PathVariable Long id, @RequestBody Experiencia exp)
    {
         expeserv.buscarExperiencia(id);
         exp.setFecha(exp.getFecha());
        exp.setEmpresa(exp.getEmpresa());
        exp.setFechaHasta(exp.getFechaHasta());
        exp.setLink(exp.getLink());
        expeserv.crearExperiencia(exp);

        return exp;
    }

    
}


