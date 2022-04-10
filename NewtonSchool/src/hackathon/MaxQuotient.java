/*
Max Quotient (Contest)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of N integers. Your teacher has asked you to find the maximum quotient of the array.
Quotient of an array A of size N can be calculated in the following way:
1) Let the sum of the N elements of array A be X.
2) Let pre[] be another array of size N in which for every index i (1 <= i <= N),
prei gives us the sum of elements A1 + A2 +. . + Ai.
3) Quotient of the array A will be equal to the summation of the floored value of X/prei over every value of i
from 1 to N.

You can swap any two elements of the array A. FInd the maximum possible quotient of array A.
Input
First line of the input contains a single integer N.
The second line contains N space seperated integers Ai

Constraints:
1 <= N <= 105
1 <= Ai <= 108
Output
Print the maximum possible quotient of array A.
Example
Sample Input:
3
1 1 3

Sample Output:
8

Explanation:
Array pre[] = [1, 2, 5]
Sum X of array A = 5
Quotient of array A = 5/1 + 5/2 + 5/5 = 5 + 2 + 1 = 8
It can be proved that there is no greater quotient of array A possible.
*/
package hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class MaxQuotient
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        int [] arr = new int[n];

        int sum = 0;
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0;i<n;i++)
        {
            sum += arr[i];
            arr[i] = sum;
        }

        int remainder = 0;
        for (int i=0;i<n;i++)
        {
            remainder += (sum/arr[i]);
        }
        System.out.println(remainder);
    }
}
