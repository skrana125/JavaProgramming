package com.advanceDsa;

import java.util.Scanner;

public class PostOrder
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of tree : ");
        int n = sc.nextInt();

        Node[] tree = new Node[n];
        for (int i=0;i<n;i++)
        {
            tree[i] = new Node(i+1);
        }

        for (int i=0;i<n;i++)
        {
            int leftNode = sc.nextInt();
            int rightNode= sc.nextInt();

            if(leftNode != -1)
            {
                tree[i].left = tree[leftNode -1];
            }
            if(rightNode != -1)
            {
                tree[i].right = tree[rightNode -1];
            }
        }
        System.out.println("PostOder Traversal : ");
        postOrder(tree[0]);

        System.out.println();

        System.out.println("InOrder traversal :");
        inOrder(tree[0]);

        System.out.println();

        System.out.println("PreOrder Traversal : ");
        preOrder(tree[0]);

    }
    private static void postOrder(Node root)
    {
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    private  static  void inOrder(Node root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    private static void preOrder(Node root)
    {
        if(root == null)
            return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
