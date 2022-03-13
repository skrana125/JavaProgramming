import java.util.Arrays;
import java.util.Scanner;

public class MergeSort
{
    public static int [] implement(int [] arr, int start, int end)
    {
        if(start<end)
        {
            int mid = start+(end-start)/2;
            //for first half of array
            implement(arr,start,mid);

            //for second half of an array
            implement(arr,mid+1,end);

            //merge an array
            merge(arr,start,mid,end);
        }
        return arr;
    }

    public static void merge(int [] arr, int start, int mid, int end)
    {
        int n1 = mid-start+1;
        int n2 = end - mid;

        int [] p = new int[n1];
        int [] q = new int[n2];

        for (int i=0;i<n1;i++)
            p[i] = arr[start+i];

        for (int j=0;j<n2;j++)
            q[j] = arr[mid+1+j];

        int i = 0, j=0, k = start;

        //for merge the both sub array;
        while(i<n1 && j<n2)
        {
            if(p[i]<=q[j])
            {
                arr[k] = p[i];
                i++;
            }
            else
            {
                arr[k] = q[j];
                j++;
            }
            k++;
        }

        //for storing the last element from first subarray
        while(i<n1)
        {
            arr[k] = p[i];
            i++;
            k++;
        }
        while (j<n2)
        {
            arr[k] = q[j];
            j++;
            k++;
        }

    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
           for (int i=0;i<n;i++)
           {
               System.out.print(arr[i]+" ");
           }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();

        System.out.println("Enter element of an array :");
        int [] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting :");
        printArray(arr);

        implement(arr, 0,n-1);

        System.out.println("Sorted Array");
        printArray(arr);
    }
}
