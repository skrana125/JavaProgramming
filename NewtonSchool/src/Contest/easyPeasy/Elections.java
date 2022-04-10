/*
Problem Statement
The United States is organizing the presidential election. The number of votes a candidate gets is his/her score.
All candidates had distinct scores, which are non-negative integers.

You know N facts on the candidates' scores. The i-th fact is as follows:
the Ai-th the highest score among the candidates is Bi.

Find the maximum possible number of candidates in the election.
Input
First line of input contains a single integer N, the next N lines contain two space-separated
integers depicting values A[i] and B[i].

Constraints:-
1 <= N <= 105
1 <= Ai <= 109
0 <= Bi <= 109

Note:- There exists a possible outcome of the election that is consistent with the given facts.
Output
Print the maximum possible number of candidates in the election.
Example
Sample Input:-
3
4 7
2 9
6 2

Sample Output:-
8

Explanation:-
The maximum possible number of candidates is achieved when candidates have the following scores:
12, 9, 8, 7, 5, 2, 1, 0.
*/
package Contest.easyPeasy;

import java.util.Scanner;

public class Elections
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total number od People : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        int [] brr = new int[n];

        System.out.println("Elements of an  Arrays :");
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            brr[i] = sc.nextInt();
        }

        int max = arr[0];
        int index = -1;

        for (int i=0;i<n;i++)
        {
            if(max < arr[i])
                max = arr[i];
            index = i;
        }
        System.out.println("Maximum possible Candidate in election is : "+(max+brr[index]));
    }
}
