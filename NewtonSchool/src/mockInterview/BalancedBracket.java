package mockInterview;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket
{
    static boolean isBalanced(String str)
    {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(')
            {
                stack.push(ch);
                continue;
            }

            if(stack.isEmpty())
                return false;

            char string;
            switch(ch)
            {
                case ')':
                    string = stack.pop();
                    if(string == '{' || string =='[')
                        return false;
                    break;
                case '}':
                    string = stack.pop();
                    if(string == '(' || string =='[')
                        return false;
                    break;
                case ']':
                    string = stack.pop();
                    if(string == '(' || string=='{')
                        return false;
                    break;
            }
        }
        return(stack.isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isBalanced(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
