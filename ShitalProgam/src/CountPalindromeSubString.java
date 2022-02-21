import java.util.Scanner;

/* count the number of palindrome substring in a string */
public class CountPalindromeSubString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String of your choice : ");
        String str = scanner.next();

        String temp = "";
        StringBuffer stf;
        int count = 0;
        for(int i=0;i<str.length();i++) {
            for (int j = i + 1; j < str.length(); j++) {
                temp = str.substring(i, j);
                // check if length is greater than or equal to two check for Palindrome
                if (temp.length() >= 2) {
                    //Using StringBuffer to reverse possible string
                    stf = new StringBuffer(temp);
                    stf.reverse();

                    if (stf.toString().compareTo(temp) == 0) {
                        count++;
                    }
                    System.out.print(stf + "::"+temp+" ");
                }
            }
        }
        System.out.println();
        System.out.println("Total number sub-string having Palindrome are ; "+count);
    }
}
