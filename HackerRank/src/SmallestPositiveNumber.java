import java.util.Scanner;

/*
You are given an unsorted array with both positive and negative elements. You have to find the smallest
positive number missing from the array.
Input:  {2, 3, 7, 6, 8, -1, -10, 15}
Output: 1
Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
Output: 4
Input: {1, 1, 0, -1, -2}
Output: 2
*/
public class SmallestPositiveNumber
{
    static int positiveNumber(int [] arr, int n)
    {
        //Checking for negative number... if the number is negative then we store the value
        //in an array from 1 to n+1(size+1)
        for (int i=0;i<n;i++)
        {
            if(arr[i]<=0)
            {
                arr[i] = arr.length+1;
            }
        }
        // we convert the every number into negative number

        for(int i=0;i<arr.length;i++)
        {
             int x = Math.abs(arr[i]);
            //condition for to make number -ve
            if(x<=arr.length && arr[x-1]>0)
            {
                arr[x-1] = -arr[x-1];
            }
        }

        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]>0)
            {
                return i+1;
            }
        }
        return arr.length+1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of an Array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        int result = positiveNumber(arr,n);
        System.out.println("Smallest positive number is : "+result);
    }
}
