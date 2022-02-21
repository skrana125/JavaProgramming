/* Consider a sequence of integers from 1 to N (1, 2, 3,. .. . N).
Your task is to divide this sequence into two sets such that the absolute
 difference of the sum of these sets is minimum i.e if we divide the sequence in set A and B then
 |Sum(A) - Sum(B)| should be minimum.
 Ex1 Sample Input:-                                     Ex 2 Sample Input:-
5                                                        8
Sample Output:-                                     Sample Output:-
1                                                       0
Explanation:-                                       Explanation:-
Set A:- 1, 2, 5                                         Set A:- 1, 2, 3, 5, 7
Set B:- 3. 4                                            Set B;- 4, 6, 8
*/
package newtonDsa2;

import java.util.Scanner;

public class TwoSets
{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();
        //int [] arr = new int[n];
        int set = n*(n+1)/2;
        if(set%2==0)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("1");
        }

    }
}
