package com.demo1.demo1.Controller;

import java.util.ArrayList;

import java.util.List;

import com.demo1.demo1.model.Educacion;

import com.demo1.demo1.service.iEducacionService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/educacion")

public class EduController {




@Autowired
    private iEducacionService eduserv;


    
    List<Educacion> listaEducaciones=new ArrayList<>();
    @CrossOrigin(origins = "http://localhost:4200")

    @PostMapping("/new")
    public void agregarEducacion(@RequestBody Educacion edu){
        eduserv.crearEducacion(edu);
    }
    
    public void setEduserv(iEducacionService eduserv) {
        this.eduserv = eduserv;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduserv.verEducaciones();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
	public  Educacion buscarEducacion(@PathVariable Long id){
            return eduserv.buscarEducacion(id);
             
        }
	
    
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduserv.borrarEducacion(id);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/edit/{id}")
    public  Educacion editEducacion(@PathVariable Long id, @RequestBody Educacion edu )
    {
        eduserv.buscarEducacion(id);
        edu.setFecha(edu.getFecha());
        edu.setTitulo(edu.getTitulo());
        edu.setInstitucion(edu.getInstitucion());
        edu.setLink(edu.getLink());
        eduserv.crearEducacion(edu);

        

        return edu;
    }

    


}