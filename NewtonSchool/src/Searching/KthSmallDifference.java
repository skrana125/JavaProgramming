package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallDifference
{
    //return the pairs
    static int countPairs(int [] arr, int n, int mid)
    {
        int res = 0;
        for(int i=0;i<n;i++)
        {
            // Upper bound returns pointer to position
            // of next higher number than a[i]+mid in
            // a[i..n-1]. We subtract (ub + i + 1) from
            // this position to count
            if(arr[i]+mid>arr[n-1])
            {
                res += (n-(i+1));
            }
            else
            {
                int upper = upperBond(arr, n,arr[i]+mid);
                res += (upper-(i+1));
            }
        }
        return res;
    }

    static int upperBond(int [] arr, int n, int value)
    {
        int low = 0;
        int high = n;
        while(low<high)
        {
            int mid = (low+high)/2;
            if(value>=arr[mid])
            {
                low  =mid+1;
            }
            else
            {
                high = mid;
            }
        }
        return low;
    }
    static int kthMinValue(int [] arr, int n, int k)
    {
        int low = arr[1]-arr[0]; // minimum absolute difference
        int high = arr[n-1]-arr[0]; // maximum absolute difference

        Arrays.sort(arr);

        for(int i =0;i<=n-2;i++)
        {
            low = Math.min(low,arr[i+1]-arr[i]);
        }

        //doing binary search for kth absolute difference
        while (low<high)
        {
            int mid = low+(low+high)/2;
            if(countPairs(arr,n,mid)<k)
            {
                low = mid+1;
            }
            else
            {
                high = mid - 1;
            }
        }

       return low;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of testCase you want : ");
        int t = scanner.nextInt();

        for(int i =1;i<=t;i++)
        {
            System.out.println("Enter the length of an array : ");
            int n = scanner.nextInt();
            System.out.println("Enter the value of k : ");
            int k = scanner.nextInt();
            int [] arr = new int[n];

            System.out.println("Enter the element of an array : ");
            for(int j=0;j<n;j++)
            {
                arr[j] = scanner.nextInt();
            }
            System.out.println("Kth Absolute difference between number is "+kthMinValue(arr,n,k));
        }
    }
}
