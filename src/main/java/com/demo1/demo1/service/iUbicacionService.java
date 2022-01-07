package com.demo1.demo1.service;

import java.util.List;

import com.demo1.demo1.model.Ubicacion;

public interface iUbicacionService {
    public List<Ubicacion> verUbicacion();
    public void crearUbicacion(Ubicacion ubicacion);
    public void borrarUbicacion(Long id);
    public Ubicacion buscarUbicacion(Long id);
}
