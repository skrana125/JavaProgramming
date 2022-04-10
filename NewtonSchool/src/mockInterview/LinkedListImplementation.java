package mockInterview;

import java.util.LinkedList;

class Node
{
    public int data;
    public Node next;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}
public class LinkedListImplementation
{
    Node head = null;
    public static LinkedListImplementation insert(LinkedListImplementation list, int data)
    {
        Node node = new Node(data);
        node.next = null;
        return null;
    }
    public static void main(String[] args) {

    }
}
