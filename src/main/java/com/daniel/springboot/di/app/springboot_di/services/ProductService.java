package com.daniel.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

import com.daniel.springboot.di.app.springboot_di.models.Product;
import com.daniel.springboot.di.app.springboot_di.repositories.ProductRepository;

/**
 * Clase service que simula la capa de logica de negocio
 * Aca tambien se manejan las transacciones y manejo de excepciones
 * por errores en la optencion de los datos de las clases repositories
 */
public class ProductService {

    private ProductRepository repository = new ProductRepository();
    
    public List<Product> findAll(){
        
        /*
         * Como parte de la simulacion de la logica de negocio
         * a cada precio de los productos se le multiplica un impuesto del 1.25
         */
        return repository.findAll().stream().map(p -> {
            Double priceImp = p.getProductPrice() * 1.25d;
            p.setProductPrice(priceImp.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id){
        return repository.findById(id);
    }

}
