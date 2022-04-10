package oneDArrayMaths;

import java.util.Scanner;

public class GoodBuildings
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total numbers of buildings : ");
        int n= sc.nextInt();

        int [] buildings = new int[n];
        System.out.println("Each building heights : ");
        for (int i= 0;i<n;i++)
        {
            buildings[i] = sc.nextInt();
        }

        int max = buildings[0];
        int index = 0;

        for (int i=0;i<n;i++)
        {
            if(max<=buildings[i])
            {
                max = buildings[i];
                index = i;
            }
        }
        System.out.println("Maximum value is : "+max+" at index "+index);
        System.out.println("Good buildings are :");
        if(index == n-1)
        {
            System.out.print(buildings[n-1]+" ");
        }
        else {
            for (int i=index;i<n-1;i++)
            {
                if(buildings[i]>=buildings[i+1])
                    System.out.print(buildings[i]+" ");

                if(i+1 == n-1)
                    System.out.print(buildings[i+1]);
            }
        }
    }
}
