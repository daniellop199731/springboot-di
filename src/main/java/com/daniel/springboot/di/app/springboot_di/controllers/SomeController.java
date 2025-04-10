package com.daniel.springboot.di.app.springboot_di.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.springboot.di.app.springboot_di.models.Product;
import com.daniel.springboot.di.app.springboot_di.services.IProductService;

@RestController
@RequestMapping("/api")
public class SomeController {

    /**
     * @Autowired inca que spring va a buscar un componente que implemente la interfaz, en este caso
     * IProductService.
     */
    @Autowired
    private IProductService service;

    @GetMapping
    public List<Product> list(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return service.findById(id);
    }
    

}
