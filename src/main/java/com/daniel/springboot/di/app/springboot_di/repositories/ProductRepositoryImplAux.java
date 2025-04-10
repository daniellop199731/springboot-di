package com.daniel.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.daniel.springboot.di.app.springboot_di.models.Product;

@Repository("repositorio2")
@Primary //Indica cual de las implementaciones de IProductRepository tiene prioridad
//SOLO SE PUEDE COLOCAR EN UNA IMPLEMENTACION @Primary
public class ProductRepositoryImplAux implements IProductRepository{

    private List<Product> data;

    //Simulacion de un repositorio de datos
    public ProductRepositoryImplAux() {
        this.data = Arrays.asList(
            new Product(1L, "(aux) Memoria corsair 32", 1L),
            new Product(2L, "(aux) CPU Intel Core I9", 1L),
            new Product(3L, "(aux) Teclado Razer mini", 1L),
            new Product(4L, "(aux) Main Board Gigabyte", 1L)
        );
    }

    @Override
    public List<Product> findAll(){
        return this.data;
    }

    @Override
    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(null);
    }

}
