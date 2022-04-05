/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Imagen;
import proyecto_blog_turismo.proyecto_blog_turismo.repository.ImagenRepository;

@Service
public class ImagenService implements IImagenService{
    
    @Autowired
    private ImagenRepository imagenRepository;
    
    @Override
    public List<Imagen> getAllImages(){
        return (List<Imagen>)imagenRepository.findAll();
    }
    
    @Override
    public void saveImage(Imagen imagen){
        imagenRepository.save(imagen);
    } 
    
    @Override
    public List<Imagen> findByUrl(String url){
        return (List<Imagen>)imagenRepository.findByUrl(url);
    }
    
}
