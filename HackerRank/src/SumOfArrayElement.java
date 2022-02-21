import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfArrayElement
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String [] args)
    {
        int count = 0,n;
        List<Integer> ar = new ArrayList<>();
        System.out.print("Enter the length of the list : ");
        n = sc.nextInt();

        System.out.print("\nEnter the elements of an arrayList : ");
        for(int i=0;i<n;i++)
        {
           int j = sc.nextInt();
           ar.add(j);
        }
        System.out.println("\nArrayList is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(ar.get(i)+" ");
        }
        for(int i=0;i<n;i++)
        {
            count = count+ar.get(i);
        }
        System.out.println("\nSum of List in Array is : "+count);
    }
}
