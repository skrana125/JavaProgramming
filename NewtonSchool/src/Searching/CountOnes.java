package Searching;

import java.util.Scanner;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountOnes {

    static int countOne(int [] arr, int low, int high)
    {
        int mid;
        while(high>=low)
        {
            mid = (low+high)/2;

            if((mid==high || arr[mid+1]==0) && (arr[mid]==1))
                return mid+1;

            if(arr[mid]==1)
                return countOne(arr,(mid+1),high);

            return countOne(arr,low,(mid-1));

        }
        return 0;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of test case : ");
        int t = sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            System.out.println("Enter the number of elements : ");
            int n = sc.nextInt();
            int [] arr = new int[n];
            System.out.println("Enter the elements of an array : ");
            for(int j =0;j<n;j++)
            {
                arr[j] = sc.nextInt();
            }
            System.out.println("Number of 1's in an array are : "+countOne(arr,0,n-1));
        }
    }
}