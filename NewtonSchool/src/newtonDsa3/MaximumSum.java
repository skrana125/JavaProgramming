package newtonDsa3;

import java.util.Scanner;

public class MaximumSum
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of row 2D-Array : ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of column 2D-Array : ");
        int m = scanner.nextInt();

        int [][] arr = new  int[100][100];
        System.out.println("Enter the element of an 2D-Array : ");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("2D ARRAY : ");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int maxSum = 0;
        for (int i=0;i<n;i++)
        {
            int sumCol = 0;
            for (int j=0;j<m;j++)
            {
                sumCol += arr[j][i];
            }
            System.out.println("Sum of "+(i+1)+" column "+sumCol);
            if(sumCol>maxSum)
            {
                maxSum = sumCol;
            }
        }
        System.out.println("Maximum Sum of Column is : "+maxSum);


    }
}
