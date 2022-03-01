package Sorting;

import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of an Array : ");
        int n = scanner.nextInt();

        int [] arr =  new  int[n];
        System.out.println("Element of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        for (int i=0;i<n;i++)
        {
            for (int j=1;j<n;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1]   = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array is : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
