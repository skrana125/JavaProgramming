package Searching;

import java.util.Scanner;

public class FloorAndCeil
{
    static int floorCeil(int [] arr, int n, int k)
    {
        int low = 0, high = n-1;
        int floor = 0, ceil = 0;
        while (low<=high)
        {
            int mid = low+(low+high)/2;
            if(arr[mid]==k)
            {
                return arr[mid];
            }
            else if (arr[mid]<k)
            {
                low = mid + 1;
                floor = arr[mid];
            }
            else
            {
                high = mid - 1;
                ceil = arr[mid];
            }
        }
        System.out.println(ceil);
        return floor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of Query : ");
        int q = scanner.nextInt();
        System.out.println("Enter the value of K : ");
        int k = scanner.nextInt();
        System.out.println("Enter the elements of an array : ");
        int [] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println(floorCeil(arr,n,k));
    }
}
