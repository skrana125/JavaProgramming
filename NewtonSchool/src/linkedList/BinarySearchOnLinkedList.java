package linkedList;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data = data;
        next = null;
    }

}
public class BinarySearchOnLinkedList
{
    //function to insert a node at the beginning of the singly linked list
    static ListNode push(ListNode head, int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        return head;
    }

    //function to find the muddle element using fast and slow pointer
    static ListNode middleNode(ListNode start, ListNode end)
    {
        if(start == null)
            return null;

        ListNode slow = start;
        ListNode fast = start.next;

        while (fast != end)
        {
            fast = fast.next;
            if(fast != end)
            {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    //function to insert a node at the beginning of the singly linked list
    static ListNode binarySearch(ListNode head, int value){
        ListNode start =  head;
        ListNode last = null;

        do{
            ListNode mid = middleNode(start, last);

            if(mid == null)
                return null;
            if(mid.data == value)
                return mid;
            else if (mid.data > value)
                start = mid.next;
            else
                last = mid;
        }while (last == null || last != start);
        return null;
    }
    public static void main(String[] args) {
        ListNode head = null;

        //using push function to into singly linked list
        head = push(head,1);
        head = push(head,4);
        head = push(head,7);
        head = push(head,8);
        head = push(head,9);
        head = push(head,10);
        head = push(head,12);
        head = push(head,14);

        int value = 7;
        if(binarySearch(head, value)==null)
            System.out.println("Value is not present");
        else
            System.out.println("Value is Present");
    }
}
