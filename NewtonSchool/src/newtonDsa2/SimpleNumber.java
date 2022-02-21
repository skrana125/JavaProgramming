package newtonDsa2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SimpleNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First value L : ");
        int L = scanner.nextInt();
        System.out.println("Enter the second value R : ");
        int R = scanner.nextInt();
        System.out.println("Enter the magic number K : ");
        int K = scanner.nextInt();

        int count = 0;
        for(int i=L;i<=R;i++)
        {
            if(i%K==0)
            {
                count++;
            }
        }
        System.out.println("Number of nice integer is : "+count);
    }
}
