//longest substring without repeataion of character

package mockInterview;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.next();

        int result = longestSubString(str);
        System.out.println("Length of longest String is:"+result);
    }

    public static  int longestSubString(String str)
    {
        String ans = "";
        int maxlength = -1;

        if(str.isEmpty())
            return 0;

        if(str.length() == 1)
            return 1;

        for(char ch:str.toCharArray())
        {
            String curr = String.valueOf(ch);
            if(ans.contains(curr))
            {
                ans = ans.substring(ans.indexOf(curr)+1);
            }
            ans += String.valueOf(ch);
            maxlength = Math.max(maxlength, ans.length());
        }

        return maxlength;
    }
}
