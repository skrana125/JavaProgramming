import java.util.Scanner;

/*
Count the frequency of an element in 2D Array
 */
public class ElementFrequencyInArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of Row : ");
        int row = scanner.nextInt();
        System.out.print("Enter the size of Column : ");
        int col = scanner.nextInt();

        int [][] arr = new int[row][col];

        System.out.println("Enter the element  of an Array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count , number;
        int [][] visited = new  int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                count=1;
                number = arr[i][j];
                if(visited[i][j]!=1)
                {
                    for(int k =0;k<row;k++)
                    {
                        for(int l = 0;l<col;l++)
                        {
                            if((i==k) &&(j==l))
                            {
                                continue;
                            }
                            if((arr[i][j])==arr[k][l])
                            {
                                visited[k][l] = 1;
                                count++;
                            }
                        }
                    }
                    System.out.println("Frequency of number "+number+" is/are : "+count);
                }
            }
        }
    }
}
