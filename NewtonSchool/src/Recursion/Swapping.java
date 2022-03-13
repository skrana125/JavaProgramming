package Recursion;

public class Swapping
{
    static void swap(int n, int m)
    {
        System.out.println("Before Swapping in swap().\n"+"Value of n is : "+n+"\nValue of m is :"+m+"\n");
        n = n+m;
        m = n-m;
        n = n-m;
        System.out.println("After Swapping in swap(). \n"+"Value of n is : "+n+"\nValue of m is : "+m+"\n");
    }

    public static void main(String[] args) {
        int n = 19;
        int m = 50;

        System.out.println("Before calling swap().\n"+"First number is : "+n+"\nSecond number is : "+m+"\n");
        swap(n,m);
        System.out.println("After Calling swap().\n"+"Fist number is : "+n+"\nSecond number is : "+m+"\n");
    }
}
