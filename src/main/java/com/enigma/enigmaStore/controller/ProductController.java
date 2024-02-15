package com.enigma.enigmaStore.controller;

import com.enigma.enigmaStore.model.Product;
import java.util.ArrayList;

public class ProductController {
    private static ProductController instance;
    private ArrayList<Product> products;

    ProductController(){
        this.products = new ArrayList<>();
    }

    public static ProductController getInstance() {
        if (instance == null) {
            instance = new ProductController();
        }
        return instance;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public Product getProduct(int index){
        return products.get(index);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public int getTotalProduct(){
        return products.size();
    }
}
