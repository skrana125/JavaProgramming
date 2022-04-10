package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
public class insertInSingleLinkedList
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an Linked list");
        int n = sc.nextInt();

        LinkedList<Integer> arr = new LinkedList<>();
        System.out.println("Elements of an Link List");
        for(int i=0;i<n;i++)
        {
            arr.add(i);
        }
        printData(arr, n);
    }
    public static void printData(LinkedList<Integer> arr, int n)
    {

    }
}
