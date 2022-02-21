import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class SocksPair
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        int count = 0, pair = 0;

        int[] ar = new int[n];
        System.out.print("Elements of an array : ");
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        System.out.print("\nArray before sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        Arrays.sort(ar);
        System.out.print("\nArray after sorting : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        int j=0;
        while (j<n-1)
        {
            if(ar[j]==ar[j+1])
            {
                count+=1;
                j+=2;
            }
            else
            {
                j+=1;
            }
        }
        System.out.println("\nNo of Pairs is: "+count);
    }
}
