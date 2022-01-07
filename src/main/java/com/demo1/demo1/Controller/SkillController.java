package com.demo1.demo1.Controller;
import java.util.ArrayList;

import java.util.List;


import com.demo1.demo1.model.Skill;

import com.demo1.demo1.service.iSkillService;

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

public class SkillController {
   
    @Autowired

    private iSkillService skillserv;


    List<Skill> listaSkill  = new ArrayList<>();
    
    
    @PostMapping("/skill/new")
    public void agregarSkill(@RequestBody Skill skill){
        skillserv.crearSkill(skill);
    }
    

    public void setSkillserv(iSkillService skillserv) {
        this.skillserv = skillserv;
    }

    @GetMapping("/skill/ver")
    @ResponseBody
    public List<Skill> verSkill(){
        return skillserv.verSkill();
    }
    
    
    @DeleteMapping("/skilldelete/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillserv.borrarSkill(id);
    }
    @PutMapping("/skilleditar/{id}")
    public Skill editSkill(@PathVariable Long id, @RequestParam("texto") String newText,
    @RequestParam("porcentaje") String newPorcentaje){
        Skill skill = skillserv.buscarSkill(id);
        
        skill.setPorcentaje(newPorcentaje);
        skill.setTexto(newText);
        skillserv.crearSkill(skill);
        return skill;
    }
    
}


 