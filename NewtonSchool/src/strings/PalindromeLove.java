/*
Palindrome Love
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tom loves palindromes. He has the power to convert any ordinary string to a palindrome.
In one move tom can choose a character of a string and change it to any other character.
Given a string, find the minimum number of moves in which tom can change it to a palindrome.
Input
Input consists of a string.
Every character of a string contains lowercase alphabets 'a' to 'z' inclusive.

Constraints
1 <= |s| <= 1000
Output
The minimum number of moves to convert the given string to a palindrome.
Example
Sample input 1
naman

Sample output 1
0

Sample input 2
reorder

Sample output 2
1
 */

package strings;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PalindromeLove
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string :");
        String str = scanner.next();

        String str2 = "";

        int n = str.length();
        char [] ch = str.toCharArray();
        for (int i=0;i<n;i++)
        {
            str2 = str.charAt(i)+str2;
        }
        System.out.println("Reverse Array : "+str2);
        char [] reverse = str2.toCharArray();

        int count = 0;
        for (int i=0;i<n;i++)
        {
            if(ch[i] != reverse[i])
            {
                count++;
            }
        }
        System.out.println("Minimum number of moves is : "+count/2);
    }
}
