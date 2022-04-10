/*
Is product 4 divisible? (Contest)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are N integers A[1], A[2],. , A[N]. You need to find whether their product is divisible by 4.
Input
The first line of input contains a single integer N.
The next line contains N singly spaced integers, A[1], A[2],. , A[N].

Constraints
1 <= N <= 10
1 <= A[i] <= 1000000000
Output
Output "YES" if the product is divisible by 4, else output "NO". (without quotes)
Example
Sample Input
5
3 5 2 5 1

Sample Output
NO

Explanation: Product = 150 and 150 is not divisible by 4.

Sample Input
4
1 3 8 2

Sample Output
YES

Explanation: Product = 48 and 48 is divisible by 4.
*/
package Contest.weeknedContest;

import java.util.Scanner;

public class IsProduct_4_Divisible
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();

        System.out.println("N integers : ");
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int product = 1;
        for (int i=0;i<n;i++)
        {
            product = product * arr[i];
        }
        if(product % 4 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
