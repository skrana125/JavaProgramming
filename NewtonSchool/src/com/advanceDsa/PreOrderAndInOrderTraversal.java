package com.advanceDsa;

import java.util.Scanner;



public class PreOrderAndInOrderTraversal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Tree : ");
        int n = sc.nextInt();

        Node [] arr = new Node[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = new Node(i+1);
        }
        for(int i=0;i<n;i++)
        {
            int leftNode = sc.nextInt();
            int rightNode= sc.nextInt();

            if(leftNode != -1)
            {
                arr[i].left = arr[leftNode - 1];
            }
            if(rightNode != -1)
            {
                arr[i].right = arr[rightNode - 1];
            }
        }
        System.out.println("PostOrder Traversal is  :");
        postOrder(arr[0]);
        System.out.println();
        System.out.println("InOrder Traversal is : ");
        inOrder(arr[0]);
        System.out.println();
        System.out.println("PreOrder Traversal is  :");
        preOrder(arr[0]);

    }
    public static void postOrder(Node root)
    {
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" "+root.data);
    }

    public static void inOrder(Node root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(" "+root.data);
        inOrder(root.right);
    }

    public static void preOrder(Node root)
    {
        if (root == null)
            return;
        System.out.print(" "+root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}
