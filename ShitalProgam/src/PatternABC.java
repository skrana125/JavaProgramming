import java.util.*;
import java.io.*;
import java.util.Scanner;

public class PatternABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        for(int i=0;i<str.length();i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
