/*Problem Statement
Given an array of integers of size N, your task is to find the maximum j - i,
 such that Arr[j] > Arr[i] where 0 < = i < j < = N-1.
Input
First line of contains a single integer N, next line contains N space separated integers depicting the values of array.
Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 100000
Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
Example
Sample Input:-
5
1 2 3 4 5
Sample Output:-
4

Sample Input:-
5
5 4 3 2 1
Sample Output:-
-1
*/

package Sorting;

import java.util.Scanner;

public class MaximumDiffArray
{

    public static int diffArray(int [] arr)
    {
        int ans = -1;
        int diff = arr[0];

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<diff)
                diff = arr[i];

            ans = Math.max(ans,arr[i]-diff);
        }
        if(ans == 0)
            return -1;
        else
            return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array :");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of an Array :");
        int [] arr = new int[n];

        for(int i=0 ; i<n ;i++)
        {
            arr[i] = scanner.nextInt();
        }

        int result =  diffArray(arr);
        System.out.println(result);
    }
}
