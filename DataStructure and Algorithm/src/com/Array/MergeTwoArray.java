package com.Array;

import java.util.Scanner;

public class MergeTwoArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length First Array length : ");
        int n = sc.nextInt();
        System.out.println("Element of an Array A is : ");
        int [] a = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the length of second Array Length : ");
        int m = sc.nextInt();
        System.out.println("Elements of Array B is : ");
        int [] b = new int[m];
        for (int i=0;i<m;i++)
        {
            b[i] = sc.nextInt();
        }

        int k =  m+n;
        int [] c = new int[k];

        //for the last element of an array

        for (int i=0;i<n;i++)
        {
            c[i] =a[i];
        }
        for (int j=0;j<m;j++)
        {
            c[n+j] = b[j];
        }

        System.out.println("Merged Array : ");
        for (int i=0;i<k;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
