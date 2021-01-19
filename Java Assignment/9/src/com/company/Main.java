package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to THE showroom");
        System.out.println("Please select car:");
        System.out.println("1. Mehran");
        System.out.println("2. WagonR");
        System.out.println("3. Swift");
        System.out.println("4. Honda City");

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your choice : ");
        int carPrice;
        carPrice=input.nextInt();

        switch (carPrice){
            case 1:
                System.out.println("You need to pay Rs. 1000,000,");
                break;
            case 2:
                System.out.println("You need to pay Rs. 2000,000,");
                break;
            case 3:
                System.out.println("You need to pay Rs. 2,500,000,");
                break;
            case 4:
                System.out.println("You need to pay Rs. 3,5000,000,");
                break;
        }

    }
}
    

