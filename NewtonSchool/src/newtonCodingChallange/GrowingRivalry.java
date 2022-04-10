package newtonCodingChallange;

import java.util.Scanner;

public class GrowingRivalry
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length if string");
        int n = sc.nextInt();

        System.out.println("String is :");
        String str = sc.next();

        int nCount = 0, tCount = 0;
        char [] ch = new char[n];
       for (int i=0;i<n-1;i++)
       {
          ch[i] = str.charAt(i);
          if(ch[i] == ch[i+1])
              nCount++;
          else
              tCount++;
       }
        if(nCount > tCount)
            System.out.println("Nutun");
        else
            System.out.println("Tusla");
    }
}
