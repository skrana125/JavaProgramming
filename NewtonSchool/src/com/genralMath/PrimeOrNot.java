package com.genralMath;

import java.util.Scanner;

public class PrimeOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test case you want: ");
        int test = sc.nextInt();
        int [] n = new int[test];
        boolean flag = false;
        System.out.println("Enter the number: ");
        for(int i=0;i<test;i++)
        {
            n[i] = sc.nextInt();
        }

        for(int i=0;i<test;i++)
        {
            if(n[i]==1 && n[i]==0)
            {
                System.out.println("NO");
            }
            else
            {
                if(n[i]%i==0)
                {
                    flag = true;
                    break;
                }
            }
        }
        if(!flag)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
