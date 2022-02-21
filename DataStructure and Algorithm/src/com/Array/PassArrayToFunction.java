package com.Array;

import java.util.Scanner;

class PassArrayToFunction
{
    static void funArray(int []arr, int n)
    {
        int sum = 0;
        for (int i=0;i<n;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("Sum of element of an Array is :"+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        int len;
        System.out.println("Enter length of na Array : ");
        len = sc.nextInt();
        System.out.println("Enter element of an Array : ");
        for(int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }

        funArray(arr,len);
    }

}
