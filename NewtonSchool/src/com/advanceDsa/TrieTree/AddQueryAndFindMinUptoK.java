package com.advanceDsa.TrieTree;

import java.util.Scanner;

class TrieNode {
    public TrieNode[] arr = new TrieNode[2];
    public boolean isNumber;
    public int data;

    public TrieNode() {
        isNumber = false;
        data = 0;
        for (int i = 0; i < 2; i++) {
            arr[i] = null;
        }
    }
}

public class AddQueryAndFindMinUptoK
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of query");
        int q = sc.nextInt();
        int [] arr;
        for (int i=0;i<q;i++)
        {
            System.out.println("Enter the QueryTye : ");
            int queryType = sc.nextInt();
            if(queryType == 1)
            {
                System.out.println("Value to be enter in an Array : ");
                int a = sc.nextInt();
                insert(a);
            }
            else
            {
                int b = sc.nextInt();
            }
        }
    }
    static  TrieNode root;
    public static void insert(int a)
    {
       TrieNode temp = root;

       for(int i=0;i<32;i++)
        {
            int val = (a &(1<<i))>=1 ?1:0;
            if(temp.arr[val] == null)
                temp.arr[val] = new TrieNode();

            temp = temp.arr[val];
        }
       temp.data = a;
    }
}
