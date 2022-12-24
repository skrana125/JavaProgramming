package Sorting;

import java.util.Scanner;

public class Demo
{
    public static void main (String[] args) {

        Scanner inputTaker=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = inputTaker.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of an Array  : ");
        for(int i=0;i<n;i++){
            arr[i]=inputTaker.nextInt();
        }

        int[] lefMin = new int[n];
        lefMin[0]=arr[0];
        System.out.println("Minimum Value : ");
        for(int i=1;i<n;i++){
            lefMin[i]=Math.min(arr[i],lefMin[i-1]);
            System.out.print(lefMin[i]+" ");
        }
        System.out.println();

        int[] rightMax = new int[n];
        rightMax[n-1]=arr[n-1];
        System.out.println("Maximum value : ");
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
            System.out.print(rightMax[i]+" ");
        }
        System.out.println();

        int i=0,j=0,maxDiff=-1;
        while(i<n&&j<n){
            if(lefMin[i]<rightMax[j]){
                maxDiff = Math.max(maxDiff,j -i);
                j=j+1;
            }else{
                i=i+1;
            }
        }
        System.out.println(maxDiff);
    }
}
