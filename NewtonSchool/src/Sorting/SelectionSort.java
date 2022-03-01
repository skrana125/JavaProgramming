/*In selection sort
* we consider the first element as minimum and then compare the with next element
* if the next element is smaller we swap the value of it.
* the Time Complexity of Selection sort is O(n^2)
* */
package Sorting;

import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of an array : ");
        int n = scanner.nextInt();
        int [] arr = new  int[n];
        System.out.println("Enter the elements of an array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        for (int i=0;i<n-1;i++)
        {
            int min = i; // that is current index with it's minimum value
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted Array is : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
