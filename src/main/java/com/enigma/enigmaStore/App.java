package com.enigma.enigmaStore;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import com.enigma.enigmaStore.controller.ProductController;
import com.enigma.enigmaStore.model.Product;
import com.enigma.enigmaStore.view.UI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Scanner input = new Scanner(System.in);
        // Product products = new Product(UUID.randomUUID().toString(), "Jas Hujan", "Nike", 1000.0, new Date(124, 0, 20));
        // System.out.println(products.toString());
        ProductController products = ProductController.getInstance();
        Product product1 = new Product(UUID.randomUUID().toString(), "Jas Ujan", "Nike", 100.0, new Date(122, 2, 24));
        Product product2 = new Product(UUID.randomUUID().toString(), "Topi Koboy", "Adidas", 200.0, new Date(123, 3, 24));
        products.addProduct(product1);
        products.addProduct(product2);

        UI ui = new UI();
        ui.menu();
    }
}
