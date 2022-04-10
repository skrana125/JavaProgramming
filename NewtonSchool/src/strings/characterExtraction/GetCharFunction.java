//getChar() function give multiple character at once. It copies character from this String into
//   the destination character array.
// it takes 4 parameter srcStart, srcEnd, char [] arr, int target
package strings.characterExtraction;

import java.util.Scanner;

public class GetCharFunction
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "Java is awesome programming language.";
       /* System.out.println("Enter the target index :");
        int target = sc.nextInt();*/
        System.out.println("Enter the start index : ");
        int start = sc.nextInt();
        System.out.println("Enter the end index : ");
        int end = sc.nextInt();

        int target = 0;
        char [] ch = new char[(end - start)];
        str.getChars(start, end,ch,target);

        String newStr = new String(ch);
        System.out.println("Targeted String is : "+newStr);

    }
}
