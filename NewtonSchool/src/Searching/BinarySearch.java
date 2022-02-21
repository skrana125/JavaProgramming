package Searching;

import javax.swing.*;
import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();
        int item, pos = 0, mid;
        int low = 0, high = n-1,flag = 0;

        System.out.println("Enter the element to be search : ");
        item = scanner.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the element of an Array : ");
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            mid = (int) Math.ceil((low+high)/2);
            if(arr[mid]==item)
            {
                pos = mid;
                System.out.println("Item "+item+" found at position "+pos);
                break;
            }
            else if(arr[mid]<item)
            {
                low = mid + 1;
            }
            else
            {
                high = mid -1;
            }
        }
        System.out.println("Item not found");
        
    }
}
