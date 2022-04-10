/* Problem Statement
Two girls are writing a word each on separate pieces of paper.
The words may or may not hold any meaning and can be of different lengths.
They both are starting to learn about anagrams. An anagram of a string is basically a string which is its permutation.
However, they face a lot of issues in this process.
Your task is to help them find the minimum number of deletions to be made in those words (total count of deletions in both strings)
such that both the words are anagrams of each other.

Input
The first line contains a single string.
The second line contains a single string.

Constraints:
1<= |s1|, |s2|<=10000
It is guaranteed that both the strings consist of lowercase English letters, ascii[a- z].
Output
A single integer denoting the minimum number of deletions to be made in both strings.
Example
Sample Input:-
abc
amnop
Sample Output:-
6
Explanation:-
Common char:- a

Sample input:-
tars
arst
Sample Output:-
0
*/


package strings;

import java.util.Scanner;

public class Anagrams
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        String str1 = sc.next();

        System.out.println("Enter the Second String : ");
        String str2 = sc.next();

        anagrams(str1, str2);
    }

    private static void anagrams(String str1, String str2)
    {

        //creating a hash array for to find occurance of character in both string
        int [] count1 = new int[26];
        int [] count2 = new int[26];

        //count the number of occurance of character   in String str1
        for(int i=0;i<str1.length();i++)
        {
            count1[str1.charAt(i)-'a']++;
        }

        //it's count the number of occurance of character in String str2
        for (int i=0;i<str2.length();i++)
        {
            count2[str2.charAt(i)-'a']++;
        }

        int ans = 0;

        // traversing the count array to remove the unmatched character
        for (int j=0;j<26;j++)
        {
            ans += Math.abs(count1[j]-count2[j]);
        }
        System.out.println("Maximum character to be deleted : "+(ans));
    }
}
