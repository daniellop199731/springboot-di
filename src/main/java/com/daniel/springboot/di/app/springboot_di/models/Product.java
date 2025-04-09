package com.daniel.springboot.di.app.springboot_di.models;

/**
 * Este tipo de clase model tambien se conocen como clases pojo
 */
public class Product {

    private long id;
    private String productName;
    private long productPrice;

    public Product() {
    }

    public Product(long id, String productName, long productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public long getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    

}
