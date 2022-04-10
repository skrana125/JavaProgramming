package strings;

import java.util.Scanner;

public class Anagrams2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first String :");
        String string1 = scanner.next();

        System.out.println("Enter second String :");
        String string2 = scanner.next();

        final int ch = 26;

        int [] arr = new int[ch];

        for (int i=0;i<string1.length();i++)
        {
            arr[string1.charAt(i)-'a']++;
        }

        for (int i=0;i<string2.length();i++)
        {
            arr[string2.charAt(i)-'a']--;
        }

        int ans = 0;
        for (int i =0;i<ch;i++)
        {
            ans += Math.abs(arr[i]);
        }
        System.out.println("Maximum deletion is :"+ans);
    }
}
