package com.advanceDsa.heapSort;

import java.util.Scanner;

public class HeapSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,9,2,8,5,6,3,4,7};
        int n = arr.length;

        heapSort(arr, n);
        sortedArray(arr, 0 , n);
    }

    private static void sortedArray(int[] arr, int x, int j){
        for(int i =x;i<j;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }


    private static void heapSort(int[] arr, int n){
        //create heap
        for(int i = n/2 - 1;i>=0;i--){
            heapify(arr, n ,i); //output
        }
        System.out.println("Heap created from array");
        sortedArray(arr, 0, n);

        for(int i = n-1; i >=0;i--){
            swap(arr, i, 0);
            heapify(arr, i, 0);//output
            System.out.println(i + " elements left unsorted");
            sortedArray(arr, 0, i);
            System.out.println(n-i + " elements sorted");
            sortedArray(arr, i,n);

        }
    }

    private static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void heapify(int[] arr, int n, int i){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            swap(arr, i , largest);
            heapify(arr, n, largest);
        }
    }
}
