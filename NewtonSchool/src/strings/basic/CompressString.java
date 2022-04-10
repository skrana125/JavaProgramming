/*
Compress String
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Groot wants to send a message to Rocket. To make his message look interesting he thought he would compress his message.
He decides to do so by replacing consecutive duplicate occurrences with the count of repetitions.
Help Groot by writing a program to automatically convert his message.
We are given a string. Your task is to compress the consecutive letters of the string

For example: given string is "AAACCCBBD", thus here
A's occurrence 3 times
C's occurrence 3 times
B's occurrence 2 times
D's occurrence 1 time
So after compressing string becomes "A3C3B2D1".
Input
The first line of input contains an integer T denoting the number of test cases.
Each test case will have a string provided in the new line.

Constraints:
1 <= T <= 10
1 <= sizeof(String) <= 10^6
All characters of String are upper case letters. (A-Z)

Sum of size of Strings over all testcases is <= 10^6
Output
For each testcase, in a new line, print the compressed string for each test case in a new line.
Example
Input:
2
AAACCCBBD
ABCD

Output:
A3C3B2D1
A1B1C1D1*/
package strings.basic;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("TestCase : ");
        int t = sc.nextInt();

        while (t>0)
        {
            System.out.println("String : ");
            String str = sc.next();

            compressString(str);
        }
    }

    private static void compressString(String str) {
        int count = 1;
        
    }
}
