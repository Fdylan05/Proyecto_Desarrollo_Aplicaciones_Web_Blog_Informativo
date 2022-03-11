/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.service;

import java.util.List;
import org.springframework.stereotype.Repository;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Usuario;

@Repository
public interface IUsuarioService {
    public List<Usuario> getAllUser();
    public void saveUser(Usuario usuario);
    public Usuario getUserById(long id);
    public void delete(long id);
}
