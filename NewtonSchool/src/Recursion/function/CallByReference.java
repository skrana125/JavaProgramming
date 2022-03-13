package Recursion.function;

class Numbers{
    int num1;
    int num2;
}
public class CallByReference
{
    static void swap(Numbers swapNumber)
    {
        int temp = swapNumber.num1;
        swapNumber.num1 = swapNumber.num2;
        swapNumber.num2 = temp;
    }
    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        numbers.num1 = 19;
        numbers.num2 = 48;

        System.out.println("\nBefore Swapping : \n"+"Value of numbers.num1 = "+numbers.num1+"\nValue of number.num2 = "+numbers.num2+"\n");
        swap(numbers);
        System.out.println("After Swapping : \n"+"Value of numbers.num1 = "+numbers.num1+"\nValue of number.num2 = "+numbers.num2);

    }
}
