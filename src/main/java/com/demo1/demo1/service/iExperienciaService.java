package com.demo1.demo1.service;
import java.util.List;

import com.demo1.demo1.model.Experiencia;
public interface iExperienciaService {
    








    public List<Experiencia> verExperiencias();
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);

   
}