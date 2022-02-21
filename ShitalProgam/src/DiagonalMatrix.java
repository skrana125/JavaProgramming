/* Find the absolute difference between sum of diagonal matrix*/
import java.util.Scanner;


public class DiagonalMatrix
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of Rows of matrix : ");
        int n = scanner.nextInt();
        System.out.print("Enter the length of Column of matrix : ");
        int m = scanner.nextInt();

        int [][] arr =  new int[m][n];
        int diagonal1 = 0, diagonal2 = 0;

        System.out.print("Enter the element of an 2D Array : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0 ;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(m == n)
                {
                    if(i==j)
                    {
                        diagonal1 +=arr[i][j];
                    }
                   if(i==(n-j-1))
                   {
                       diagonal2 +=arr[i][j];
                   }
                }
            }
        }
        System.out.println("Diagonal First Sum is : "+diagonal1);
        System.out.println("Diagonal second sum is : "+diagonal2);
        System.out.println("The absolute difference between the diagonals are : "+Math.abs(diagonal1-diagonal2));
    }
}
