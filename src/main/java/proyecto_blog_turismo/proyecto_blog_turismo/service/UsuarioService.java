/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Usuario;
import proyecto_blog_turismo.proyecto_blog_turismo.repository.UsuarioRepository;
import proyecto_blog_turismo.proyecto_blog_turismo.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public List<Usuario> getAllUser(){
        return (List<Usuario>)usuarioRepository.findAll();
    }
    
    @Override
    public void saveUser(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    
    @Override
    public Usuario getUserById(long id){
        return usuarioRepository.findById(id).orElse(null);
    }
    
     @Override
    public void delete(long id){
        usuarioRepository.deleteById(id);
    }
}
