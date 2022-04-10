package MockInterviewQuestion;

import java.util.Scanner;
import java.util.Stack;

public class MaxString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.next();

        System.out.println(maxString(str));
    }

    public static int maxString(String str)
    {
        if(str.length() <=1)
            return 0;

        // creating a stack and push to index -1 as initial index
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int result = 0;
        for (int i=0;i<str.length();i++)
        {

            if(str.charAt(i)=='(')
            {
                stack.push(i);
            }
            else{
                if(!stack.empty())
                    stack.pop();

                if(!stack.empty())
                {
                    result = Math.max(result, i-stack.peek());
                }
                else{
                    stack.push(i);
                }
            }
        }
        return result;
    }
}
