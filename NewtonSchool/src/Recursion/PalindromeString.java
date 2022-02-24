/* A string is palindrome String when it reverse it's will be same
* i.e. aba = aba */
package Recursion;

import java.util.Scanner;

public class PalindromeString
{
    static boolean check_palindrome(String str, int s, int e)
    {
        //check for first character if there is only one character
        if(s==e)
            return true;

        //check if last character and first character are equal or not
        if(str.charAt(s)!=str.charAt(e))
            return false;

        //check if there is more than two character that middle character is palindrome or not
        if(s<e+1)
            return check_palindrome(str,s+1,e-1);

        return true;
    }
    static boolean isPalindrome(String ss)
    {
        int n = ss.length();
        if(n==0)
            return true;
        return check_palindrome(ss,0,n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of testCase : ");
        int t = scanner.nextInt();
        for (int i=1; i<=t;i++)
        {
            System.out.println("Enter the string of your choice :");
            String str = scanner.next();

            if(isPalindrome(str))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
