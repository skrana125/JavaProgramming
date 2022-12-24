/*
Problem Statement
A tuple (R, G, B) is considered good if R*G+B <= N and R, G and B are all positive. Given N, find number of good tuples.
Input
Input contains a single integer N.

Constraints:
1 <= N <= 1000000
Output
Print number of good tuples.
Example
Sample Input
3

Sample Output
4

Explanation:
Following are the good tuples:
(1, 1, 1)
(1, 1, 2)
(1, 2, 1)
(2, 1, 1)
*/
package easyPeasyContest;

import java.util.Scanner;

public class RgbContest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;i*j<=n;j++)
            {
                count += (n-i*j);
                System.out.println("("+i+" "+j+" "+count+")");
            }
        }
        System.out.println("Total tuples is :"+count);
    }
}
