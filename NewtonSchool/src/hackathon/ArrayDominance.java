/*
Array Dominance (Contest)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of N integers. You can arrange the array in any way possible.
You have to find the maximum dominance of the array possible. Dominance of an array A of size N can be defined as:-
Multiply all the integers at even indexes (1- indexed array) with -1.
The sum of all elements of the array now formed is known as its dominance.
Input
First line of the input contains a single integer N.
Second line of the input contains N space separated integers.

Constraints:
1 <= N <= 105
-109 <= Ai <= 109
Output
Print the maximum dominance of the array after you shuffle it optimally.
Example
Sample Input:
6
4 1 5 8 6 2

Sample Output:
12

Explanation:
We arrange the array as follows: [6, 2, 5, 4, 8, 1]
Now dominance = 6 + (-2) + 5 + (-4) + 8 + (-1) = 6 - 2 + 5 - 4 + 8 - 1 = 12
(Integers at even index are multiplied by -1).
It can be proved that no lesser dominance can be arrived at using any kind of arrangement.
*/

package hackathon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ArrayDominance
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Array:");
        int [] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<n;i++)
        {
            pq.add(a[i]);
        }
        int count = 0;
        while (n>=1)
        {
            if(n%2==0)
                count++;

            n--;
        }

        long sum = 0;
        for (int i=1;i<=count;i++)
        {
            long temp = (pq.remove())*-1;
            sum += temp;

        }
        while (!pq.isEmpty())
        {
            sum += pq.remove();

        }
        System.out.println("Total Sum is : "+sum);
    }
}
