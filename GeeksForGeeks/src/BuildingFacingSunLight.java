import java.util.Scanner;

public class BuildingFacingSunLight
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total number od buildings ; ");
        int n = sc.nextInt();

        int [] buildings = new int[n];
        System.out.println("Each building heights : ");
        for (int i=0;i<n;i++)
        {
            buildings[i] = sc.nextInt();
        }
        int count  = 1;
        int max = buildings[0];

        for (int i=1;i<n;i++)
        {
            if(buildings[i]>max || buildings[i]==max)
            {
                count++;
                max = buildings[i];
            }
        }
        System.out.println("Number of  building facing Sunlight is : "+count);
    }
}
