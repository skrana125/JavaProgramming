/*
 * 1
 * 21
 * 321
 * 4321
 * 321
 * 21
 * 1
 * */
public class PatternProgram
{
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=1;i<5;i++)
        {
            for (int k = 4;k>=i;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
