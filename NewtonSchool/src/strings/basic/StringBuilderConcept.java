package strings.basic;

public class StringBuilderConcept
{
    public static void main(String[] args) {
        StringBuilder sbr = new StringBuilder();
        sbr.append("Sumit");
        sbr.append(" Kumar");

        sbr.setCharAt(10,'R');

        String str = sbr.toString();
        System.out.println(str);
    }
}
