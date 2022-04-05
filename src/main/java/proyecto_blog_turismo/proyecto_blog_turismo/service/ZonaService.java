/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Zona;
import proyecto_blog_turismo.proyecto_blog_turismo.repository.ZonaRepository;
import proyecto_blog_turismo.proyecto_blog_turismo.service.IZonaService;

@Service
public class ZonaService implements IZonaService{
    
    @Autowired
    private ZonaRepository zonaRepository;
    
    @Override
    public List<Zona> getAllZonas(){
        return (List<Zona>)zonaRepository.findAll();
    }
    
    @Override
    public void saveZona(Zona zona){
        zonaRepository.save(zona);
    }
    
    @Override
    public Zona getZonaById(long id){
        return zonaRepository.findById(id).orElse(null);
    }
    
     @Override
    public void delete(long id){
        zonaRepository.deleteById(id);
    }
    
}
