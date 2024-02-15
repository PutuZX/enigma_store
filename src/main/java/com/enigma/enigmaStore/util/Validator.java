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
}
