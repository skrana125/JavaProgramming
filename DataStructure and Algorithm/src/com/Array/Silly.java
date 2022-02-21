package com.Array;

import java.util.Scanner;

public class Silly
{
    static Scanner cs = new Scanner(System.in);

    public static int SillyNumber(int N)
    {
        int sum = 0;
        for(int i=1;i<N;i++)
        {
            sum = sum+(i*i);
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the value of N :");
        int N = cs.nextInt();
        System.out.println(SillyNumber(N));
    }
}
