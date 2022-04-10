//it does not check for exact same String, but it checks string is same or not

package strings.camparision;

import java.util.Scanner;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Java";
        String str2 = "Python";
        String str3 = "java";
        String str4 = "C++";
        String str5 = "Java";

        boolean result1 = str1.equalsIgnoreCase(str2);
        boolean result2 = str1.equalsIgnoreCase(str3);
        boolean result3 = str1.equalsIgnoreCase(str4);
        boolean result4 = str1.equalsIgnoreCase(str5);

        System.out.println("Result1 : "+result1 + ", Result2 : "+result2+ ", Result3 :"+result3+", Result4 :"+result4);

    }
}
