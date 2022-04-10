package com.advanceDsa.binaryTree;

class Node{
    int data;
    Node left, right;

    public Node(int data)
    {
        this.data = data;
        left =  null;
        right = null;
    }
}
public class BinaryTreeOperation
{
    public static void main(String[] args) {
        Node root = getTree();
        System.out.println("PreOrder - Printing the PreOrder using recursion");
        preOrder(root);

        System.out.println();
        System.out.println("InOrder - Printing the InOrder using recursion");
        inOrder(root);

        System.out.println();
        System.out.println("PostOrder - Printing the PostOrder using recursion");
        postOrder(root);
    }

    private static void preOrder(Node root)
    {
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Node root)
    {
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    private static void postOrder(Node root)
    {
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }


    public static Node getTree()
    {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        Node node7 = new Node(8);
        Node node8 = new Node(9);

        node.left = node1;
        node.right = node2;

        node1.left = node3;
        node1.right= node4;

        node2.left = node5;
        node2.right= node6;

        node3.left = node7;
        node3.right= node8;

        return node;
    }
}

