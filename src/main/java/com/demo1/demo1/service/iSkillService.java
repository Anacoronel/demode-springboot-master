package com.demo1.demo1.service;

import java.util.List;

import com.demo1.demo1.model.Skill;

public interface iSkillService {
    public List<Skill> verSkill();
    public void crearSkill(Skill skill);
    public void borrarSkill(Long id);
    public Skill buscarSkill(Long id);
    
}

    

    



    

   