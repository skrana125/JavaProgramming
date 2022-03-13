package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        int [] arr = {1,2,3,4,5};

        set.add(5);
        set.add(100);
        set.add(10);
        set.add(-13);
        set.add(6);
        System.out.println("Set is : "+set);
        System.out.println(Math.cbrt(65));
    }
}
