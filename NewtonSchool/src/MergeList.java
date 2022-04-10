import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}

public class MergeList
{
    public  Node func(Node list1, Node list2) {

        //base case
            if(list1 == null)
                return list2;
            if(list2 == null)
                return list1;

            Node result;
            if(list1.val <= list2.val)
            {
                result = list1;
                result.next = func(list1.next, list2);
            }
            else{
                result = list2;
                result.next = func(list1, list2.next);
            }

            return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node a = null;
        Node b = null;

    }
}
