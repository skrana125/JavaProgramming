import java.util.Locale;
import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = scanner.next();
        String reverseStr = "";

        int j=str.length()-1;

        for (int i = j; i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
