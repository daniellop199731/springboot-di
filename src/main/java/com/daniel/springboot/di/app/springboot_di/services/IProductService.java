package com.daniel.springboot.di.app.springboot_di.services;

import java.util.List;

import com.daniel.springboot.di.app.springboot_di.models.Product;

public interface IProductService {

    List<Product> findAll();

    Product findById(Long id);

}
