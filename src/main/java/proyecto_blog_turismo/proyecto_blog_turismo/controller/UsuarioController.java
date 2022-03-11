/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Usuario;
import proyecto_blog_turismo.proyecto_blog_turismo.service.IUsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")
    public String index(Model model) {
        List<Usuario> listaUsuarios = usuarioService.getAllUser();
        model.addAttribute("titulo", "Usuarios");
        model.addAttribute("usuarios", listaUsuarios);
        return "usuarios";
    }
    
    @GetMapping("/signup")
    public String crearUsuario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "signup";
    }
    
    @PostMapping("/save")
    public String guardarUsuario(@ModelAttribute Usuario usuario){
        usuarioService.saveUser(usuario);
        return "redirect:/";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarUsuario(@PathVariable("id") Long idUsuario){
        usuarioService.delete(idUsuario);
        return "redirect:/usuarios";
    }
}
