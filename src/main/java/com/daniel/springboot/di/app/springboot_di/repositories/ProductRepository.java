package com.daniel.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import com.daniel.springboot.di.app.springboot_di.models.Product;

public class ProductRepository {

    private List<Product> data;

    //Simulacion de un repositorio de datos
    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L, "Memoria corsair 32", 300L),
            new Product(2L, "CPU Intel Core I9", 930L),
            new Product(3L, "Teclado Razer mini", 180L),
            new Product(4L, "Main Board Gigabyte", 490L)
        );
    }

    public List<Product> findAll(){
        return this.data;
    }

}
