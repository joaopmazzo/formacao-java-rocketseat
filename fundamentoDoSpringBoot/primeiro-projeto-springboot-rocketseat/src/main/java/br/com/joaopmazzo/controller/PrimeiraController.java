package br.com.joaopmazzo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable Long id) {
        return "O parametro é " + id;
    }

    @GetMapping("/metodoComQueryParams/{id}")
    public String metodoComQueryParams(@RequestParam Long id) {
        return "O parametro com metodoComQueryParams é " + id;
    }

    @GetMapping("/metodoComQueryParams2/{id}")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
        return "O parametro com metodoComQueryParams2 é " + allParams.entrySet();
    }
    
}
