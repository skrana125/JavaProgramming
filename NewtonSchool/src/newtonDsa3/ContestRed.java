/* You're given a string S of lowercase letters of the english alphabet.
Find whether you can choose some characters of the string S in any order to create the string "red".
 */
package newtonDsa3;

import java.util.Scanner;

public class ContestRed
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();
       //char [] chr = str.toCharArray();

        if((str.contains("r") && str.contains("e") && str.contains("d")))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }
}
