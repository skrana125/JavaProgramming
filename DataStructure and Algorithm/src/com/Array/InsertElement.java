// Insert element at given position in an array
package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement
{
    static int len, pos, num;
    static int [] arr = new int[100];
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the length of an array :");
        len = sc.nextInt();
        System.out.println("Enter the array element :");
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to insert : ");
        num = sc.nextInt();
        System.out.println("Enter the position of an you want to insert : ");
        pos  = sc.nextInt();
        for (int i=0;i<len;i++)
        {
            arr[i+1] = arr[i];
        }
        System.out.println("Element of Array is : ");
        for (int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }

        arr[pos] = num;
        if(pos>len)
        {
            System.out.println("Insertion outside the array :");
        }
        len++;

        System.out.println("New Array is : ");
        for (int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
