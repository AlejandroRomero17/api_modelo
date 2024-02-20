package com.spring.apimodelo.controller;

import java.util.ArrayList;
import java.util.List;  // Importa la clase List
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.apimodelo.model.usuario;

@Controller
public class ListaController {
    
    @GetMapping("/index")  // Se ha añadido una ruta ("/index") al endpoint
    public String index() {
        List<usuario> usuarios = new ArrayList<>();  // Corregido el uso de ArrayList
        usuarios.add(new usuario(1L, "Usuario1", "Rigoberto"))

        // Puedes realizar operaciones con la lista de usuarios aquí

        return "index";
    }
}
