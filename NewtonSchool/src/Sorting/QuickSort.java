package Sorting;

import java.util.Scanner;


public class QuickSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Array to sort : ");
        for (int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        quickSort(arr,n,0,n-1);
        System.out.println("Array After Sorting is : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static int getPartition(int[] arr, int n, int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
      swap(arr, i+1, high);
        return i+1;
    }

    public static void quickSort(int [] arr, int n, int low, int high)
    {
        if(low < high)
        {
            int index = getPartition(arr, n, low, high);
            quickSort(arr,n, low, index-1);
            quickSort(arr, n, index+1, high);
        }
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }
}
