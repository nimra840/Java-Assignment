package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num=input.nextInt();
        System.out.println("The square of "+ num + " is: "+ (num*num));
    }
}
