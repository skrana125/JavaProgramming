package com.advanceDsa.heapSort;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumChoco
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        maxCh(arr, n, k);
    }

    public static void maxCh(int [] arr,int n , int k)
    {
        int p = 1000000007;
        if(k < 1 || n < 1)
            return;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<n;i++)
        {
            maxHeap.add(arr[i]);
        }

        int ans = 0;
        while (k != 0 && maxHeap.peek() != 0)
        {
            int remove = maxHeap.remove();
            ans =(ans + remove)% p;
            maxHeap.add(remove/2);
            k--;
        }

        System.out.println("Maximum Chocolate is :"+ans);
    }
}
