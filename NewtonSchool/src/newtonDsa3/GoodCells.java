/* Given a boolean Matrix of size N*M, A cell of the matrix is called "Good" if it is
completely surrounded by the cells containing '1' i.e. each adjacent cell (which shares a common edge) contains '1'.
Your task is to find the number of such cells.
Constraints:-
3 <= N, M <= 500
0 <= Matrix[][] <= 1
Sample Input:-
3 3
1 1 0
1 1 1
1 1 1
Sample Output:-
1
Explanation:-
Only cell at position (1, 1) is good

Sample Input:-
5 4
1 0 1 0
0 1 0 1
1 0 1 0
0 1 0 1
1 0 1 0
Sample Output:-
3
Explanation:-
(1, 2), (2, 1) and (3, 2) are good cells
*/
package newtonDsa3;

import java.util.Scanner;

public class GoodCells
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of row of 2D-Array : ");
        int n = scanner.nextInt();
        System.out.println("Enter the length of column of 2D-Array : ");
        int m = scanner.nextInt();

        int [][] arr = new int[n][m];
        int count = 0;
        System.out.println("Enter the element of an Array : ");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i=1;i<n-1;i++)
        {
            for (int j=1;j<m-1;j++)
            {
                    if(arr[i+1][j]==1 && arr[i][j+1]==1)
                    {
                        count++;
                    }
                System.out.println("Cell number is ("+i+","+j+")"+count);
            }
        }
        System.out.println();
        System.out.println("Total number of Good Shell is : "+count);
    }
}
