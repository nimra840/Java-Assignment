package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = { 56,85,652,125,3,10,265 };

        int length = array.length;

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / length;

        System.out.println("Average of array : "+average);

    }

}
