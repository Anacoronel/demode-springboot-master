package com.demo1.demo1.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.demo1.demo1.model.Educacion;

import com.demo1.demo1.service.iEducacionService;


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
public class EduController {

@Autowired
    private iEducacionService eduserv;


    
    List<Educacion> listaEducaciones=new ArrayList<>();
    
    @PostMapping("/nueva/educacion")
    public void agregarEducacion(@RequestBody Educacion edu){
        eduserv.crearEducacion(edu);
    }
    

    public void setEduserv(iEducacionService eduserv) {
        this.eduserv = eduserv;
    }

    @GetMapping("/see/educacion")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduserv.verEducaciones();
    }
    
    
    @DeleteMapping("/eduborrar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduserv.borrarEducacion(id);
    }

    @PutMapping("/edueditar/{id}")
    public Educacion editEducaion(@PathVariable Long id, @RequestParam("fecha") Date newDate,
    @RequestParam("titulo") String newTitle, @RequestParam("institucion") String newInst, 
    @RequestParam("link")String newLink)
     {

    
        Educacion edu= eduserv.buscarEducacion(id);
        edu.setFecha(newDate);
        edu.setTitulo(newTitle);
        edu.setInstitucion(newInst);
        edu.setLink(newLink);
        eduserv.crearEducacion(edu);
        return edu;
    }


}