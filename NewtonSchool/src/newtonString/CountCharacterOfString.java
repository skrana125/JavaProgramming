package newtonString;

import java.util.Scanner;

public class CountCharacterOfString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = "Java is very good programming Language. ";
        int length = 0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if(ch !=' ')
            {
                length++;
            }
        }
        System.out.println("Length is : "+length);
    }
}
