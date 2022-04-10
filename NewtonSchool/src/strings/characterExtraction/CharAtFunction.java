package strings.characterExtraction;

import java.util.Scanner;

public class CharAtFunction {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "Java is awesome programming language.";

       str.charAt(6);
       for (int i=0;i<str.length();i++)
       {
           System.out.print(str.charAt(i)+" ");
       }
    }
}
