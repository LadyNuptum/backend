package com.taller.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "🟢 ¡Desplegado correctamente desde GitHub Web!";
    }
}
