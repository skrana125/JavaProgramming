/* adding the digits until of number until it do not get reduce the single digit.
   Time complexity of this is O(1).
 */
package Recursion;

import java.util.Scanner;

public class SingleDigitWithoutRecursion
{
    static void digitSum(int n)
    {
        int sum = 0;
        // if value of n then it's return nothing
        if(n==0)
            return;
        //if sum of number totally divisible by 9 then it's return 9
        if(n%9==0)
            sum = 9;
        //if the number is not divisible by 9 then it's return the remainder of that number
        else
            sum = n%9;
        System.out.println("Single Digit is : "+sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of your choice");
        int n = scanner.nextInt();
        digitSum(n);
    }
}
