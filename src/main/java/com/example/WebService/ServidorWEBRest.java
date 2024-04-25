package com.example.WebService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/print")
public class ServidorWEBRest {

    @GetMapping("/imprimir")
    public String imprimir() {
        return "Saludos desde spring boot <3";
    }
}
