package strings;

public class StringConcatenation
{
    public static void main(String[] args) {
        String str1 = "Java is awesome";
        String str2 = " Programming Language";

        System.out.println("String after concatenating : ");
        System.out.println(str1.concat(str2));
        System.out.println("Java :"+123);

        //First here it is concatenated  with 2 nad then it became string, and again it concatenated with 2 to make Four :22
        System.out.println("Four :"+2+2);

        //here first add the value then it is concatenated the value
        System.out.println(2+2+":four");
    }
}
