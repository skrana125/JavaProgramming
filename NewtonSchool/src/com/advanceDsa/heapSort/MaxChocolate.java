package com.advanceDsa.heapSort;

import java.util.Scanner;

public class MaxChocolate
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Bags are : ");
        int n = sc.nextInt();
        System.out.println("Time allowed to complete the task :");
        int k = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Number of chocolate each bag contains : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        heapSort(arr,n);
        maxChocolate(arr,n,k);
    }

    private static void heapSort(int [] arr, int n)
    {
        for (int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }
    private static void maxChocolate(int [] arr, int n, int k)
    {
        if(k ==0 || n==0)
            return;

        heapSort(arr,n);
        int ans = 0;
        int p = Integer.MAX_VALUE;
        for (int i=0;i<k;i++)
        {
            ans = (ans+arr[0])%p;
            arr[0] /= 2;
            heapify(arr, n, 0);
        }
        System.out.println("Maximum number of chocolate is : "+((int)ans));
    }
    private static void heapify(int [] arr, int n, int i)
    {
        int left = 2*i+1;
        int right= 2*i+2;
        int largest = i;

        if(left < n && arr[left] > arr[largest])
            largest = left;
        if(right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i)
        {
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }
    private static void swap(int [] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]   = arr[start];
    }
}
