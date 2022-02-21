package com.Array;

import java.util.Scanner;

public class InitilizeArray
{
  static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int max;
        int arr [] = new int[100] ;  // Initialize the array  of size of the maximum
        char [] msg = {'S','M','I','L','E'}; // Initialize the array of character
        String text = "Message of the day is : ";

        String str = String.valueOf(msg); //It returns the value of the msg as String
        System.out.println(text+""+str); // Here it's concatenate the both of the value
        System.out.println("Enter the Maximum value  of an array element :");
        max = sc.nextInt();

        System.out.println("Enter the element of an array");
        for(int i=0;i<max;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<max;i++)
        {
            System.out.println("Element at ["+i+"] is : "+arr[i]);
        }

    }
}
