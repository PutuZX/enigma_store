package com.enigma.enigmaStore.controller;

import com.enigma.enigmaStore.model.Product;
import java.util.ArrayList;

public class ProductController {
    private ArrayList<Product> products;

    public ProductController(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public Product getProduct(int index){
        return products.get(index);
    }
}
