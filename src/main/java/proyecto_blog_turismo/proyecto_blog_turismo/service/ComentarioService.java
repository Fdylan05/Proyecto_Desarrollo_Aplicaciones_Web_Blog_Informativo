/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Comentarios;
import proyecto_blog_turismo.proyecto_blog_turismo.repository.ComentarioRepository;

@Service
public class ComentarioService implements IComentarioService{
    
    @Autowired
    private ComentarioRepository comentarioRepository;
    
    @Override
    public List<Comentarios> getAllComents(){
        return (List<Comentarios>)comentarioRepository.findAll();
    }
    
    @Override
    public void saveComent(Comentarios comentario){
        comentarioRepository.save(comentario);
    }
    
    @Override
    public List<Comentarios> findByUrl(String url){
        return (List<Comentarios>)comentarioRepository.findByUrl(url);
    }
    
}
