package newtonDsa1;

import java.util.Scanner;

public class ReplacementUsingFunction
{
    static void replaceElement(int[] arr, int n)
    {
        if(n<=1)
        {
            System.out.println();
        }
        else
        {
            int front = arr[0];
            arr[0] = arr[0] * arr[1];

            for(int i=1;i<n-1;i++)
            {
                int temp = arr[i];
                arr[i] = front*arr[i+1];
                front = temp;
            }
            arr[n-1] = front*arr[n-1];

        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();
        int [] arr = new int[100000];

        System.out.println("Enter the elements of an Array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        replaceElement(arr, n);

        for(int i =0 ;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
