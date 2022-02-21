package Searching;

import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int pos = -1, item;
        System.out.println("Enter the item you like to search : ");
        item = scanner.nextInt();

        System.out.println("Enter the element of an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();

            if(arr[i]==item)
            {
                pos = i;
                break;
            }
        }
        if(pos>=0)
        {
            System.out.println("Element "+item+" found in position "+pos);
        }
        else
        {
            System.out.println(item +" is not present in an array.");
        }
    }
}
