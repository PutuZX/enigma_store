package com.enigma.enigmaStore.view;

import java.util.Scanner;

import com.enigma.enigmaStore.controller.Service;
import com.enigma.enigmaStore.util.Validator;

public class UI {
    Scanner input = new Scanner(System.in);
    public void menu(){
        Service service = new Service();
        Validator validator = new Validator();
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
            System.out.println(getInvalidService());
        } else{
            service.serviceController(inputValue);
        }
    }

    public void addProductUI(){
        Service service = new Service();
        Validator validator = new Validator();
        String tempName = "";
        String tempBrand = "";
        double tempPrice = 0;
        System.out.println("\n--------------------------");
        System.out.println("Add Product Page");
        System.out.println("--------------------------");
        System.out.print("Masukan nama product: ");
        tempName = validator.nameValidator(input);
        System.out.print("Masukan brand product: ");
        tempBrand = validator.brandValidator(input);
        System.out.print("Masukan harga product: ");
        tempPrice = validator.priceValidator(input);
        service.addProduct(tempName, tempBrand, tempPrice);
    }

    public void updateProductUI(){
        System.out.println("This is update product page");
    }

    public void findProductUI(){
        System.out.println("This is find product page");
    }

    public void viewProductUI(){
        System.out.println("This is view product page");
    }

    public void removeProductUI(){
        System.out.println("This is remove product page");
    }

    public String getQuit(){
        return "\nThank you for using our service!";
    }

    public String getInvalidService(){
        return "\nService not found!";
    }

    public String getInvalidInput(){
        return "\nInvalid Input";
    }
}
