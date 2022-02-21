package oneDArrayMaths;

import java.util.Scanner;

public class NoXor
{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number of element you want : ");
        int n = scanner.nextInt();
        long [] arr =  new long[n];

        long sum = 0;
        System.out.println("Enter the elements of an array : ");
        for(int i =0;i<n;i++)
        {
            arr[i] = scanner.nextLong();
        }
        for(int i =1;i<=n;i++)
        {
            sum += ((n-i)^arr[i-1]);
        }

        System.out.println("Sum of Xor and Array is : "+sum);

    }
}
