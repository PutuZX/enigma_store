package com.enigma.enigmaStore.view;

import java.util.Scanner;

import com.enigma.enigmaStore.controller.Service;
import com.enigma.enigmaStore.util.Validator;

public class UI {
    public void menu(){
        Service service = new Service();
        Validator validator = new Validator();
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Main Menu");
        System.out.println("--------------------------");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Ubah Produk");
        System.out.println("3. Hapus Produk");
        System.out.println("4. Lihat Semua Produk");
        System.out.println("5. Cari Produk Berdasarkan");
        System.out.println("6. Keluar");
        System.out.print("Masukan pilihan menu (1-6): ");
        int inputValue = validator.menuValidator(input);
        if(inputValue == 0){
            System.out.println("Invalid Input");
        } else{
            service.serviceController(inputValue);
        }
    }
}
