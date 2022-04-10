package com.Arena;

import java.util.Scanner;

public class AddElementInArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Test Case:");
        int t = sc.nextInt();
        while (t>0)
        {
            System.out.println("Length of an Array :");
            int n = sc.nextInt();
            System.out.println("Element to be inserted :");
            int x = sc.nextInt();
            System.out.println("Index where element need to placed :");
            int index = sc.nextInt();

            int [] arr = new int[n];
            System.out.println("Insert element into Array :");
            for (int i=0;i<n;i++)
                arr[i] = sc.nextInt();

            int [] newArr = new int[n+1];
            for (int i =0;i< newArr.length;i++)
            {
                if(i<index -1)
                    newArr[i] = arr[i];
                else if(i == index)
                    newArr[i] = x;
                else
                    newArr[i] = arr[i-1];
            }

            System.out.println("New Array is :");
            for (int i=0;i< newArr.length;i++)
            {
                System.out.print(newArr[i]+" ");
            }
            System.out.println();
            t--;
        }
    }
}
