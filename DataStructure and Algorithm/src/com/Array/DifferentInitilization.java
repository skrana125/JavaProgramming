//Here we try to different type of initialization of an array
package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DifferentInitilization
{
    static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args)
    {
        int arr[] = new int[4];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
      /*  arr[4] = 500;  //After removing the comment over here it'll give the ArrayIndexOutOfBondsException
                        //because We already initialize the value of an array 4
        arr[5] = 600;*/
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Element at index ["+i+"] is :"+arr[i]);
        }

        //By Using For-each loop
        String fruits [] = new String[4];
        fruits[0] = "Apple";
        fruits[1] = "Orange";
        fruits[2] = "Guava";
        fruits[3] = "Pears";
        for (String str:fruits
             ) {
            System.out.println(str);
        }

        //By using List
        String [] arrayList = {"Apple","Google", "Microsoft","Facebook", "Twitter"};
        System.out.println(Arrays.asList(arrayList));
    }
}
