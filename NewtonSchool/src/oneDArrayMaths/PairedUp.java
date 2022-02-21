package oneDArrayMaths;

import java.util.Arrays;
import java.util.Scanner;

public class PairedUp
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        int [] ar = new int[10000];
        if(n%2==0)
        {
            System.out.println("Enter the element of an array : ");
            for(int i = 0;i<n;i++)
            {
                ar[i] = scanner.nextInt();
            }
            Arrays.sort(ar);
        }
    }
}
