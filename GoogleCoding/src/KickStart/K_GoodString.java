package KickStart;

import java.util.Locale;
import java.util.Scanner;

public class K_GoodString
{
    static int goodString(String s, int n, int k)
    {
        int count = 0;
        char [] ch = new char[n];

        for(int c = 0;c<n;c++)
        {
            if(Character.isLowerCase(s.charAt(c)))
            {
                s = s.toUpperCase();
            }
            ch[c] = s.charAt(c);
            System.out.println("Character : "+ch);
        }
        System.out.println("Upper Case : "+s);
        for (int i=0;i<n/2;i++)
        {
            if(ch[i]!=ch[n-i-1])
            {
                count++;
            }
        }
        return (Math.abs(k-count));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of test Cases : ");
        int t = scanner.nextInt();
        for (int i=1;i<=t;i++)
        {
            System.out.println("Enter length of A String");
            int n = scanner.nextInt();
            System.out.println("Goodness Score which is equal to k : ");
            int k = scanner.nextInt();
            System.out.println("Enter a String");
            String str = scanner.next();

            System.out.println("Case #"+i+": "+goodString(str, n, k));
        }
    }
}
