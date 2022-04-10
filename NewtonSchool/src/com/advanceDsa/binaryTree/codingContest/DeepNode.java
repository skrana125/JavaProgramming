/*
Deep Nodes
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary tree of N nodes, with root 1, find the number of nodes at depth D of the tree for all D from 1 to N,
where depth of root node is taken to be 1.
Input
First line contains the integer N, denoting the number of nodes in the binary tree.
Next N lines contains two integers denoting the left and right child of the i'th node respectively.
If the node doesn't have a left or right child, it is denoted by '-1'

1 <= N <= 100000
Output
Print a single line containing N integers denoting the number of nodes at depth D of the tree.
Example
Sample Input 1:
5
2 4
5 3
-1 -1
-1 -1
-1 -1
Sample output 1:
1 2 2 0 0

Explanation: Given binary tree
1
/ \
2 4
/ \
5 3
*/
package com.advanceDsa.binaryTree.codingContest;

import java.util.*;

class Node{
    public int data;
    public Node left, right;
    public Node(int data)
    {
        this.data = data;
        left = null;
        right= null;
    }
}
public class DeepNode
{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of nodes");
            int n = sc.nextInt();
            Node [] arr = new Node[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = new Node(i+1);
            }
            for(int i=0;i<n;i++)
            {
                int leftNode = sc.nextInt();
                int rightNode= sc.nextInt();

                if(leftNode != -1)
                    arr[i].left = arr[leftNode-1];

                if(rightNode != -1)
                    arr[i].right = arr[rightNode -1];
            }
            ArrayList<Integer>arrayList = new ArrayList<>();
            deepNode(arr, arrayList);
            int len = arrayList.size();

            for(int i=0;i<len;i++)
            {
                System.out.print(arrayList.get(i)+" ");
            }

            for(int i=len;i<n;i++)
            {
                System.out.print(0+" ");
            }
            System.out.println();
    }

    private static void deepNode(Node[] arr, ArrayList<Integer> arrayList)
    {
        Queue<Node> priorityQueue = new LinkedList<>();
        priorityQueue.add(arr[0]);

        while (!priorityQueue.isEmpty())
        {
            int len = priorityQueue.size();
            arrayList.add(len);
            for (int i=0;i<len;i++)
            {
                Node node = priorityQueue.poll();
                assert node != null;
                if (node.left != null)
                    priorityQueue.add(node.left);
                if (node.right != null)
                    priorityQueue.add(node.right);
            }
        }
    }
}
