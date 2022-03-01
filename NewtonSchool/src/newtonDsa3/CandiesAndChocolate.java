package newtonDsa3;

import java.util.Scanner;

public class CandiesAndChocolate
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String which contain only M and F : ");
        String str = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(str.length());
        int count = 0;
        int times = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='F') {
                if(i-count<=times && times!=0)
                    times++;
                else
                    times = i-count;

                count++;
            }
        }
        System.out.println(times);
    }
}
