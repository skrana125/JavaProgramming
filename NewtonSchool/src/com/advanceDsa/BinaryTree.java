package com.advanceDsa;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node
{
    public int data;
    public Node left;
    public Node right;
    public int leftN;
    public int rightN;

    public Node(int data)
    {
        this.data =  data;
    }
}
public class BinaryTree {
    Node root;

    BinaryTree()
    {
        root = null;
    }

    static void preOrder(Node root)
    {
        if(root == null)
            return;

        System.out.print("   "+root.data+" ");

        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root)
    {
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print("   "+root.data+" ");
    }

    static void inOrder(Node root)
    {
        if(root ==  null)
            return;

        inOrder(root.left);
        System.out.print("   "+root.data+" ");
        inOrder(root.right);
    }

    private static void iterativePreOrder(Node root)
    {
        if(root == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node curr;

        while (!stack.isEmpty())
        {
            curr = stack.pop();
            System.out.print("   "+curr.data+" ");

            if(curr.right!=null)
            {
                stack.push(curr.right);
            }
            if(curr.left !=null)
            {
                stack.push(curr.left);
            }
        }
    }

    private static void iterativeInOrder(Node root)
    {
        if(root == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (true)
        {
            if(curr!=null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                if (stack.isEmpty())
                {
                    break;
                }
                curr = stack.pop();
                System.out.print("   "+curr.data+" ");
                curr = curr.right;
            }
        }
    }

    private static void iterativePostOrder(Node root)
    {
        Node curr = root;
        Stack<Node> stack = new Stack<>();

        while(!stack.isEmpty() || curr != null) {
            if(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                Node temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    System.out.print("   "+temp.data+" ");
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print("   "+temp.data+" ");
                    }
                }
                else {
                    curr = temp;
                }
            }

        }
    }

    private static void levelOrder(Node root)
    {
        if(root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty())
        {
            Node node = queue.remove();
            if(node == null)
            {
                System.out.println();
                if(!queue.isEmpty())
                {
                    queue.add(null);
                }
                continue;
            }
            if(node.left != null)
            {
                queue.add(node.left);
            }
            if(node.right != null)
            {
                queue.add(node.right);
            }
            System.out.print("   "+node.data+"");
        }
    }

    public static int heightOfTree(Node root)
    {
        if(root == null)
            return 0;

        return Math.max(heightOfTree(root.left), heightOfTree(root.right))+1;
    }

    private static int countLeaveNode(Node root)
    {
        if(root == null)
            return 0;
        if(root.left == null && root.right==null)
            return 1;
        int leafLeft = countLeaveNode(root.left);
        int leafRight= countLeaveNode(root.right);

        return leafLeft+leafRight;
    }

    public static Node getTree()
    {
        Node root = new Node(1);
        Node node1 =  new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        Node node7 = new Node(8);
        Node node8 = new Node(9);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right= node4;

        node2.left = node5;
        node2.right = node6;

        node3.left = node7;
        node3.right= node8;

        return root;
    }

    public static void main(String[] args) {
        Node root = getTree();
        System.out.println("1.)PreOrder Traversal using recursion : ");
        preOrder(root);
        System.out.println();

        System.out.println("2.)PostOrder Traversal using recursion : ");
        postOrder(root);
        System.out.println();

        System.out.println("4.)InOrder Traversal using recursion :");
        inOrder(root);
        System.out.println();

        System.out.println("5.)PreOrder Traversal using Iterative Way : ");
        iterativePreOrder(root);
        System.out.println();

        System.out.println("6.)InOrder Traversal using Iterative way :");
        iterativeInOrder(root);
        System.out.println();

        System.out.println("7.)PostOrder Traversal using Iterative way : ");
        iterativePostOrder(root);
        System.out.println();

        System.out.println("8.)LevelOder Traversal : ");
        levelOrder(root);

        System.out.println("9.)Height of the tree");
        System.out.println("   "+heightOfTree(root));

        System.out.println("10.)Total Leaves node in tree : ");
        System.out.println("   "+countLeaveNode(root));
    }
}
