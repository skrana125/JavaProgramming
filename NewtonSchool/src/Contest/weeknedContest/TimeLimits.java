/*
Time limits (contest)
Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement
A contest setter wants to determine the time limits for a given problem.
There are n model solutions, and solution k takes tk milliseconds to run on the test data.
The contest setter wants the time limit to be an integer number of seconds,
and wants the time limit to be at least s times larger than the slowest model solution.
Compute the minimum time limit the contest setter can set.

Input
The first line of input contains two space-separated integers n and s (1 ≤ n ≤ 100 and 1 ≤ s ≤ 20).
The second line of input contains n space-separated integers t1, . . . , tn (1 ≤ tk ≤ 2000 for all
k = 1, . . . , n).
Output
Print, on one line, the minimum time limit (in seconds) as a single integer.
Example
sample input
2 5
200 250

sample output
2

Explanation:-
minimum time in millisecond will be 250*5 = 1250ms = 1.25sec
so minimum time in the second will be 2sec

sample input
3 4
47 1032 1107

sample output
5
*/
package Contest.weeknedContest;

import java.util.Scanner;

public class TimeLimits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Model Solutions : ");
        int n = sc.nextInt();
        System.out.println("Time to run data in Milliseconds : ");
        int k = sc.nextInt();

        int [] t = new int[n];
        System.out.println("Time limit of an Integer : ");
        for (int i=0;i<n;i++)
        {
            t[i] = sc.nextInt();
        }
        int max = 0;
        for (int i=0;i<n;i++)
        {
            max = Math.max(max, t[i]);
        }
        System.out.println("Maximum Value : "+max);

        int b = max*k;
        int ans = (max * k) / 1000;
        if (b%1000>0)
            ans++;
        System.out.println("Ans :"+ans);
    }
}
