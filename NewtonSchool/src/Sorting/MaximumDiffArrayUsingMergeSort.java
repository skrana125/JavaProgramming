package Sorting;

import java.util.Scanner;

public class MaximumDiffArrayUsingMergeSort
{

    public static int maxDiffArray(int [] arr, int n)
    {
        int ans = -1;

        int [] minDiff =  new int[n];
        minDiff[0] = arr[0];
        System.out.println("Minimum value is :");
        for(int i=1;i<n;i++)
        {
            minDiff[i] = Math.min(arr[i],minDiff[i-1]);
            System.out.print(minDiff[i]+" ");
        }

        System.out.println();

        int [] maxDiff = new int[n];
        maxDiff[n-1] = arr[n-1];
        System.out.println("Maximum value is : ");

        for (int i=n-2;i>=0;i--)
        {
            maxDiff[i] = Math.max(arr[i],maxDiff[i+1]);

            System.out.print(maxDiff[i]+" ");
        }
        System.out.println();

        int k = 0, l=0;
        while (k<n && l<n)
        {
            if(minDiff[k]<maxDiff[l])
            {
                ans = Math.max(ans, l-k);
                l = l+1;
            }
            else
            {
                k = k+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the element of an Array :");
        int [] arr = new int[n];

        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int result = maxDiffArray(arr,n);
        System.out.println("Maximum Difference : "+result);
    }
}
