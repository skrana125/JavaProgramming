/* They say friendship is greater than love. Why not play the famous game "FLAMES".
The rules are super simple. Given two strings (all lowercase),
remove all the letters that are common to both the strings from both the strings.
You cannot erase two characters corresponding to one character.
For example, in the case
String 1: saumya
String 2: ansh
You can remove only 1 'a' and 1 's' from both the strings.
Remaining strings are:
String 1: umya
String 2: nh

Now all you need to do is find the sum of the remaining strings length % 6.

Output:
If obtained value is 1, output "Friends"
If obtained value is 2, output "Love"
If obtained value is 3, output "Affection"
If obtained value is 4, output "Marriage"
If obtained value is 5, output "Enemy"
If obtained value is 0, output "Siblings"
Input
You will be given two strings on different lines.

Constraints
1 <= Length of both the strings <= 100000
Output a single string, the result of FLAMES test.
Example
Sample Input:-
saumya
ansh

Sample Output:-
Siblings

Explanation:-
after deleting characters :-
str1 = umya
str2 = nh
sum = 4+2
sum%6=0
*/

package strings;

import java.util.Scanner;

public class Flames
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String : ");
        StringBuilder str1 = new StringBuilder(scanner.next());

        System.out.println("Enter second String : ");
        StringBuilder str2 = new StringBuilder(scanner.next());

        char ch, sh;
        for(int i=0;i<str1.length();i++)
        {
            ch = str1.charAt(i);

            for (int j=0;j<str2.length();j++)
            {
                sh = str2.charAt(j);
                if(ch == sh)
                {
                    str1.deleteCharAt(i);
                    str2.deleteCharAt(j);
                    i--;
                    break;
                }
            }
        }
        System.out.print("first string is :"+str1);
        System.out.println();
        System.out.print("Second String is : "+str2);
        System.out.println();

        StringBuilder str = str1.append(str2);
        System.out.println("Append string is : "+str);

        int length = str.length();
        System.out.println("Length of new String is : "+length);

        // int sum = length%6;
        switch (length % 6) {
            case 1 -> System.out.println("Friends");
            case 2 -> System.out.println("Love");
            case 3 -> System.out.println("Affection");
            case 4 -> System.out.println("Marriage");
            case 5 -> System.out.println("Enemy");
            default -> System.out.println("Siblings");
        }
    }
}
