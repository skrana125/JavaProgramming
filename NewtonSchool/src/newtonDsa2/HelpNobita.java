/*
While doing homework, Nobita stuck on a problem and asks for your help.
    Problem statement:-
    Given three integers X, Y, and N. Your task is to check if it is possible to form N by using only
    combinations of X and Y.
    i.e check if there exist any P and Q such that P*X + Q*Y = N

Note:- P and Q can be negative
*/
package newtonDsa2;

import java.util.Scanner;

public class HelpNobita
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n : ");
        int n = scanner.nextInt();
        System.out.println("x : ");
        int x = scanner.nextInt();
        System.out.println("y : ");
        int y = scanner.nextInt();

        int result = 0;
        for(int i=1;i<=x && i<=y;i++)
        {
            if(x%i==0 && y%i==0)
            {
                result = i;
            }
        }
        if(result%n==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
