package Recursion;

import java.util.Scanner;

public class Factorial
{
    static int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  value of n : ");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
