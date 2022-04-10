import java.util.*;
public class MagicNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int i = sc.nextInt();
        isMagicNumber(i);
    }

    public static void isMagicNumber(int n)
    {
        int j = n;
        int sum =0;
        while(sum>9 || n>0) {
            if (n == 0)
            {
                n = sum;
                sum = 0;
            }
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        if(sum == 1)
        {
            System.out.println(j+" is Magic Number");
        }
        else
        {
            System.out.println(j+" not Magic Number");
        }
    }
}
