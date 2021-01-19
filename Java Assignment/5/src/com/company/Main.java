package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any value :");
        int rows=input.nextInt();

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


