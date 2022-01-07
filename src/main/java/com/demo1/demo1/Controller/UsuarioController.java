package com.demo1.demo1.Controller;


import java.util.ArrayList;
import java.util.List;


import com.demo1.demo1.model.Usuario;

import com.demo1.demo1.service.iUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UsuarioController {

    @Autowired
    private iUsuarioService usuaserv;


    List<Usuario> listaUsuario  = new ArrayList<>();
    
    
    @PostMapping("/new")
    public void agregarUsuario(@RequestBody Usuario usu){
    usuaserv.crearUsuario(usu);
    }
    

    public void setUsuaserv(iUsuarioService usuaserv) {
        this.usuaserv = usuaserv;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Usuario> verUsuario(){
        return usuaserv.verUsuario();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuaserv.borrarUsuario(id);
    }
    @PutMapping("/edit/{id}")
    public Usuario editUsuario(@PathVariable Long id, @RequestParam("usuario") String newUser, @RequestParam("password")String newPass, @RequestParam("email") String newEmail){
        Usuario usu = usuaserv.buscarUsuario(id);
        usu.setUsuario(newUser);
        usu.setPassword(newPass);
        usu.setEmail(newEmail);


        usuaserv.crearUsuario(usu);
        return usu;
    }
    
}


 