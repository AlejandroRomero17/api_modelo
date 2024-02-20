package com.spring.apimodelo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class listaController {
    @GetMapping
    public String index() {
        return "index";
    }
}
