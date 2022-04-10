/*
Problem Statement
You have a tray X centimetres long. You need to place pancakes having length Y on this tray.
Two pancakes must have a distance of at-least Z between them to avoid mixing with each other when the tray is moved.
The distance between the end of the tray and the pancake must also be at-least Z so that the pancake stays stable.
Find the maximum number of pancakes that can be placed on the tray.
Input
The first and the only line of input contains three integers X, Y, and Z.

Constraints
1 <= X, Y, Z <= 100000
You can place at-least one pancake on the tray, i. e, X >= Y + 2Z.
Output
Output a single integer, the maximum number of pancakes you can place on the tray.
Example
Sample Input
14 3 1

Sample Output
3

Explanation
This is the arrangement (1 space) Pancake (2 space) Pancake (1 space) Pancake (1 space).

Sample Input
12 3 1

Sample Output
2
*/
package Contest.easyPeasy;

import java.util.Scanner;

public class Pancakes
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of tray is :");
        int x = sc.nextInt();
        System.out.println("Size of Cake :");
        int y = sc.nextInt();
        System.out.println("Space between each Cake :");
        int z = sc.nextInt();

        int cake = y+(z*2);
        int count = 0;
        if(x >= cake)
        {
            while (x > 0)
            {
                boolean check = false;
                if(count == 0)
                {
                    if(x >= cake)
                    {
                        x = x- cake;
                        count++;
                        check = true;
                    }
                }
                else
                {
                    if(x >= cake-z)
                    {
                        x = x-cake+z;
                        count++;
                        check = true;
                    }
                }
                if(!check)
                    break;
            }
        }
        System.out.println("Total Cake can be placed :"+count);
    }
}
