package DsaWeekOneContest;

import java.util.Scanner;

public class HappyBalloon
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of balloon : ");
        int n = scanner.nextInt();

        int [] arr = new int[n];
        int result = 0;
        System.out.println("Enter the number written on balloon : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        for (int i =1; i<=n;i++)
        {
            if((i%2!=0 && arr[i-1]%2!=0) ||(i%2==0 && arr[i-1]%2==0))
            {
                result++;
            }
        }
        System.out.println(result);
    }
}
