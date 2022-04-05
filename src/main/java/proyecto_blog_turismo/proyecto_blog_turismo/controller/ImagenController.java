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
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Imagen;
import proyecto_blog_turismo.proyecto_blog_turismo.service.IImagenService;

@Controller
public class ImagenController {
    
    @Autowired
    private IImagenService imagenService;
    
    @GetMapping("/perfilPrueba")
    public String index(Model model) {
        List<Imagen> listaImagenes = imagenService.getAllImages();
        model.addAttribute("titulo", "Imagenes");
        model.addAttribute("imagen", listaImagenes);
        return "/perfilPrueba";
    }
    
    /*@GetMapping("/comentariosN")
    public String indexN(Model model) {
        List<Imagen> listaImagenN = imagenService.findByUrl("images/bandera.png");
        model.addAttribute("titulo", "Imagenes");
        model.addAttribute("comentarios", listaImagenN);
        return "testcomentarios";
    }*/
}
