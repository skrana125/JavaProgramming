/*
Problem Statement
Your friend and you took a true/false exam of n questions. You know your answers, your friend’s
answers, and that your friend got k questions correct.
Compute the maximum number of questions you could have gotten correctly.
Input
The first line of input contains a single integer k.
The second line contains a string of n (1 ≤ n ≤ 1000) characters, the answers you wrote down.
Each letter is either a ‘T’ or an ‘F’.
The third line contains a string of n characters, the answers your friend wrote down. Each letter
is either a ‘T’ or an ‘F’.
The input will satisfy 0 ≤ k ≤ n.
Output
Print, on one line, the maximum number of questions you could have gotten correctly.
Example
Sample Input
3
FTFFF
IFTTT

Sample Output
2
*/
package Contest.easyPeasy;

import java.util.Scanner;

public class ExamContest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Question got Corrected : ");
        int k = sc.nextInt();
        System.out.println("Answer Written down by First Person : ");
        String f = sc.next();
        System.out.println("Answer Written down by Second Person :");
        String s = sc.next();

        int myself = 0, friend = 0;
        for (int i=0;i<f.length();i++)
        {
            if(f.charAt(i) != s.charAt(i))
                myself++;
            else
                friend++;
        }
        if(k == friend)
            System.out.println("total number of question corrected : "+f.length());
        else if(friend > k)
            System.out.println("Total Answer is Correct :"+(k+myself));
        else
            System.out.println("Total Answer is Correct : "+(friend+(myself-(k-friend))));
    }
}
