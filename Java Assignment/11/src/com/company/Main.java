package com.company;

public class Main {

    public static void main(String[] args) {

              int [] arr = new int [] {9,25,3,-5,-10,58,601,-560};

                int min = arr[0];

               for (int i = 0; i < arr.length; i++) {

                   if(arr[i] <min)
                       min = arr[i];
                }
                System.out.println("Smallest element present in given array: " + min);
            }
        }