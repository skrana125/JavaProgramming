package strings;

import java.util.Scanner;

public class ModifyString
{
    public static void modifyString(String str)
    {
        int n = str.length();
        int count = 0;
        for(int i=0;i<n-2;i++)
        {
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2))
            {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testCase : ");
        int t = sc.nextInt();
        System.out.println("Enter string for each test case : ");

        for(int i=1;i<=t;i++)
        {
            String str = sc.next();
            modifyString(str);
        }

    }
}
