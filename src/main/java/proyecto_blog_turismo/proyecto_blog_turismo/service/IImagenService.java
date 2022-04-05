/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.service;

import java.util.List;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Imagen;

/**
 *
 * @author Dylan
 */
public interface IImagenService {
    public List<Imagen> getAllImages();
    public void saveImage(Imagen comentario);
    public List<Imagen> findByUrl(String url);
}
