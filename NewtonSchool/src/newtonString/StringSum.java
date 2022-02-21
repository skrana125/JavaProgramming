package newtonString;

import java.util.Scanner;

public class StringSum
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of first String : ");
        String str = scanner.next();
        System.out.println("Enter the value of Second String : ");
        String ptr = scanner.next();
        int strAscii = 0, ptrAscii = 0;

        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) >='0' && str.charAt(i) <= '9')
            {
                strAscii = str.charAt(i);
            }
            else
            {
                return;
            }
        }
        for (int j=0;j<ptr.length();j++)
        {
            if(ptr.charAt(j)>='0' && ptr.charAt(j)<='9')
            {
                ptrAscii = ptr.charAt(j);
            }
            else
            {
                return;
            }
        }
        int sum = strAscii+ptrAscii;
        System.out.println("Sum of First String and Second String are : "+sum);
    }
}
