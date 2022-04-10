/* geeks for geeks  find the maximum occurance word on a string*/

import java.util.ArrayList;
import java.util.Scanner;

public class Sample
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> str = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            str.add(sc.next());
        }

        int count  = 0;
        for (int i=0;i<n-1;i++)
        {
            if(str.get(i).equals(str.get(i+1)))
                count++;

            System.out.println("Total count of"+str.get(i)+" is "+ count);
        }
    }
}
