package Recursion.function;

public class PassingArrayToFunction
{
    static void displayArray(int [] arr)
    {
        System.out.println("Elements of an Array : ");
        for (int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {78,98,100,56,200,60,20,10};
        displayArray(arr);
    }
}
