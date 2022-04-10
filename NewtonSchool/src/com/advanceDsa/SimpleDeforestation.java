package com.advanceDsa;

import java.util.Scanner;

public class SimpleDeforestation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes in tree : ");
        int n = sc.nextInt();

        System.out.println("Number of subtree after the removal  of edges : ");
        int m = sc.nextInt();

        int count = 0;

        for(int i=1;i<=n;i++)
        {
            count++;
        }
        System.out.println("Number of subtree are :"+count);

        //Total number of nodes remove will always be total number of subtree - 1
        int edges = count-1;
        System.out.println("Total number oi=f edges is : "+edges);
    }
}
