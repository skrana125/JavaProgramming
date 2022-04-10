package com.advanceDsa.heapSort;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of test cases :");
        int t = sc.nextInt();
        for (int i=1;i<=t;i++)
        {
            System.out.println("Length of an Array :");
            int n = sc.nextInt();
            System.out.println("Position for k the largest element");
            int k = sc.nextInt();
            PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int j =0;j<n;j++)
            {
                maxHeap.add(sc.nextInt());
            }
            System.out.println(kthLargestElement(maxHeap, k));
        }
    }
    private static int kthLargestElement(PriorityQueue<Integer>maxHeap, int k)
    {
        for (int i=0;i<k-1;i++)
        {
            maxHeap.poll();
        }
        return maxHeap.poll();
    }
}
