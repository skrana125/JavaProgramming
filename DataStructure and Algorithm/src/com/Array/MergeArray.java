package com.Array;

import java.util.Scanner;

public class MergeArray
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
       int n,temp;
       int [] arr = new int[100];
        System.out.println("Enter the length of an Array: ");
        n = sc.nextInt();
        System.out.println("Elements of an Array is");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {

           }
       }
        System.out.print("Array after sorting is : [");
       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]+" ");
       }
        System.out.print("]");
    }
}
