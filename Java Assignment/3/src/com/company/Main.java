package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i, factorial=1, number;
        System.out.println("Enter the number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        for(i = 1; i<=number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of the given number is:: "+factorial);
    }
}
