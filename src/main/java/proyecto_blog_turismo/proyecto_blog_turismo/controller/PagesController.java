/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping("/login")
    public String index() {
        return "login";
    }
    
    @GetMapping("/perfil")
    public String perfil() {
        return "perfil";
    }
    
    @GetMapping({"/inicio","/"})
    public String home() {
        return "home";
    } 
    
    @GetMapping("/playa")
    public String playa() {
        return "Playa1";
    }
    
    @GetMapping("/ciudad")
    public String ciudad() {
        return "Ciudad";
    }
    
    @GetMapping("/montaña")
    public String montaña() {
        return "montaña";
    }
    
    @GetMapping("/perfilP")
    public String perfilP() {
        return "perfilPrueba";
    }
    
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    
    @GetMapping("/Zonas")
    public String zonas() {
        return "Zones";
    }
}
