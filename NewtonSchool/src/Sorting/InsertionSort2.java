package Sorting;

import java.util.Scanner;

public class InsertionSort2
{
    static void insertion(int [] arr, int n)
    {
        int j = 0, min;
        for(int i=1;i<n;i++)
        {

            min = arr[i];
                j = i-1;
                while (j>=0 && arr[j]>min)
                {
                    arr[j+1] = arr[j];
                    j = j-1;
                }
            arr[i+1] = min;
        }
        System.out.println("Sorted Array : ");
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of an Array : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Elements of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        insertion(arr,n);
    }
}
