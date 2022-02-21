package oneDArrayMaths;

import java.util.Scanner;

public class MaxNumbers
{
    static void maxDigit(int [] arr, int n)
    {
        int first ,second, third;
        first = second = third = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>first)
            {
                third = second;
                second= first;
                first = arr[i];
            }
            else  if(arr[i]>second)
            {
                third = second;
                second = arr[i];
            }
            else
            {
                third = arr[i];
            }
        }
        System.out.println(first+" "+second+" "+third+"\n");
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of TestCase you like : ");
        int t = scanner.nextInt();
        int [] arr =  new int[10000];
        for(int i = 1;i<=t;i++)
        {
            int n = scanner.nextInt();
            for(int j=0;j<n;j++)
            {
                arr[j] = scanner.nextInt();
            }
            maxDigit(arr, n);
        }
    }
}
