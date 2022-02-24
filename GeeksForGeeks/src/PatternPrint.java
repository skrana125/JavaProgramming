import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* print the pattern 16 11 6 1 -4 1 6 11 16 without using loop*/
public class PatternPrint
{
   /* static void printPattern(int n)
    {
        if(n<=0)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printPattern(n-5);
        System.out.print(n+" ");
    }*/
    static List<Integer> Pattern(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        int current = n;
        boolean flag = false;
      do
       {
           if(current>0 && !flag)
           {
                list.add(current-5);
                current = current-5;
           }
           else
           {
               list.add(current+5);
               current = current+5;
               flag = true;
           }
       }while (current!=n);
       return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vale of n : ");
        int n = scanner.nextInt();
        System.out.print(Pattern(n)+" ");
    }
}
