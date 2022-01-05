package com.demo1.demo1.service;

import java.util.List;

import com.demo1.demo1.model.Educacion;

public interface iEducacionService {
    



    public List<Educacion> verEducaciones();
    public void crearEducacion(Educacion edu);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);

   
}
