/*
After the decimation, all world went into chaos. People had to rebuild the planet so Shield came up with a donation strategy.
They feel all the rich guys need to donate more than the poor guys. So, they make a rule.
They would make a donation list in which the donation of each person would be shown.
But the rule is that a person can’t pay less than what has already been paid before them.
Find the extra amount each person will pay, and also, tell shield the total amount of donation.

Constraints:-
1 <= n <= 100000
0 <= money <= 100000

Sample Input:-
10
1 2 3 2 4 3 6 6 7 6

Sample Output:-
0 0 0 1 0 1 0 0 0 1
43

Sample Input:-
7
10 20 30 40 30 20 10

Sample Output:-
0 0 0 0 10 20 30
220
*/
package oneDArrayMaths;

import java.util.Scanner;

public class Donation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] donation =  new int[n];
        int sum = 0, temp = arr[0];

        System.out.println("Enter the donation of money donated by each people : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            if(temp < arr[i])
            {
                donation[i] = 0;
                sum = sum + arr[i];
                temp = arr[i];
            }
            else
            {
                donation[i] = temp - arr[i];
                sum += donation[i];
            }

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(donation[i]+" ");
        }
        System.out.print("\n");
        System.out.print(sum);

    }
}
