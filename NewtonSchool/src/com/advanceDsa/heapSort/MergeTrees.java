/*
Merge Trees (Contest)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given N nodes and M undirected edges. These nodes and edges represent some trees (graphs with no loops).
Now, your task is to merge the trees into a single tree. In one operation of merging,
two disconnected trees are merged using an edge from one tree to the other tree.
The cost of this merging operation is total number of nodes in the final merged tree.
Once merged the trees lose their original existence.
So, if there are T trees in the original state, you'll have to perform the merge operation
T-1 times to merge all the trees in a single tree.

All you need to do is find the minimum cost of merging the trees (sum of costs of all T-1 merge operations).
See sample for better understanding.
Input
The first line of input contains two integers N and M, the total number of nodes and the total number of edges.
The next M lines contain two integers U and V, representing an undirected edge between the two nodes.

Constraints
1 <= N <= 200000
0 <= M < N
1 <= U, V <= N
The given nodes and edges represent some trees (maybe 1)
Output :
Output a single integer, the cost of merging these trees.
Example
Sample Input
7 3
1 2
3 4
4 5

Sample Output
13

Explanation:
The four trees are as follows:
1 --- 2 ; 3 --- 4 --- 5 ; 6 ; 7
We will first add an edge from 6 to 7. (Cost of merging = 2)
The three remaining trees are as follows:
1 --- 2 ; 3 --- 4 --- 5 ; 6 --- 7
We will add an edge from 2 to 6. (Cost of merging = 4)
The two remaining trees are as follows:
1 --- 2 --- 6 --- 7 ; 3 --- 4 --- 5
We will add an edge from 7 to 3. (Cost of merging = 7)
Total cost of merging = 2 + 4 + 7 = 13.

Sample Input
2 1
1 2

Sample Output
0
*/
package com.advanceDsa.heapSort;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MergeTrees
{
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Number of nodes and Undirected edges : ");
        String[] str = bufferedReader.readLine().trim().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int [] arr = new int[n+1];
        for (int i=1;i<=n;i++)
        {
            arr[i] = i;
            find(arr, i);
        }
        for (int i=0;i<m;i++)
        {
            // U nad V represent the edges between two nodes
            System.out.println("Representation between two nodes are :");
            String[] str1 = bufferedReader.readLine().trim().split(" ");
            int u = Integer.parseInt(str1[0]);
            int v = Integer.parseInt(str1[1]);
            union(arr, u, v);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        HashMap<Integer, Integer> hashMap =  new HashMap<>();

        for (int i=1;i<=n;i++)
        {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> map: hashMap.entrySet())
        {
            priorityQueue.add(map.getValue());
        }

        int mergeCost = 0;
        while (priorityQueue.size()>1)
        {
            int uCost = priorityQueue.poll();
            int vCost = priorityQueue.poll();

            mergeCost += (uCost + vCost);
            priorityQueue.add(uCost+vCost);
        }

        System.out.println("Total cost of Merging tree is : "+mergeCost);

     }

    private static int find(int[] arr, int i)
    {
        if(arr[i] == i)
            return i;

        arr[i] = find(arr, arr[i]);
        return arr[i];
    }

    private static void union(int [] arr, int u, int v)
    {
        int parentU = find(arr, u);
        int parentV = find(arr, v);

        arr[parentV] = parentU;
    }
}
