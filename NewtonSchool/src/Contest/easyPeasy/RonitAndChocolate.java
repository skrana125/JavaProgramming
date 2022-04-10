/*
Problem Statement
Rohit's uncle gives him D chocolates for up to N days, He already has C chocolates with him
if he eats one chocolate a day how many chocolates will he have at the end of N days.
Input
User Task:
Since this will be a functional problem, you don't have to take input.
You just have to complete the function Chocolates() that takes integers D, N and C as parameters.

Constraints:-
1 <= D <= 100
1 <= N <= 100
1 <= C <= 100
Output
Return the number of chocolates at the end of N days
Example
Sample Input:-
D = 5, N = 5, C = 5

Sample Output:-
25

Explanation:-
At the end of the First day:- 5 + 5 - 1 = 9
At the end of the Second day:- 9 + 5 - 1 = 13
At the end of the Third day:- 13 + 5 - 1 = 17
At the end of the Fourth day:- 17 + 5 - 1 = 21
At the end of the Fifth day:- 21 + 5 - 1 = 25

Sample Input:-
D = 1, N = 2, C = 3

Sample Output:-
3
*/
package Contest.easyPeasy;

import java.util.Scanner;

public class RonitAndChocolate
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of chocolate uncle give to Rohit : ");
        int d = scanner.nextInt();
        System.out.println("No of days : ");
        int n = scanner.nextInt();
        System.out.println("Chocolate already have : ");
        int c = scanner.nextInt();

        int count = 0;
        for (int i=1;i<=n;i++)
        {
            int left = n - c;
            count = n*d - left;

        }
        System.out.println("Chocolate left : "+ count);
    }
}
