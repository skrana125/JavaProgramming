package strings;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = sc.next();
        int n = str.length();
        String rev = "";
        System.out.println("Reverse String : ");
        for(int i = n-1;i>=0;i--)
        {
            rev = rev+(str.charAt(i));
        }
        System.out.println(rev);
    }
}
