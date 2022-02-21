package newtonDsa2;

import java.util.Scanner;

public class MovingRIght
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of buildings : ");
        int n = scanner.nextInt();
        System.out.println("Enter the height of buildings : ");
        int [] building = new int[n];
        for (int i=0;i<n;i++)
        {
            building[i] = scanner.nextInt();
        }
       // int start = building[0];
        int count = 0,jump = 0;
        for(int i =0;i<n-1;i++)
        {
            if(building[i]>=building[i+1])
            {
                count++;
            }
            else
            {
                jump = Math.max(jump,count);
                count = 0;
            }
        }
        System.out.println("Number of jump is : "+jump);
    }
}
