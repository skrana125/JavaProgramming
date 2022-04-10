public class TryCatchDemo
{
    public static void main(String[] args) {
        int a = 10;
        try{
            a = a/0;
        }
        catch (ArithmeticException ar)
        {
            System.out.println(ar);
        }
    }
}
