/*
Given a number N, your task is to convert the number into a single digit by repeatedly replacing
the number N with its sum of digits until the number becomes a single digit.
for example if N = 987
then 9+8+7 = 24
then 2+4 = 6, So final output is 6

*/
package Recursion;

import java.util.Scanner;

public class SingleDigit
{
    static void single(int n)
    {
        int sum = 0;
        if(n<10)
        {
            System.out.println(n);
        }
        else
        {
            while (n>0 || sum>9)
            {
                if(n==0)
                {
                    n = sum;
                    sum = 0;
                }
                sum += n%10;
                n = n/10;
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        single(n);
    }
}
