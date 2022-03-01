/* Given an array of integers  */

import java.util.Scanner;

public class FindMinimumSwap
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of an Array : ");
        int n = scanner.nextInt();
        System.out.println("Find the value of K : ");
        int k = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Elements of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        int ans = minimumSwap(arr, n, k);
        System.out.println("Minimum Swap is : "+ans);
        System.out.println("Array After Swapping : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int minimumSwap(int [] arr, int n, int k)
    {
        int smallToK = 0;
        for (int i=0;i<n;i++)
        {
            if(arr[i]<k) {
                smallToK++;
            }
            System.out.println("Smaller then K is : "+smallToK+" ");
        }
        System.out.println();
        int count = smallToK;
        int minSwap = 0;
        for (int i=smallToK;i<n;i++)
        {
            if(arr[i]>k)
            {
                count--;
            }
            System.out.println("Count is : "+count+" ");
            minSwap = count;
        }
        System.out.println();
        System.out.println();
        return minSwap;
    }
}
