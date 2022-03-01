package Sorting;

import java.util.Scanner;

public class RecursionSelection
{
    static void selectionSort(int [] A, int n)
    {
        for (int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(A[j]<A[min])
                {
                    min = j;
                }
            }
            int temp = A[i];
            A[i]    = A[min];
            A[min]  = temp;
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();
        int [] A = new  int[n];
        System.out.println("Enter the elements of an Array : ");
        for (int i=0;i<n;i++)
        {
            A[i] = scanner.nextInt();
        }
        selectionSort(A,n);
    }
}
