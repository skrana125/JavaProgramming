/*
Problem Statement
Find the length of the shortest string that contains "newton" as the subsequence atleast N times.
For eg:- "newtonnn" has three "newton" subsequences.
Input
The first and the only line of input contains the number N.

Constraints
1 <= N <= 10^12
Output
Output a single integer, the length of the shortest string containing "newton" as a substring at least N times.
Example
Sample Input
1
Sample Output
6
Explanation: "newton" is the required string.

Sample Input
3
Sample Output
8
Explanation: "newtonnn" or "nnewtonn" are both two examples of valid strings.
 */
package strings;

import java.util.Scanner;

public class NewtonTask
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length :" );
        int n= scanner.nextInt();
        String str = "newto";
        for(int i =0;i<n;i++)
        {
            String ch = "n";
            str = str+ch;
        }
        System.out.println("New String is :"+str);
        int len = str.length();
        System.out.println("Length of new String is : "+len);
    }
}
