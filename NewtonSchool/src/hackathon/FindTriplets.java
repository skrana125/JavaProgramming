/*
ABC? (Contest)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Currently, Adk is researching on a virus which has conquered the planet.
For killing the virus, three chemicals (A, B, and C) are required in a particular proportion.
Let the quantities of chemicals be a, b, and c respectively.
The virus will be killed if a2+b2+c2=n.
You need to find number of triplets satisfying the condition for all the values of n ranging from 1 to N.
Note: a, b and c must be integers.
Note: Obviously, the amount of chemical cannot be negative.
Input
The first and the only line of input contains an integer N.

Constraints
1 <= N <= 10000
Output:
Output N integers, the number of triplets satisfying the condition for n = 1, 2, 3, ..., N on a new line.
Example
Sample Input
10

Sample Output
3
3
1
3
6
3
0
3
6
6

Explanation
For n=1, triplets are (0, 0, 1), (1, 0, 0), (0, 1, 0)
For n=7, there are no triplets satisfying the condition.
For n=10, triplets are (0, 1, 3), (0, 3, 1), (1, 0, 3), (1, 3, 0), (3, 0, 1), (3, 1, 0).
*/
package hackathon;

import java.util.Scanner;

public class FindTriplets
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n+1];
        for (int i=1;i<=n;i++)
        {
            a[i] = i;
        }

    }
}
