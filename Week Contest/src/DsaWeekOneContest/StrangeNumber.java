package DsaWeekOneContest;
/* to find the nth stranger number  which is divisible by 9
* input = 3
* output = 18
* 0,9,and 18. so 18 is nth number. */
import java.util.Scanner;

public class StrangeNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any number of your choice : ");
        int n = scanner.nextInt();
        if(n>=0)
        {
            System.out.println("Nth Stranger Number is : "+(n-1)*9);
        }
    }
}
