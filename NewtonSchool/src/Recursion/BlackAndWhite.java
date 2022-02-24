/* There is white and Black night in the board
* Find number of ways to place into N*M chess so that they cannot
* kill each other. Horse take L shape step in chess board.*/
package Recursion;

import java.util.Scanner;

public class BlackAndWhite
{
    static int horseStep(int n, int m)
    {
        int result = (n*m-1)*n*m ;
        if(n>=1 && m>=2)
        {
            result -= (4*(n-1)*(m-2));
        }
        if(n>=1 && m>=1)
        {
            result -=(4*(n-2)*(m-1));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of TestCases : ");
        int t = scanner.nextInt();
        for (int i=1;i<=t;i++)
        {
            System.out.println("Enter value of n : ");
            int n = scanner.nextInt();
            System.out.println("enter value of m :");
            int m = scanner.nextInt();

            int result = horseStep(n,m);
            System.out.println("Total number of way int which they don't attack : "+result);
        }
    }
}
