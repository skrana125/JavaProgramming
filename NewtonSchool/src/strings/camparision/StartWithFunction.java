//
package strings.camparision;

public class StartWithFunction {

    public static void main(String[] args) {
        String str1 = "Java is awesome programming language.";
        String str2 = "Java";
        String str3 = "Python";
        String str4 = "java";

        boolean result1 = str1.startsWith(str2);
        boolean result2 = str1.startsWith(str3);
        boolean result3 = str1.startsWith(str4);

        System.out.println("Result1 : "+result1 + ", Result2 : "+result2+ ", Result3 :"+result3);
    }
}
