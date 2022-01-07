package com.demo1.demo1.service;

import java.util.List;

import com.demo1.demo1.model.Proyecto;

public interface iProyectoService {
    public List<Proyecto> verProyecto();
    public void crearProyecto(Proyecto proyecto);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);

}
