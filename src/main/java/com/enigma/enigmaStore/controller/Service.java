package com.enigma.enigmaStore.controller;

import java.util.Date;
import java.util.UUID;

import com.enigma.enigmaStore.model.Product;
import com.enigma.enigmaStore.util.Validator;
import com.enigma.enigmaStore.view.UI;

public class Service {
    Validator validator = new Validator();
    UI ui = new UI();
    public void serviceController(int input){
        switch (input) {
            case 1:
                ui.addProductUI();
                break;
            case 2:
                ui.updateProductUI();
                break;
            case 3:
                ui.removeProductUI();
                break;
            case 4:
                ui.viewProductUI();
                break;
            case 5:
                ui.findProductUI();
                break;
            case 6:
                System.out.println(ui.getQuit());
                break;
            default:
                System.out.println(ui.getInvalidService());
                break;
        }
    }

    public void addProduct(String name, String brand, double price){
        if(name == "" || brand == "" || price == 0){
            System.out.println(ui.getInvalidInput());
            ui.menu();
        } else{
           ProductController controller = new ProductController();
           controller.addProduct(new Product(UUID.randomUUID().toString(), name, brand, price, new Date()));
           controller.getProduct(0);
           System.out.println("\nInputted Product: ");
           System.out.println(controller.getProduct(0));
        }
    }
}
