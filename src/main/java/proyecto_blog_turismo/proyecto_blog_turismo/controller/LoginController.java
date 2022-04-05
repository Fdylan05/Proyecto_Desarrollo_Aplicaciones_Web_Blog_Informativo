/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_blog_turismo.proyecto_blog_turismo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String index() {
        return "login";
    }
    
    @GetMapping("/perfil")
    public String perfil() {
        return "perfil";
    }
    
    @GetMapping("/inicio")
    public String home() {
        return "home";
    } 
    
    @GetMapping("/playa")
    public String playa() {
        return "playa";
    }
    
    @GetMapping("/perfilP")
    public String perfilP() {
        return "perfilPrueba";
    }
}
