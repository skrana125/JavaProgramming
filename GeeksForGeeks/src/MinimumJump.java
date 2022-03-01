/* Find the minimum number of jump to reach last element of an array
* ex input
* n = 11
* arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
* output = 3
* explanation : - start from index 0 i.e. element arr[0]=1, it's 1 jump which reach to element 3.
* THen again it takes 3 jump which reach to element 9 again after 9 jump it reach to element last.
* So total jump is 3.
*
* input 2;
* n = 6
* arr[] = {1, 4, 3, 2, 6, 7}
* output = 2;
 * */
import java.util.Scanner;
public class MinimumJump
{
    static int minJump(int [] arr, int n)
    {
        int jump = 1;

        if(n<=1)
            return 0;
        //check if value of array is zero or not which tell possibility of jump
        if(arr[0]==0)
            return -1;

        int maxCount = arr[0];
        int step = arr[0];

        //start traversing the Array
        for (int i=1;i<n;i++)
        {
            if(i==n-1)
                return jump;

            //updating maxCount
            maxCount = Math.max(maxCount,arr[i]+1);
            //use step to get current index
            step--;

            //if no step is left
            if(step==0)
            {
                //must-use jump for count
                jump++;

                //check if the current index/position is maximum reach point from previous index
                if(i>=maxCount)
                    return -1;
                //re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxCount-i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an Array : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter element of an Array : ");
        for (int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(minJump(arr,n));
    }
}
