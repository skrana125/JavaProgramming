/* Tower of Hanoi is a mathematical puzzle where we have three rods and n disks.
The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

1. Only one disk can be moved at a time.
2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack
    i.e. a disk can only be moved if it is the uppermost disk on a stack.
3. No disk may be placed on top of a smaller disk.*/
package Recursion;

import java.util.Scanner;

public class TowerOfHanoi
{
    static void towerHanoi(int n, char from, char to, char ans)
    {
        if(n==0)
            return;
        towerHanoi(n-1,from, ans, to);
        System.out.println("Move Disk"+n+" From "+from+" To "+ans);
        towerHanoi(n-1, to, from, ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int n = scanner.nextInt();

        towerHanoi(n,'A','B','C');
    }
}
