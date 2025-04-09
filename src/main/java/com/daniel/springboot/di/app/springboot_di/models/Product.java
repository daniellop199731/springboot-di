package com.daniel.springboot.di.app.springboot_di.models;

/**
 * Este tipo de clase model tambien se conocen como clases pojo
 */
public class Product {

    private Long id;
    private String productName;
    private long productPrice;

    public Product() {
    }

    public Product(Long id, String productName, Long productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Long getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    

}
