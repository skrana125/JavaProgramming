/*
Problem Statement
You are given two integer arrays A and B of sizes N and M respectively.
You need to modify the elements of A so that B becomes its subarray.
Modifying an element means change the element to any other value.

Find the minimum number of modifications to achieve this.
Input
The first line of the input contains two integers N and M.
The second line of the input contains N space separated integers, the elements of array A.
The third line of the input contains M space separated integers, the elements of array B.

Constraints
1 <= M <= N <= 500
1 <= A[i], B[i] <= 10
Output
Output a single integer, the minimum number of modifications in A to make B its subarray.
Example
Sample Input
6 3
3 1 2 1 3 3
1 2 3

Sample Output
1

Explanation: If you modify A[4] from 1 to 3. A[2]. A[4] represents the array B, so B is its subarray.

Sample Input
10 5
3 4 5 3 4 3 1 3 5 2
1 4 4 4 3

Sample Output
3
*/
package Contest.easyPeasy;

import java.util.Scanner;

public class SubArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first Array :");
        int n = sc.nextInt();

        System.out.println("Elements of an Array A : ");
        int [] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the length of second Array :");
        int m = sc.nextInt();

        int [] brr = new int[m];
        System.out.println("Elements of an Array B :");
        for (int i=0;i<m;i++)
        {
            brr[i] = sc.nextInt();
        }

       // for B need to subArray of A, The length of B should be smaller than equal to the length of A.
        if(n>=m)
        {
            // Array to store the temporary variable
            int [] crr = new int[n];

            int ans = Integer.MAX_VALUE;
            // loop until the length of A - length of B
            for (int i=0;i<n-m;i++)
            {
                int k = 0;
                for (int j=i;k<m;j++)
                {
                    crr[k] = arr[j];
                    k++;
                }
                int result = maximumSifting(crr, brr, m);
                if(result < ans)
                   ans = result;
            }
            System.out.println(ans);
        }
        else {
            System.out.println("-1");
        }
    }

    private static int maximumSifting(int[] crr, int[] brr, int m)
    {
        int count = 0;
        for (int i=0;i<m;i++)
        {
            if(crr[i] != brr[i])
                count++;
        }
        return count;
    }
}
