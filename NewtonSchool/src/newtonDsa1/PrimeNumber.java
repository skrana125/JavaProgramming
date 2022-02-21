package newtonDsa1;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;

        int sum = 0, prime = 0;
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                System.out.print(i+" ");
                sum = sum+1;
            }
        }
        //System.out.println("Prime numbers from 1 to n are :");
        //2System.out.println(prime);

        System.out.println("\nTotal Prime numbers :"+sum);


    }
}
