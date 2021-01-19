package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int side, i, j;
        Scanner input= new Scanner(System.in);

        System.out.print(" Please Enter any Value : ");
        side = input.nextInt();

        for(i = 0; i < side; i++)
        {
            for(j = 0; j < side; j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

}



