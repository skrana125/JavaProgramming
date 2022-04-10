/*
Sum(Large)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers a and b your task is to print the summation of these two numbers
Input:
Input contains a single line containing two space separated integers a and b.

Constraints:-
1 <= a, b <= 1020000
Output
Print the sum of a and b.
Example
Sample Input:-
3 8

Sample Output:-
11

Sample Input:-
15 1

Sample Output:-
16
*/
package strings;

import java.util.Scanner;

public class LargeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        addingTwoNumber(str1, str2);
    }

    public static void addingTwoNumber(String s1, String s2)
    {
        int n1 = s1.length();
        int n2 = s2.length();

        //checking s2 is less than or greater than s1. if less than s1 then we swap the value
        if(n1 > n2)
        {
            String temp  = s1;
            s1 = s2;
            s2 = temp;
        }

        StringBuilder result = new StringBuilder();

        //reverse the String
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();

        int count = 0;
        for (int i=0;i<n1;i++)
        {
            // s1.charAt(i)-'0' means character start from upto the number
            int sum = (s1.charAt(i) - '0') + (s2.charAt(i) - '0') + count;
            result.append((char) (sum % 10 + '0'));
            count = sum / 10;
        }

        for (int i=n1;i<n2;i++)
        {
            int sum = (int)(s2.charAt(i))+count;
            result.append((char) (sum % 10 + '0'));
            count = sum / 10;
        }

        if(count > 0){
            result.append((char) (count + '0'));
        }
        result = new StringBuilder(new StringBuilder(result.toString()).reverse().toString());
        System.out.println("Result : "+result);
    }
}
