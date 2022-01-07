package com.demo1.demo1.service;

import java.util.List;

import com.demo1.demo1.model.Idioma;

public interface iIdiomaService {
    public List<Idioma> verIdioma();
    public void crearIdioma(Idioma idioma);
    public void borrarIdioma(Long id);
    public Idioma buscarIdioma(Long id);

    
}

