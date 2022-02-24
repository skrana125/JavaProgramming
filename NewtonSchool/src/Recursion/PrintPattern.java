package Recursion;

import java.util.Scanner;

public class PrintPattern
{
    static void printPattern(int n, int curr, boolean flag)
    {
        System.out.println(curr+" ");

        if(flag==false && n == curr)
            return;

        if(flag)
        {
            if(curr-5>0)
                printPattern(n,curr-5,true);
            else
                printPattern(n,curr-5,false);
        }
        else
            printPattern(n,curr+5,false);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= scanner.nextInt();
        printPattern(n,n,true);
    }
}
