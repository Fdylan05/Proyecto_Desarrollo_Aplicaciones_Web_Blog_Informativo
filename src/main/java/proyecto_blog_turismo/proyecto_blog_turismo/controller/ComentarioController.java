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
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Comentarios;
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Imagen;
import proyecto_blog_turismo.proyecto_blog_turismo.service.IComentarioService;
import proyecto_blog_turismo.proyecto_blog_turismo.service.IImagenService;

@Controller
public class ComentarioController {

    @Autowired
    private IComentarioService comentarioService;
    @Autowired
    private IImagenService imagenService;
    

    @GetMapping("/comentarios")
    public String index(Model model) {
        List<Comentarios> listaComentarios = comentarioService.getAllComents();
        model.addAttribute("titulo", "Comentarios");
        model.addAttribute("comentarios", listaComentarios);
        model.addAttribute("comentario", new Comentarios());
        return "testcomentarios";
    }
    
    @PostMapping("/guardaComentario")
    public String guardarComentario(@ModelAttribute Comentarios comentario){
        comentarioService.saveComent(comentario);
        return "redirect:/perfilPrueba";
    }
    
    @GetMapping("/comentariosN")
    public String indexN(Model model) {
        List<Comentarios> listaComentariosN = comentarioService.findByUrl("images/bandera.png");
        model.addAttribute("titulo", "Comentarios");
        model.addAttribute("comentarios", listaComentariosN);
        model.addAttribute("comentario", new Comentarios());
        return "testcomentarios";
    }
    
    @GetMapping("/verComentarios/{url}")
    public String indexM(@PathVariable("url") String urlImagen, Model model) {
        List<Comentarios> listaComentariosM = comentarioService.findByUrl("images/"+urlImagen);
        List<Imagen> listaImagen = imagenService.findByUrl("/images/"+urlImagen);
        model.addAttribute("titulo", "Comentarios");
        model.addAttribute("comentarios", listaComentariosM);
        model.addAttribute("imagen", listaImagen);
        model.addAttribute("comentario", new Comentarios());
        return "testcomentarios";
    }
    
}
