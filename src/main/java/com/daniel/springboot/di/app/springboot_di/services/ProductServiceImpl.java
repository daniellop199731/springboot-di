package com.daniel.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.daniel.springboot.di.app.springboot_di.models.Product;
import com.daniel.springboot.di.app.springboot_di.repositories.IProductRepository;
import com.daniel.springboot.di.app.springboot_di.repositories.ProductRepositoryImpl;

/**
 * Clase service que simula la capa de logica de negocio
 * Aca tambien se manejan las transacciones y manejo de excepciones
 * por errores en la optencion de los datos de las clases repositories
 */

 @Service
 @Primary
public class ProductServiceImpl implements IProductService {

    /**
     * @Autowired inca que spring va a buscar un componente que implemente la interfaz, en este caso
     * IProductRepository.
     */    
    @Autowired
    /*  Con  @Qualifier especificamos que implementacion se va a inyectar
        La implementacion debe ser un componente (bean) de spring
        Se coloca el nombre de la clase con la primera letra en minuscula
        Se debe conservar el @Autowired
        Ejemplo ...*/ 
    //@Qualifier("productRepositoryImpl") //Otra manera de inyectar, 
    @Qualifier("repositorio2")  //Otra manera de inyectar, siempre y cuando la implementacion
                                // este marcada como componente y tenga un nombre especifico 
                                // ver en ProductRepositoryImpl o ProductRepositoryImplAux
                                // la anotacion @Repository de cada uno
    private IProductRepository repository;
    
    @Override
    public List<Product> findAll(){
        
        /*
         * Como parte de la simulacion de la logica de negocio
         * a cada precio de los productos se le multiplica un impuesto del 1.25
         */
        return repository.findAll().stream().map(p -> {
            Double priceTax = p.getProductPrice() * 1.25d;
            //Product newProduct = new Product(p.getId(), p.getProductName(), priceTax.longValue());
            Product newProduct = (Product) p.clone();
            newProduct.setProductPrice(priceTax.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id){
        return repository.findById(id);
    }

}
