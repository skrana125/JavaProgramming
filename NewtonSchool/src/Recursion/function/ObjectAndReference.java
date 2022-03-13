package Recursion.function;


class Test {
    int num = 10;
}
public class ObjectAndReference
{
    public static void main(String[] args) {
        //obj is what we are creating a variable of class Test i.e.the reference variable
        // new Test() Allocate the memory to the obj. and address can be anything
        Test obj = new Test();
        obj.num = 10;

        System.out.println("Value of obj.num is : "+obj.num);

        Test ref;
        ref = obj;
        ref.num = 200;
        System.out.println();
        System.out.println("Value of obj.num after reference : "+obj.num);
    }
}
