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
import proyecto_blog_turismo.proyecto_blog_turismo.entity.Zona;
import proyecto_blog_turismo.proyecto_blog_turismo.service.IZonaService;

@Controller
public class ZonaController {

    @Autowired
    private IZonaService zonaService;

    @GetMapping("/modificaZonas")
    public String index(Model model) {
        List<Zona> listaZonas = zonaService.getAllZonas();
        model.addAttribute("titulo", "Zonas");
        model.addAttribute("zonas", listaZonas);
        return "zonasModifica.html";
    }

    @GetMapping("/crearZona")
    public String crearZona(Model model) {
        model.addAttribute("zonas", new Zona());
        return "crear_zon";
    }

    @PostMapping("/saveZona")
    public String guardarZona(@ModelAttribute Zona zona) {
        zonaService.saveZona(zona);
        return "redirect:/zonasModifica.html";
    }

    @GetMapping("/deleteZona/{id}")
    public String eliminarZona(@PathVariable("id") Long idZona) {
        zonaService.delete(idZona);
        return "redirect:/Zones.html";
    }
    @GetMapping ("/editZona/{id}")
    public String editarZona(@PathVariable("id") Long idZona, Model model){
        Zona z = zonaService.getZonaById(idZona);
        model.addAttribute("zonas", z);
        return "zonasedit.html";
    }
    
    @GetMapping("/verZona/{id}")
    public String indexM(@PathVariable("id") long idZona, Model model) {
        Zona listaZona = zonaService.getZonaById(idZona);
        model.addAttribute("titulo", "Zonas");
        model.addAttribute("zonas", listaZona);
        return "viewZona";
    }
    
}
