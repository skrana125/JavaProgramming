package Sorting;

import java.util.Scanner;

public class RecursiveMergeSort
{
    public static int[] implementMergeSort(int [] arr, int start, int end)
    {
        int mid = 0;
        if(start<end)
        {
            mid = start+(end - start)/2;

            implementMergeSort(arr, start, mid);
            implementMergeSort(arr,mid+1,end);

            merge(arr,start,mid,end);
        }
       return arr;
    }

    public static void merge(int [] arr, int start, int mid, int end)
    {
        // initialize the length of two sub array
        int len1 = mid-start+1;
        int len2 = end - mid;

        //initialize the two sub array to store array elements
        int [] p = new int[len1];
        int [] q = new int[len2];

        //storing the first half of the array
        for (int i = 0;i < len1; i++)
            p[i] = arr[start+i];

        // storing the second half of the array
        for (int j = 0; j < len2; j++)
            q[j] = arr[mid+1+j];


        int i = 0, j =0;
        int k = start;

        //after  sorting storing merging the two sub array value into one
        while (i < len1 && j < len2)
        {
            if(p[i] <= q[j])
            {
                arr[k] = p[i];
                i++;
            }
            else
            {
                arr[k] = q[j];
                j++;
            }
            k++;
        }

        // storing the last element of an array
        while (i < len1)
        {
            arr[k] = p[i];
            i++;
            k++;
        }
        while (j < len2)
        {
            arr[k] = q[j];
            j++;
            k++;
        }
    }

    public static void ArrayPrint(int [] arr)
    {
        int n = arr.length;
        for (int i = 0; i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testCase : ");
        int t = sc.nextInt();
        for (int i=1;i<=t;i++)
        {
            System.out.println("Enter length of an array : ");
            int n = sc.nextInt();
            System.out.println("Enter Elements of an Array : ");
            int [] arr = new int[n];

            for (int j =0;j<n;j++)
            {
                arr[j]  = sc.nextInt();
            }
            System.out.println("Given Array :");
            ArrayPrint(arr);

            implementMergeSort(arr,0,n-1);

            System.out.println("Array after Sorting is : ");
            ArrayPrint(arr);
        }
    }
}
