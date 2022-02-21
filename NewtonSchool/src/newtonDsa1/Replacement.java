package newtonDsa1;

import java.util.Scanner;

public class Replacement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int n = scanner.nextInt();

        int [] ar = new int[100];
        System.out.print("Enter the elements of an array : ");
        for(int i=0;i<n;i++)
        {
            ar[i] = scanner.nextInt();
        }
        int previous = ar[0];
        if(n<=1)
        {
            System.out.println();
        }
        else
        {
            ar[0] = ar[0]*ar[1];

            for(int i=1;i<n-1;i++)
            {
                int temp = ar[i];
                ar[i] = previous*ar[i+1];
                previous = temp;
            }
            ar[n-1] = previous*ar[n-1];

            System.out.println("New Array is : ");
            for(int i =0;i<n;i++)
            {
                System.out.print(ar[i]+" ");
            }
        }
    }
}
