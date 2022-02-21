import java.util.Scanner;

public class DecendingSortArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = scanner.nextInt();
        int [] ar = new int[n];

        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<n;i++)
        {
            ar[i] = scanner.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            /* check if the elements are in correct position */
            if(ar[i]==i+1)
            {
                i++;
            }
            /* else we swap the value of ar[i] with ar[ar[i]-1] */
           else
            {
                int temp = ar[i];
                int temp2 = ar[ar[i]-1];
                ar[i] = temp2;
                ar[temp-1] = temp;
            }
        }
        System.out.println("Sorted Array in decending order are : ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
