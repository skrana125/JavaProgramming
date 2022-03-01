/* Time complexity of Insertion sort is : -
* Best Time complexity is :- */
package Sorting;

import java.util.Scanner;

public class InsertionSort
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];

        System.out.println("Elements of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int j,min;
        for(int i=1;i<n;i++)
        {
            min = arr[i];
            j = i-1;

            while (j>=0 && arr[j]>min)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = min;
        }
        System.out.println("Array after sorting : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
