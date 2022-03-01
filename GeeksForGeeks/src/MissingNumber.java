import java.util.Scanner;

public class MissingNumber 
{
    static int missingElement(int [] arr, int n)
    {
        // type 1 using XOR operation
        /*int a = 1;
        int b = arr[0];
        for(int i=2;i<=n+1;i++)
        {
            a = a^i;
        }
        for (int i = 1;i<n;i++)
        {
            b = b^arr[i];
        }
        return a^b;*/

        //Type 2 but their will integer overflow when we take value of n is larger
       /* int sum = (n+1)*(n+2)/2;
        for (int i=0;i<n;i++)
        {
            sum -= arr[i];
        }
        return sum;*/

        //to optimize the integer overflow of above program
        int sum = 1;
        int count = 2;
        for (int i = 2; i<=n+1;i++)
        {
            sum += i;
            sum -=arr[i-2];
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of an Array : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Elements of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Missing element is : "+missingElement(arr,n));
    }
}
