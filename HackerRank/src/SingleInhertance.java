class A
{
    void shoe()
    {
        System.out.println("I need number 9 size Shoe");
    }
    void eat()
    {
        System.out.println("This is the function of Super class");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("This is child class of A");
    }
}

public class SingleInhertance
{
    public static void main(String [] args)
    {
        B obj = new B();
        obj.show();
        obj.eat();
    }
}
