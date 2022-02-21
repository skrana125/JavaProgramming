package Recursion;

import java.util.Scanner;

public class InsertOperator
{
    static int insertOperator(long [] a, long k, int sum) {
        if (sum == a.length)
        {
            if(k==0)
                return 0;
            else
                return 1;
        }
        return insertOperator(a,k-a[sum],sum+1)*insertOperator(a,k+a[sum],sum+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        System.out.println("Enter he value of K : ");
        long k = scanner.nextLong();

        long [] a = new  long[n];
        System.out.println("Enter the array elements : ");
        for (int i=0;i<n;i++)
        {
            a[i] = scanner.nextInt();
        }

        int result = insertOperator(a,k,0);
        if(result == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
