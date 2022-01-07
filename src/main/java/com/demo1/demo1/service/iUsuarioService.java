package com.demo1.demo1.service;

import java.util.List;

import com.demo1.demo1.model.Usuario;

public interface iUsuarioService {
    public List<Usuario> verUsuario();
    public void crearUsuario(Usuario usuario);
    public void borrarUsuario(Long id);
    public Usuario buscarUsuario(Long id);

}
