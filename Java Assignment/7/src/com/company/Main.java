package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number of star = ");
        int n=scn.nextInt();
        for (int i = 1; i <=n; i=i+1) {
            for (int j = n-i; j >1; j=j-1) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

