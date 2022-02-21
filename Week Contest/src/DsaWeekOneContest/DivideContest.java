package DsaWeekOneContest;

import java.util.Scanner;

public class DivideContest
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ,m;
        n = m = scanner.nextInt();

        if(n%m==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }
}
