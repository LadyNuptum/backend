package com.manoslocales.ManosLocales.Ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return "✅ BackendManos funcionando correctamente!";
    }
}
