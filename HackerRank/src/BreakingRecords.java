import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingRecords
{
        public static void main(String [] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of n : ");
            int n = sc.nextInt();
            List<Integer> scores = new ArrayList<>();
            System.out.println("Enter the Scores : ");
            for(int i=0;i<n;i++)
            {
                int j = sc.nextInt();
                scores.add(j);
                System.out.print(scores.get(j)+" ");
            }
            List<Integer> result = Result.breakingRecords(scores);
        }
}

class Result
{
    public static List<Integer>breakingRecords(List<Integer>scores)
    {
        int [] arr = new int[scores.size()];
        int record = 0, worse = 0;
        for(int i=0;i<scores.size();i++)
        {
            arr[i] = scores.get(i);
        }
        for(int i=0;i< scores.size();i++)
        {
            System.out.print("Array is : "+arr[i]);
            if(arr[i]<arr[i+1])
            {
                record++;
            }
            else
            {
                worse++;
            }
        }
        System.out.println("Records : "+record);
        System.out.println("Worse : "+worse);

        return scores;
    }
}
