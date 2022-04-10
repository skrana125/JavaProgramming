package KickStart;
import java.util.*;
import java.io.*;

public class NumberOfCandies
{

        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of test Case : ");
            int t = sc.nextInt();

            int count = 0;
            int result = 0;
            for (int i = 1; i <=t; i++) {
                System.out.println("Total number of bags :");
                int n = sc.nextInt();
                System.out.println("Total number of children : ");
                int m = sc.nextInt();

                int[] c = new int[n];
                System.out.println("Number of candies in each bag : ");
                for (int j = 0; j < n; j++) {
                    c[i] = sc.nextInt();
                    count = count + c[i];
                }

                result = count % m;
                System.out.println("number of candies left in the bag after distribution : ");
                System.out.print("Case #" + i + ": " + result);
                System.out.println();
                count = 0;
            }

        }
}
