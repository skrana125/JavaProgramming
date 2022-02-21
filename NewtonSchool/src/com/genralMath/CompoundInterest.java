package com.genralMath;

import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle        : ");
        int p = sc.nextInt();
        System.out.printf("Enter the Rate of Interest : ");
        int r = sc.nextInt();
        System.out.printf("Enter the Time             : ");
        int t = sc.nextInt();

        double rate = (1+(r/100));
        System.out.println("Rate is:"+rate);
        double n    = t;
        double amount = p*(Math.pow(rate,n));
        System.out.println(String.format("%.2f",amount));
        double compound = amount-p;
        System.out.println(String.format("%.2f",compound));

    }
}
