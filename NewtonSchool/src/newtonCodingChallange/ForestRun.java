/*
* Forest Run
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is a forest with N trees lined one after the other with indexes from 0 to N - 1.
The ith tree has a height hi. The monkey starts from tree 0 and his goal is to reach as far as possible but
the max he can go is to tree N - 1. While going from the ith tree to (i+1)th tree (i < N - 1), he can do this following:

1) If the current tree's height is greater than or equal to the next tree's height,
the monkey can simply jump from the current tree to the next without any loss of energy.
2) If the current tree's height is lesser than that of the next, the monkey can either use a branch to simply
swing to the next tree, or he can climb the next tree using hi+1 - hi steps where i < N - 1.

But the monkey is very old and thus gets tired if he uses a lot of energy.
So, he can climb a maximum of K steps and swing a maximum of P times. Find the index of the farthest tree he can reach.
Input
First line contains the integer T(the number of test cases).
Each test case contain 2 lines-
First line contains 3 integers N (the number of trees), K (the maximum number of climbing steps the monkey can take)
and P (the maximum number of times the monkey can swing).
Next line contains N integers h0, h1, ... hN-1, the heights of the trees.

Constraints:
1 <= T <= 10
1 <= N <= 105
1 <= K <= 109
1 <= P <= N
0 <= hi <= 106
Sum of N over all test cases doesn't exceed 105
Output
Print the farthest tree the monkey can reach (0-indexed) if he swings and climbs optimally.
Example
Sample Input:
1
10 10 2
4 9 8 20 5 14 9 15 11 20

Sample Output:
6

Explanation:
While jumping from index 0 to 1, the monkey can use 5 climbing steps. Then from index 1 to 2, he won't have any loss of energy. From index 2 to 3, he can use a swing. Up till now he has used 5 steps and 1 swing which leaves him with 5 steps and 1 swing. Now from index 3 to 4, monkey won't be spending any energy. From index 4 to 5, monkey can use another swing to jump to index 5. And finally from index 5 to 6, there won't be any loss of energy.
It can be shown that monkey cannot go any further than this.
* */
package newtonCodingChallange;

import java.util.Scanner;

public class ForestRun
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of TestCases : ");
        int t = sc.nextInt();

        while (t>0)
        {
            System.out.println("Enter number of trees :");
            int n = sc.nextInt();
            System.out.println("Number od steps Monkey can climb : ");
            int k = sc.nextInt();
            System.out.println("Number of Swing Money can able to do : ");
            int p = sc.nextInt();

            System.out.println("Enter height of each tree in forest : ");
            int [] height = new int[n];
            for (int i=0;i<n;i++)
            {
                height[i] = sc.nextInt();
            }

            farthestTreeReach(height, n, k, p);
            t--;
        }
    }
    public static void farthestTreeReach(int [] height, int n ,int k, int p)
    {
        int steps;
        int swings = 0;
        int index = 0;
        for (int i = 0;i<n-1;i++)
        {
            int kCount = 0, sCount = 0;
            if(height[i+1]>height[i])
            {

            }
            if(kCount<= k || sCount == p)
            {

            }
        }
        
    }
}
