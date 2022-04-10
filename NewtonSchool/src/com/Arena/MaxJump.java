package com.Arena;

import java.util.Scanner;

public class MaxJump
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Elements of an array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int maxJump = 0;
        int jumps = 0;

        for(int i=0;i<n;i++)
        {
           int startBuilding = arr[i];
        }
        System.out.println("Maximum number of Jump is : "+jumps);
    }
}
