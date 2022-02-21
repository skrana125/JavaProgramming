import java.util.Scanner;

//Arrange the even number first and then the odd number in an array
public class ArrangeNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an Array : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter the elements of an Array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
         int p = 0, q = 0;
        int [] b = new int[p];
        int [] c = new int[q];

        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                b[i] = arr[i];
                p++;
            }
        }
        System.out.println("Array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
