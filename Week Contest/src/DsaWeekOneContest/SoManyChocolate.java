package DsaWeekOneContest;

import java.util.Scanner;

public class SoManyChocolate
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of person in party : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int totalChocolate = 0;

        System.out.println("Enter the number of chocolate given by each person : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();

            totalChocolate += arr[i];
        }
        System.out.println("Total chocolate the girl get from people is : "+totalChocolate);
    }
}
