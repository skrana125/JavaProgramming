import java.util.Scanner;

public class TowerHanoiProgram
{
    static void toh(int n, int from, int to, int aux)
    {
        if(n==0)
        {
            return;
        }
        toh(n-1,from, aux, to);
        System.out.println("Move Disk "+n+" from "+from+" to disk "+aux);
        toh(n-1,to, from, aux);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int n = scanner.nextInt();
        toh(n,1,2,3);
    }
}
