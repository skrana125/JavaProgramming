/*Calculate inversion count of array of integers.
Inversion count of an array is quantisation of how much unsorted an array is.
A sorted array has inversion count 0, while an unsorted array has maximum inversion count.
Formally speaking inversion count = number of pairs i, j such that i < j and a[i] > a[j].

Input
The first line contain integers N.
The second line of the input contains N singly spaces integers.

1 <= N <= 100000
1 <= A[i] <= 1000000000
Output one integer the inversion count.
Example
Sample Input
5
1 1 3 2 2
Sample Output
2

Sample Input
5
5 4 3 2 1
Sample Output
10

with time complexity O(n^2)
*/
package Sorting;

public class InverseCount
{
    public static int inCount(int [] arr, int n)
    {
        int count = 0;
        for (int i =0 ;i<n-1;i++)
        {
            for (int j  = i+1; j<n;j++)
            {
                if(arr[i]>arr[j])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1,20,6,4,5};
        int result = inCount(arr, arr.length);
        System.out.println("Total inverse Count is : "+result);
    }
}
