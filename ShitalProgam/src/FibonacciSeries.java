import java.util.Scanner;

public class FibonacciSeries
{
    static int fibonacci(int num)
    {
        if(num<=1)
        {
            return num;
        }
        else
        {
            return (fibonacci(num-1)+fibonacci(num-2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
        System.out.print("Fibonacci series is : ");
        for(int i=0;i<number;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
    }
}
