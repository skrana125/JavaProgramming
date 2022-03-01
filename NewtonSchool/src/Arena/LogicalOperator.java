package Arena;

import java.util.Scanner;

public class LogicalOperator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of A and b : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a<=10 && b>=10)
        {
            System.out.print("true ");
        }
        else
        {
            System.out.print("false ");
        }
        if(a%2==0 || b%2==0)
        {
            System.out.print("true ");
        }
        else
        {
            System.out.print("false ");
        }
        if (a!=b)
        {
            System.out.print("true ");
        }
        else
        {
            System.out.print("false ");
        }
    }
}
