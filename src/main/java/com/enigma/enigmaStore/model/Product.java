package com.enigma.enigmaStore.model;

import java.util.Date;

public class Product {
    private String id;
    private String name;
    private String brand;
    private Double price;
    private Date date;

    public Product(String id, String name, String brand, Double price, Date date){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.date = date;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getBrand(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public Date getDate(){
        return this.date;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String toString(){
        return String.format("[ %s | %s | %s | %f | %tF ]", id, name, brand, price, date);
    }

}
