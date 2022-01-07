package com.demo1.demo1.Controller;
import java.util.ArrayList;
import java.util.List;


import com.demo1.demo1.model.Ubicacion;

import com.demo1.demo1.service.iUbicacionService;

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

public class UbicaController {
    @Autowired
    private iUbicacionService ubiserv;



List<Ubicacion> listaUbicacion  = new ArrayList<>();
    
    
    @PostMapping("/ubi/new")
    public void agregarUbi(@RequestBody Ubicacion ubi){
        ubiserv.crearUbicacion(ubi);
    }
    

    public void setUbiserv(iUbicacionService ubiserv) {
        this.ubiserv = ubiserv;
    }

    @GetMapping("/ubi/ver")
    @ResponseBody
    public List<Ubicacion> verUbicacion(){
        return ubiserv.verUbicacion();
    }
    
    
    @DeleteMapping("/ubidelete/{id}")
    public void borrarUbicacion(@PathVariable Long id){
        ubiserv.borrarUbicacion(id);
    }
    @PutMapping("/ubieditar/{id}")
    public Ubicacion editUbicacion(@PathVariable Long id, @RequestParam("ciudad") String newCity, @RequestParam("pais")String newPais){
        Ubicacion ubi = ubiserv.buscarUbicacion(id);
        ubi.setCiudad(newCity);
        ubi.setPais(newPais);
        ubiserv.crearUbicacion(ubi);
        return ubi;
    }
    
}


 