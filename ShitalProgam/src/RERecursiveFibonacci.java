import java.util.Scanner;

public class RERecursiveFibonacci
{
    static int n1 = 0, n2 = 0;
    static int fib = 1;

    static void fibonacci(int number)
    {
        if(number>0)
        {
            fib = n1+n2;
            n1  = fib;
            fib = n2;

            System.out.println("N2 is : "+fib);
            fibonacci(number-1);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of your choice : ");
        int number = scanner.nextInt();
        System.out.print("N1 is : "+n1+" Fib Number is : "+fib);
        fibonacci(number-2);
    }
}
