package com.demo1.demo1.Controller;
import java.util.ArrayList;
import java.util.List;

import com.demo1.demo1.model.Acercade;

import com.demo1.demo1.service.iAcercaService;


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

public class AcercaController {
    




    @Autowired
    private iAcercaService acercaserv;


    List<Acercade> listaAcercade  = new ArrayList<>();
    
    
    @PostMapping("/acerca/new")
    public void agregarAcercade(@RequestBody Acercade acerca){
        acercaserv.crearAcercade(acerca);
    }
    

    public void setAcercaserv(iAcercaService acercaserv) {
        this.acercaserv = acercaserv;
    }

    @GetMapping("/acercaver")
    @ResponseBody
    public List<Acercade> verAcercade(){
        return acercaserv.verAcercade();
    }
    
    
    @DeleteMapping("/acedel/{id}")
    public void borrarAcercade(@PathVariable Long id){
        acercaserv.borrarAcercade(id);
    }

    @PutMapping("/acercaeditar/{id}")
    public Acercade editAcerca(@PathVariable Long id, @RequestParam("texto") String nuevoText){
        Acercade acerca = acercaserv.buscarAcercade(id);
        acerca.setTexto(nuevoText);
        acercaserv.crearAcercade(acerca);
        return acerca;
    }
}


