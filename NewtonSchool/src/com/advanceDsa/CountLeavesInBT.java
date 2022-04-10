/*
Problem Statement
Given a binary tree, count the number of leaves in it. A node having no child node is called a leaf.
Input
The first line contains the integer N, denoting the number of nodes in the binary tree.
Next N lines contain two integers, denoting the left and right child of the i-th node respectively.
If the node doesn't have a left or right child, it is denoted by '-1'

1 <= N <= 100000
Output
Print the number of leaves in the binary tree
Example
Sample Input 1:
7
2 4
5 3
-1 -1
-1 7
6 -1
-1 -1
-1 -1

Sample output 1:
3
Explanation: Given binary tree
      1
     / \
    2   4
   / \   \
  5   3   7
 /
6
Node 3, 6, 7 are the leaves here
 */
package com.advanceDsa;


import java.util.Scanner;

public class CountLeavesInBT
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an Tree ");
        int n= sc.nextInt();

        //creating an Array of node
        System.out.println("Insert the value in Node Array :");
        Node[] arr = new Node[n];
        for (int i = 0; i<n; i++)
        {
            arr[i] = new Node(i+1);
        }

        for (int i=0;i<n;i++) {
            int leftNode = sc.nextInt();
            int rightNode = sc.nextInt();

            if (leftNode != -1 && rightNode != -1) {
                arr[i].left = arr[leftNode - 1];
                arr[i].right = arr[rightNode - 1];
            }
        }
        System.out.println("Total number of Leave node in Binary Tree is : "+countLeaves(arr[0]));
    }

    public static int countLeaves(Node root)
    {
        if(root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        int leftSide = countLeaves(root.left);
        int rightSide= countLeaves(root.right);

        return leftSide+rightSide;
    }
}
