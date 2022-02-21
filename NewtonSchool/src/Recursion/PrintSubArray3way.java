package Recursion;

import java.util.Scanner;

public class PrintSubArray3way
{
    static void printSubArray(int [] arr, int n,int start, int end)
    {
        if(end==n)
        {
            System.out.println();
        }
        else if (start>end)
        {
            printSubArray(arr,n,0,end+1);
        }
        else
        {
            System.out.print("[");
            for (int i=start;i<end;i++)
            {
                System.out.print(arr[i]+", ");
            }
            System.out.println(arr[end]+"]");
            printSubArray(arr,n,start+1,end);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of an array : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        printSubArray(arr,n,0,0);
    }
}
