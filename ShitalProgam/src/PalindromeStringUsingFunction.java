import java.util.Scanner;

public class PalindromeStringUsingFunction
{
    static boolean isPalindrome(String str)
    {
        int len = str.length()-1;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)!=str.charAt(len))
            {
                return false;
            }
            len--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = scanner.next();

        if(isPalindrome(str))
        {
            System.out.println(str+" is Palindrome");
        }
        else
        {
            System.out.println(str+" Not Palindrome");
        }
    }
}
