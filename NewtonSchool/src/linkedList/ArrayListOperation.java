package linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an ArrayList");
        int n = sc.nextInt();

        System.out.println("Adding List in ArrayList :");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            arrayList.add(i);
        }
        operationInsert(arrayList, sc);
        operationSearch(arrayList);
        operationSort(arrayList);
    }

    private static void operationSearch(ArrayList<Integer> arrayList) {

    }

    private static void operationSort(ArrayList<Integer> arrayList) {
    }

    private static void operationInsert(ArrayList<Integer> arrayList, Scanner sc) {
        int n = 4;
        int [] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            arrayList.add(arr[i]);
        }

    }
}
