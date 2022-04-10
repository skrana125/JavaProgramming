package com.advanceDsa.binaryTree;

import java.util.Stack;

public class BinaryTreeOperationUsingIterativeWay
{
    public static void main(String[] args) {
        Node root = getTree();

        System.out.println("PreOrder iterative Traversal : ");
        iterativePreOrder(root);
        System.out.println();

        System.out.println("InOrder iterative Traversal : ");
        iterativeInOrder(root);
    }

    private static void iterativeInOrder(Node root)
    {
        if(root == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node node = root;

        while (true)
        {
            if(node != null)
            {
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty())
                    break;
                else{
                    node = stack.pop();
                    System.out.print(node.data+" ");
                    node = node.right;
                }
            }
        }
    }

    private static void iterativePreOrder(Node root)
    {
        if (root == null)
            return;
        Stack<Node>stack = new Stack<>();
        stack.push(root);

        while (!stack.empty())
        {
            Node node = stack.pop();
            System.out.print(node.data+" ");

            if(node.right != null)
                stack.push(node.right);

            if(node.left != null)
                stack.push(node.left);
        }
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
