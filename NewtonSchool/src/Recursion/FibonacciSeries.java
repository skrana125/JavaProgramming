package Recursion;

import java.util.Scanner;

public class FibonacciSeries
{
    static int Fibonacci(long n)
    {
        if(n<=1)
            return (int) n;

        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of testCase : ");
        int t = scanner.nextInt();
        for (int i=1;i<=t;i++)
        {
            System.out.println("Enter value of n:");
            long n = scanner.nextLong();

            int result = Fibonacci(n);
            System.out.println("Fibonacci series is : "+result);
        }
    }
}
