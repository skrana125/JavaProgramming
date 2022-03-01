/*Given a positive integer N, construct a string of length N such that no two adjacent characters are same.
Among all possible strings, find the lexicographically minimum string.
 Note: You can use only lowercase characters from 'a' to 'z'.
Sample Input
1
Sample Output
a
Sample Input
2
Sample Output
ab
 */
package newtonDsa3;


import java.util.Scanner;

public class SmallestString
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        String chr;
        StringBuilder stringBuilder = new StringBuilder(n);
        for (int i=0;i<n;i++)
        {
            if(i%2==0)
                stringBuilder.append('a');
            else
                stringBuilder.append('b');
        }
        System.out.println(stringBuilder);

    }
}
