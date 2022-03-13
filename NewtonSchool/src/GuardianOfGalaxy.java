import java.util.Scanner;

public class GuardianOfGalaxy
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of building : ");
        int n = scanner.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the height of buildings : ");
        for (int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        boolean found = false;
        int initialThrust = 0;
        int gamoraThrust = arr[0];
        System.out.println("Gamora Thrust is : "+(gamoraThrust));
        int newThrust  = 0;
        int count = 0;
        for(int i =0;i<n;i++)
        {
            if(gamoraThrust<arr[i])
            {
                newThrust = gamoraThrust-(arr[i]-gamoraThrust);
                System.out.print("\n1. New Thrust : "+newThrust+"\n");
                gamoraThrust = newThrust;
                System.out.println("1.Gamora Thrust : "+gamoraThrust);
            }
            else
            {
                newThrust = gamoraThrust+(gamoraThrust-arr[i]);
                System.out.print("2. New Thrust : "+newThrust+"\n");
                gamoraThrust = newThrust;
                System.out.println("2.Gamora Thrust : "+gamoraThrust);
            }
            count++;

            if(newThrust==0)
            {
                break;
            }
        }
        System.out.println("Thrust : "+newThrust+"\nTotal count is : "+count);


    }
}
