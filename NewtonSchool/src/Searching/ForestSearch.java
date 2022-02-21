package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class ForestSearch
{
    static int woodCollected(int [] height, int n, int X)
    {
        int sum = 0;
        for (int i=0;i<n;i++)
        {
            if(height[i]-X>=0)
            {
                sum += height[i]-X;
            }
        }
        return sum;
    }
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of trees in forest : ");
        int n = scanner.nextInt();
        System.out.println("Point of from where tree cut : ");
        int k = scanner.nextInt();
        int [] height = new int[n];
        System.out.println("Enter the height of each tree : ");
        for (int i=0;i<n;i++)
        {
            height[i] = scanner.nextInt();
        }
        Arrays.sort(height);
        int low = height[0], high = height[n-1];

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(woodCollected(height,n,mid)==k)
            {
                System.out.println(mid);
            }
            else if(woodCollected(height,n,mid)>k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        System.out.println(woodCollected(height, n, k));
    }
}
