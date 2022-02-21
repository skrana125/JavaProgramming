package newtonDsa1;

import java.util.Scanner;

public class SumProduct
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = scanner.nextInt();
        int [] ar = new int[n];
        int sum=0, product=1;

        System.out.print("Enter the element of an array : ");
        for(int i=0;i<n;i++)
        {
            ar[i]= scanner.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sum+=ar[i];
            }
            else
            {
                product = product*ar[i];
            }
        }
        System.out.println(sum+" "+product);
    }
}
