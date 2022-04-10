package strings.characterExtraction;

import java.util.Scanner;

public class ToCharArrayFunction {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "Java is awesome programming language.";

        char [] ch = str.toCharArray();

        for (int i=0;i<str.length();i++)
        {
            System.out.print(ch[i]+" ");
        }
    }
}
