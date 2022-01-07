package com.demo1.demo1.service;

import java.util.List;
import com.demo1.demo1.Repository.SkillRepository;
import com.demo1.demo1.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkillService implements iSkillService {
    


    @Autowired
    public SkillRepository skillrepo;

    @Override
    public List<Skill> verSkill() {
    return skillrepo.findAll();
    }
    @Override
    public void crearSkill(Skill skill) {
        skillrepo.save(skill);   
    }
    @Override
    public void borrarSkill(Long id) {
        skillrepo.deleteById(id); 
    }
    @Override
    public Skill buscarSkill(Long id){
        return skillrepo.findById(id).orElse(null);
    }
    
    
    
}
 