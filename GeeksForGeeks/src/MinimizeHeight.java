import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class MinimizeHeight
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();

        System.out.println("Enter a positive integer : ");
        int k = scanner.nextInt();

        int [] arr = new int[n];
        System.out.println("Element of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int s = arr[0]+k;
        int l = arr[n-1]-k;

        int result = arr[n-1]-arr[0];

        for (int i=1;i<n;i++)
        {
            int min = Math.min(s,arr[i]-k);
            int max = Math.max(l,arr[i-1]+k);
            result = Math.min(result,max-min);
        }
        System.out.println("Minimum difference = "+result);
    }
}
