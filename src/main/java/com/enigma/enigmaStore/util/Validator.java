package com.enigma.enigmaStore.util;

import java.util.Scanner;

import com.enigma.enigmaStore.view.UI;

public class Validator {
    UI ui = new UI();
    public int menuValidator(Scanner input){
        if(input.hasNextInt()){
            return input.nextInt();
        } else{
            return 0;
        }
    }

    public double priceValidator(Scanner input){
        // double tempPrice = input.nextDouble();
        // System.out.println("this function is called");
        // System.out.println(tempPrice);
        // System.out.println(input.hasNextDouble());
        if(input.hasNextDouble()){
            double tempPrice = input.nextDouble();
            if(tempPrice > 0){
                return tempPrice;
            } else{
                return 0;
            }
        } else{
            return 0;
        }
    }

    public String nameValidator(Scanner input){
        String name = input.nextLine();
        if(name.length() >= 3 && name.length() <= 50){
            return name;
        } else{
            return "";
        }
    }

    public String brandValidator(Scanner input){
        String brand = input.nextLine();
        if(brand.length() >= 3 && brand.length() <= 30){
            return brand;
        } else{
            return "";
        }
    }    

}
