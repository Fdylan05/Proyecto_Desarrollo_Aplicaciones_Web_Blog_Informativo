/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Localidad;
import proyecto_blog_turismo.proyecto_blog_turismo.repository.LocalidadRepository;
import proyecto_blog_turismo.proyecto_blog_turismo.service.ILocalidadService;

@Service
public class LocalidadService implements ILocalidadService{
    
    @Autowired
    private LocalidadRepository localidadRepository;
    
    @Override
    public List<Localidad> getAllLocalidades(){
        return (List<Localidad>)localidadRepository.findAll();
    }
    
    @Override
    public void saveLocalidad(Localidad localidad){
        localidadRepository.save(localidad);
    }
    
    @Override
    public Localidad getLocalidadById(long id){
        return localidadRepository.findById(id).orElse(null);
    }
    
     @Override
    public void delete(long id){
        localidadRepository.deleteById(id);
    }
}
