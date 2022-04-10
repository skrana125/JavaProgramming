/*
COVID Treatment
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N COVID centres on the X- axis. Their positions are X1, X2,... , XN.
You are standing at the origin O (x = 0) with N sick people.
You have to drive each of these to one of the N covid centres such that no two people
reach the same centre and each centre receives exactly one patient.

You can use your car to take these people to the hospital but your car can carry only K patients at a time.
Find the minimum distance you will have to drive in order to accomplish this task.
Note: After driving all the N people to their respective COVID centres, you do not have to go back to the origin.
Input
The first line contains two integers N, the number of centres and people and K, the capacity of your car.
The second line contains N integers X1, X2,... , XN. It is possible that more than one COVID centres lie on the same
point.

Constraints:
1 <= K <= N <= 105
-109 <= Xi <= 109
Output
Print the minimum distance you will have to drive in order to deliver the N patients to the N covid centres.
Example
Sample Input:
5 1
1 2 3 4 5

Sample Output:
25

Sample Input:
5 3
3 3 4 4 4

Sample Output:
10

Explanation Sample1:
You can drive only 1 patient at a time in your car, so here is how you can go:-
0 -> 1 -> 0 -> 2 -> 0 -> 3 -> 0 -> 4 -> 0 -> 5
You drive one by one to the four centres at x = 1, 2, 3, 4. and
then you drive the 5th patient to the last centre at x = 5 and stop there.
So, the total distance becomes 2 * (1 + 2 + 3 + 4) + 5 = 25
It can be proved that their exists no shorter way of doing so.
*/
package com.advanceDsa.binaryTree.codingContest;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CovidTreatment
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Center : ");
        int n = sc.nextInt();
        System.out.println("Capacity of car : ");
        int k = sc.nextInt();

        System.out.println("Position of Hospital : ");
        int [] arr = new int[n];
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();


            if(arr[i]>0)
            {
                arrayList1.add(arr[i]);
            }
            else
            {
                arrayList2.add((-1)*arr[i]);
            }
        }

        Collections.sort(arrayList1);
        Collections.sort(arrayList2);

        int minDistance = 0;
        minDistance += treatment(arrayList1, k);
        minDistance += treatment(arrayList2, k);

        if(arrayList1.size()>0 && arrayList2.size()>0)
        {
            minDistance += Math.min(arrayList1.get(arrayList1.size()-1),arrayList2.get(arrayList2.size()-1));
        }

        System.out.println("Minimum Distance need to cover is : "+minDistance);
    }

    private static int treatment(ArrayList<Integer> arrayList, int k)
    {
        int minDis = 0;
        int n = arrayList.size();

        int num = n;
        for (int i=0;i<n;i++)
        {
            int x = num/k;
            int y = num%k;
            if(i == 0)
            {
                if(y==0)
                {
                    minDis += (x-1)*arrayList.get(i);
                    minDis += arrayList.get(i);
                }
                else
                {
                    minDis += x*arrayList.get(i);
                    minDis += arrayList.get(i);
                }
            }
            else
            {
                if(y==0)
                {
                    minDis += (x-1)*(arrayList.get(i)-arrayList.get(i-1));
                    minDis += arrayList.get(i);
                }
                else
                {
                    minDis += (x)*(arrayList.get(i)-arrayList.get(i-1));
                    minDis += arrayList.get(i);
                }
            }
            num = -1;
        }
        return minDis;
    }
}
