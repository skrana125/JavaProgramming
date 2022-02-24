/* Josephus problem n is number of people present in the circle
*  while k is no of steps we need to take for to kill people
*  its general formula is (g(n-1,k)+k-1)mod n+1
*/
package Recursion;

import java.util.Scanner;

public class GameOfExecution
{
    static int loki(int n, int k)
    {
        if(n==1)
            return 1;
        else
            return (loki(n-1,k)+k-1)%n+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of test case : ");
        int t = scanner.nextInt();
        for (int i=1;i<=t;i++)
        {
            System.out.println("Number of people in circle : ");
            int n = scanner.nextInt();
            System.out.println("Number of steps we have to skips : ");
            int k = scanner.nextInt();

            int result = loki(n,k);
            System.out.println(result);
        }

    }
}
