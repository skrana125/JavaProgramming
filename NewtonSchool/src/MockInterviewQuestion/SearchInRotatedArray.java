/* There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1

Constraints:
1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
*/


package MockInterviewQuestion;

import java.util.Scanner;

public class SearchInRotatedArray
{
    static int findPivot(int [] arr, int target)
    {
        int pivot=0;
        int n = arr.length;
        int i=0;

        // finding the pivot index from the array if the both the condition is true
        while (i<n-1 && arr[i] < arr[i+1])
        {
            pivot++;
            i++;
            System.out.println("Pivot element index is : "+pivot);
        }
        System.out.println("Final Pivot Element index is : "+pivot);
        System.out.println("Pivot element is : "+arr[pivot]);


        int ans=binarySearch(arr,target,0,pivot);
        System.out.println("Answer is : "+ans);
        //it's check if the value of answer is -1 0r not if it true then it returns the answer
        if(ans!=-1){
            return ans;
        }
        //ans=binarySearch(arr,target,pivot+1,arr.length-1);
        return binarySearch(arr, target, pivot+1,n-1);
    }
    static int binarySearch(int [] arr, int target, int low, int high)
    {
        while (high>=low)
        {
            int mid = (low+high)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the elements of an Array : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = scanner.nextInt();

        int result = findPivot(arr,target);
        System.out.println(result);
    }
}
