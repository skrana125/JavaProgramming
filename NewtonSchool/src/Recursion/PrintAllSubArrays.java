/*
  Printing all the subArrays from an Arrays....
  time complexity from this method is O(n^3)
*/
package Recursion;

import java.util.Scanner;

public class PrintAllSubArrays
{
    static int subArrays(int [] arr, int n)
    {
        //to take from the stating point
        for (int i=0;i<n;i++)
        {
            //to take from the end point
            for (int j=i;j<n;j++)
            {
                //printing the subArrays between start and end point from array
                for (int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println(subArrays(arr,n));
    }
}
