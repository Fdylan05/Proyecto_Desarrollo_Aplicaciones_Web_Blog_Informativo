/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.service;

import java.util.List;
import org.springframework.stereotype.Repository;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Zona;

@Repository
public interface IZonaService {
    public List<Zona> getAllZonas();
    public void saveZona(Zona zona);
    public Zona getZonaById(long id);
    public void delete(long id);
    
}
