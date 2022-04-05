/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Comentarios;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentarios,Long>{
    public List<Comentarios> findByUrl(String id_form);
}
