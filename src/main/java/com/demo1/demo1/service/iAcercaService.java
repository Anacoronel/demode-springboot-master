package com.demo1.demo1.service;
import java.util.List;

import com.demo1.demo1.model.Acercade;
public interface iAcercaService {
    

    



    public List<Acercade> verAcercade();
    public void crearAcercade(Acercade acercade);
    public void borrarAcercade(Long id);
    public Acercade buscarAcercade(Long id);

   
}