/* */
package Recursion;

public class KnightWays
{
    static int knightMoves(int n, int m)
    {
        int [] X_axis = {-2,-1,1,2};
        int [] Y_axis = {1,2,2,1};

        int result = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<4;++k)
                {
                    int x = X_axis[k];
                    int y = Y_axis[k];
                    if(x>=0 && x<m && y>=0 && y<n)
                    {
                        ++result;
                    }
                }
            }
        }
        int total = m*m;
        total = total*(total -1)/2;
        return 2*(total-result);
    }

}
