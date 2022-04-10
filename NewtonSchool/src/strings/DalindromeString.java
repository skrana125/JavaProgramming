package strings;

import java.util.Scanner;

public class DalindromeString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :");
        String str = sc.next();

        String dali = "";
        StringBuffer rev;
        for (int i=0;i<str.length();i++)
        {
            for (int j=i+1;j<str.length();j++)
            {
                dali = str.substring(i,j);

                rev = new StringBuffer(dali);
                rev.reverse();

               if(rev.toString() == dali)
               {
                   System.out.println("Dali value is :"+dali+" ");
                   System.out.println("Rev value is :"+rev+" ");
               }
            }
        }
    }
}
