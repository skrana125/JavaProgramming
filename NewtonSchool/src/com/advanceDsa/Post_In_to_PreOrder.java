/* Problem Statement
Given inorder and postorder traversals of a Binary Tree. The task is to construct the binary tree from these traversals. It is given that 1 is the root of the tree.
Input
The first line of input contains a single integer N, denoting the number of nodes in the tree. The next line contains N integers denoting the inorder traversal of the tree. The next line contains N integers denoting the postorder traversal of the tree.

Constraints
1 <= N <= 100000
Output
Print the preorder traversal of the given tree.
Example
Sample Input 1:
8
4 8 2 5 1 6 3 7
8 4 5 2 6 7 3 1

Sample Output 1:
1 2 4 8 5 3 6 7

Explanation:
For the given inorder and postorder traversal, the resultant binary tree will be
1
/ \
2 3
/ \ / \
4 5 6 7
\
8

Sample Input 2:
5
9 5 2 3 4
5 9 3 4 2

Sample Output 2:
2 9 5 4 3

Explanation:
For the given inorder and postorder traversal, the resultant binary tree will be
2
/ \
9 4
\ /
5 3

 */

package com.advanceDsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Post_In_to_PreOrder
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Tree : ");
        int n = sc.nextInt();

        int [] inOrder =  new int[n];
        int [] postOrder = new int[n];

        System.out.println("Enter the InOrder of tree");
        for(int i = 0;i<n;i++) {
            inOrder[i] = sc.nextInt();
        }
        System.out.println("Enter the PostOrder of tree");
        for(int i = 0;i<n;i++) {
            postOrder[i] = sc.nextInt();
        }

        Node root = buildTree(inOrder, postOrder,n);
        preOrder(root);
    }

    private static void preOrder(Node root)
    {
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static Node buildTree(int [] inOrder, int [] postOrder, int n)
    {
        if(n==0)
            return null;

        return tree(inOrder,postOrder,0,n-1,0,n-1);
    }

    private static Node tree(int [] inOrder, int [] postOrder, int inStart, int inEnd,int postStart,int postEnd )
    {
        if(inStart > inEnd)
            return null;

        Node node = new Node(postOrder[postEnd]);
        int currentNodeInOrder = search(inOrder,inStart, inEnd, postOrder[postEnd]);

        node.left = tree(inOrder, postOrder,inStart, currentNodeInOrder-1,postStart,postStart-inStart+currentNodeInOrder-1);
        node.right= tree(inOrder, postOrder,currentNodeInOrder+1,inEnd,postEnd-inEnd+currentNodeInOrder,postEnd-1);

        return node;
    }

    private static int search(int [] inOrder,int Start, int End, int element)
    {
        for (int i= Start; i< End;i++)
        {
            if(inOrder[i] == element)
                return i;
        }
        return -1;
    }

}
