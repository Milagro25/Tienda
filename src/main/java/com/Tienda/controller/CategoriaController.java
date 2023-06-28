package com.Tienda.controller;

import com.Tienda.domain.Categoría;
import com.Tienda.service.CategoriaService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@RequestMapping("/categoria")
@Slf4j
@Controller
public class CategoriaController {
    
    @Autowired
    CategoriaService categoriaService; 
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso de /categoria/listado");
        List<Categoría> categorias = categoriaService.getcategorias(false); 
        
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());      
        return "/categorias/listado";
    }
    
}
