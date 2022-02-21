package DsaWeekOneContest;

import java.util.Scanner;

public class NnContest
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of your choice : ");
        int n = scanner.nextInt();

        if(n>0)
        {
            int result = n*(n-1);
            System.out.println("Nth non negative integer is : "+result);
        }
    }
}
