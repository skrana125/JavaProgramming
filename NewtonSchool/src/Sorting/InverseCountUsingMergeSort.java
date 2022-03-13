package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InverseCountUsingMergeSort
{
    public static int inverseCount(int [] arr, int start, int end)
    {
        int count = 0;
        if(start<end)
        {
            int mid = start+(end-start)/2;

            //For first half of an array
            count += inverseCount(arr, start, mid);

            //for second half of an array
            count += inverseCount(arr,mid+1,end);

            count += merge(arr, start, mid, end);
        }
        return count;
    }
    public static int merge(int [] arr, int start, int mid, int end)
    {

        int n = mid - start+1;
        int m = end-mid;

        int []p = new int[n];
        int []q = new int[m];

        for(int i=0;i<n;i++)
        {
            p[i] = arr[start+i];
        }
        for (int j=0;j<m;j++)
        {
            q[j] = arr[mid+1+j];
        }

        int i = 0, j= 0, k= start;
        int startCount = 0;

        while (i<p.length && j<=q.length)
        {
            if(p[i]<=p[j])
            {
                arr[k] = p[i];
                i++;
            }
            else
            {
                arr[k] = q[j];
                j++;
                startCount += (mid+1)-(start+i);
            }
            k++;
        }
        while (i<p.length)
        {
            arr[k] = p[i];
            i++;
            k++;
        }
        while (j<q.length)
        {
            arr[k] = q[j];
            j++;
            k++;
        }
        return startCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = sc.nextInt();

        System.out.println("Enter the element of an Array : ");
        int [] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int result = inverseCount(arr, 0, n-1);
        System.out.println(result);
    }
}
