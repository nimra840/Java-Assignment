package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int [] {5,20,6,85,9,10};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
