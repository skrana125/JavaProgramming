package com.Array;

import java.util.Scanner;

public class XorSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ;length of an array : ");
        int N = sc.nextInt();
        int [] arr = new int[1000];

        System.out.print("\nEnter the elements of an array : ");
        System.out.println("\n");
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum  = 0;
        for(int i=0;i<N;i++)
        {
            sum = sum+((N-(i+1))^arr[i]);
        }
        System.out.println("\nSum of XOR function is : "+sum);
    }
}
