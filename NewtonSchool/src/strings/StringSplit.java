package strings;

public class StringSplit
{
    public static void main(String[] args) {

        String str1 = "boo:add:foo";
        String str2 = "boo:add:foo";
        String str3 = "Java is awesome programming language";
        methodSplit(str1, str2, str3);
    }
    public static void methodSplit(String str1, String str2, String str3)
    {
        String [] arr1 = str1.split(":");
        String [] arr2 = str2.split("o");

        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("=================");
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
        System.out.println("====================");
        //finding the length of each word in an array
        System.out.println("Length iof each word in an Array : ");
        int length = 0;
        for (int i=0;i< arr1.length;i++)
        {
            length = arr1[i].length();
            System.out.println("Length of String at "+i+" is "+ length);
        }

        System.out.println("=====================");
        int length2 = 0;
        for (int i=0;i< arr2.length;i++)
        {
            length2 = arr2[i].length();
            System.out.println("Length of String at "+i+" is "+ length2);
        }

        System.out.println("========================");
        String [] arr3 = str3.split(" ");
        int length3 = str3.length()-(arr3.length-1);
        System.out.println("length of a string one is "+ length3);

    }
}
