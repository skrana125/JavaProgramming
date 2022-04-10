/*Max Happiness (Public Contest: December 2020)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of N integers. You can do an operation on the array:
In one operation, you can select exactly 4 elements from the array, and add the second smallest element of those 4 to your happiness. For example: if you select W, X, Y, Z where W <= X <= Y <= Z, you get X amount of happiness. Remove the 4 elements from the array.

Find the maximum amount of happiness you can get from the array, if you can perform the operations as many times as the constraints permit.

Note: You cannot choose elements if the remaining array size is less than 4.
Input
First line of input contains a single integer N.
Second line of input contains N integers, denoting array Arr.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 1000000000

N is always divisible by 4.
Output
Output the maximum amount of happiness you can get.
Example
Sample Input 1
4
2 1 2 4

Sample Output 1
2

Explanation: We select the values 1 2 2 4 and get second highest happiness which is 2.

Sample Input 2
8
7 3 5 5 2 1 1 7

Sample Output 2
7
*/
package newtonCodingChallange;

import java.util.Arrays;
import java.util.Scanner;

public class MaxHappiness
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int n = sc.nextInt();

        System.out.println("Enter an Array ");
        int [] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int happiness = 0;
        int x = n/4;
        int i =1;
        while (x>0)
        {
            happiness += arr[n-i*3];
            i++;
            x--;
        }
        System.out.println("Max Happiness is : "+happiness);
    }
}
