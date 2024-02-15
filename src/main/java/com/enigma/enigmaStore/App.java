package com.enigma.enigmaStore;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

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
        Scanner input = new Scanner(System.in);
        UI ui = new UI();
        ui.menu();
    }
}
