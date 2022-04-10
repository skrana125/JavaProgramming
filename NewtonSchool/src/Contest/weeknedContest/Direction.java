/*
Problem Statement
Alice wants to go to Bob's house. The location of their houses is given on a 2-D coordinate system.
There are a total of 8 directions:
North - Directly above
South - Directly below
East - To the right
West - To the left
North East - In between north and east
North West - In between north and west
South East - In between south and east
South West - In between south and west
Find the direction in which Alice must go to reach Bob's house.
Input
There are two lines of input. The first line contains the x and y coordinate of Alice's house.
The second line contains x and y coordinate of Bob's house. It is given that these two locations are different.

-100 <= Coordinates <= 100
Output
Print a single string denoting the direction in which Alice must move to reach Bob's house.
Example
Sample Input 1:
2 5
11 25

Sample Output 1:
North East

Sample Input 2:
23 12
-85 12

Sample Output 2:
West
*/
package Contest.weeknedContest;

import java.util.Scanner;

public class Direction
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of Alice house : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Enter the co-ordinate of Bob house : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        if(x == x1 && y < y1)
            System.out.println("North");
        else if(x == x1 && y > y1)
            System.out.println("South");
        else if(x < x1 && y == y1)
            System.out.println("East");
        else if(x > x1 && y == y1)
            System.out.println("West");
        else if(x < x1 && y < y1)
            System.out.println("North East");
        else if(x < x1 && y > y1)
            System.out.println("South East");
        else if(x > x1 && y > y1)
            System.out.println("South West");
        else
            System.out.println("North West");
    }
}
