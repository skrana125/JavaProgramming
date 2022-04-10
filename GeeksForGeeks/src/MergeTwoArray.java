import java.util.Scanner;

public class MergeTwoArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of First array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Elements of first Array : ");
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter length of Second Array : ");
        int m = sc.nextInt();
        int [] b = new int[m];
        System.out.println("Element of Second Array : ");
        for (int i=0;i<m;i++)
        {
            b[i] = sc.nextInt();
        }
        int [] c =  new int[n+m];
        mergeArray(a,b,c,n,m);

        System.out.println("Sorted array after merging : ");
        for (int i=0;i<m+n;i++)
        {
            System.out.print(c[i]+" ");
        }
    }

    private static void mergeArray(int[] a, int[] b,int [] c, int n, int m)
    {
        int i =0, j=0,k=0;

        while(i<n && j<m)
        {
            if(a[i]<b[j])
               c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i<n)
        {
            c[k++] = a[i++];
        }
        while (j<m)
        {
            c[k++] = b[j++];
        }
    }

}
