//it checks that string is exactly same or not
package strings.camparision;

import java.util.Scanner;

public class EqualsFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Java";
        String str2 = "is";
        String str3 = "Programming";
        String str4 = "Language";
        String str5 = "java";

        boolean result1 = str1.equals(str2);
        boolean result2 = str1.equals(str3);
        boolean result3 = str1.equals(str4);
        boolean result4 = str1.equals(str5);

        System.out.println("Result1 : "+result1 + ", Result2 : "+result2+ ", Result3 :"+result3+", Result4 :"+result4);

    }
}
