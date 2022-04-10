package com.Arena;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementAtTheEnd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Test Case: ");
        int t = sc.nextInt();
       while (t>0){
            System.out.println("Enter length of an Array: ");
            int n = sc.nextInt();
            System.out.println("Enter Element to be Added: ");
            int ele = sc.nextInt();

            int [] arr= new int[n];
            System.out.println("Enter an Array : ");
            for (int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            int [] newArr = Arrays.copyOf(arr,arr.length+1);
            newArr[arr.length] = ele;
            for (int i=0;i< newArr.length;i++)
            {
                System.out.print(newArr[i]+" ");
            }
           System.out.println();
            t--;
        }
    }
}
