package linkedList;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
       /* list.push(3);
        list.push(2);
        list.push(2);
        list.push(1);
        list.push(1);
        list.push(null);*/

        for (int i=0;i<n;i++)
        {
            list.push(i);
        }
        System.out.println("Before deletion :");
        printList();

    }
    static Node head;
    static void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
