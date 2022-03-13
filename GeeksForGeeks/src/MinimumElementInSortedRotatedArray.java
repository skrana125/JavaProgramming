/* A sorted Array is rotated at some unknown point find the minimum element in it.
* It's assumes that all the elements are distinct
* Example 1:
* input : {5,6,1,2,3,4}
* output : 1
*
* Example 2 :
* input : {1,2,3,4}
* output : 1
*
* Example 3:
* input: {2,1}
* output : 1 */

public class MinimumElementInSortedRotatedArray
{
    static int findMinimum(int [] arr, int n)
    {
        int low = 0;
        int high = n-1;
        while (high>low)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==arr[high])
                high --;
            else if(arr[mid]>arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[high];
    }

    public static void main(String[] args) {
        int [] arr = {5,6,1,2,3,4};
        int [] arr2 = {2,3,4,5,6,7,8,1};
        int [] nums = {7,8,9,3,4,5,6};
        System.out.println("Minimum in first array : "+findMinimum(arr,arr.length));
        System.out.println("Minimum in second array : "+findMinimum(arr2,arr2.length));
        System.out.println("Minimum in third array : "+findMinimum(nums,nums.length));

    }
}
