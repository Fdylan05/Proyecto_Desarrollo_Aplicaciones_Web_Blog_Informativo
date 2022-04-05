/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.service;

import java.util.List;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Comentarios;

/**
 *
 * @author Dylan
 */
public interface IComentarioService {
    public List<Comentarios> getAllComents();
    public void saveComent(Comentarios comentario);
    public List<Comentarios> findByUrl(String url);
}
