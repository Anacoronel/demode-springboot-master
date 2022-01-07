package com.demo1.demo1.service;
import java.util.List;
import com.demo1.demo1.Repository.UsuarioRepository;
import com.demo1.demo1.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService implements iUsuarioService{
    
    @Autowired
    public UsuarioRepository usuarepo;

    @Override
    public List<Usuario> verUsuario() {
    return usuarepo.findAll();
    }
    @Override
    public void crearUsuario(Usuario usua) {
        usuarepo.save(usua);   
    }
    @Override
    public void borrarUsuario(Long id) {
        usuarepo.deleteById(id); 
    }
    @Override
    public Usuario buscarUsuario(Long id){
        return usuarepo.findById(id).orElse(null);
    }
    
    
    
}
 