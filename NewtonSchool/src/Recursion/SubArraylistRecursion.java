/*
Printing all the subArrays using Recursion.
Time complexity from this is O(n^2)
*/
package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class SubArraylistRecursion
{
    static Scanner scanner = new Scanner(System.in);
    static int [] arr = new int[100000];

    static void subArrayPrint(int n)
    {
        System.out.println("Enter the elements of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        // no of sequence is 2*n-1
        int size = (int) Math.pow(2,n);

        // run counter from 0 to 1 or 111....1
        for (int i=1;i<size;i++)
        {
            for (int j=0;j<n;j++)
            {
                //check if the jth element is set or not and If then store in the Array
                if(BigInteger.valueOf(i).testBit(j))
                {
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();
        subArrayPrint(n);
    }
}
