import java.util.Scanner;

//Find a pair with given sum in an array
public class PairSum
{
    public static void main(String[] args)
    {
        int n, target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the target number:");
        target = sc.nextInt();
        System.out.println("Enter the element of an array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;i<n;j++)
            {
                if((arr[i]+arr[j])==target)
                {
                    System.out.println("Pair found ("+arr[i]+","+arr[j]+")");
                }
            }
        }
        System.out.println("Pair not found");
    }
}
