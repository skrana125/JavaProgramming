import java.util.Scanner;

public class SumOfDigit
{
    static  int solution(int n)
    {
        int r = 0, s = 0;
        if(n>=10 && n<=99)
        {
            while (n!=0)
            {
                r = n%10;
                System.out.println("Value of r is : "+r);
                s = s+r;
                System.out.println("Value of s is : "+s);
                n = n/10;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scanner.nextInt();

        int result = solution(n);
        System.out.println(result);
    }

}
