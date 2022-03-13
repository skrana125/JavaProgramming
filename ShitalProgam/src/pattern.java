/*
* 1
* 1 2
* 1 2 3
* 1 2 3 4
* 1 2 3 4 5
* */

public class pattern
{
    public static void main(String[] args) {
        int row = 5;
        for (int i=row;i>=1;i--)
        {
            for (int j = 1;j>=5 ;j--)
            {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
