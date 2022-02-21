import java.util.Scanner;
/* 1 2 3
*  4 5 6
*  7 8 9 */
public class SpiralMatrix
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the value of n and m : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[m][n];
        System.out.println("Enter the array of matrix n*n : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;i<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int left = 0, top = n-1;

        //for(int j=0;j<n/2;j++)
        {
            for(int i=left;i<top;i++)
            {
                System.out.println(arr[left][i]);
            }
            for (int i=left+1;i<top;i++)
            {
                System.out.println(arr[i][top]);
            }
           // for(int i=)
        }
    }
}
