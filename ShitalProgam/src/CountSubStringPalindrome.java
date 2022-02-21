public class CountSubStringPalindrome
{
    static int countPS(char str [], int n)
    {
        //create 2d array which count the all palindrome substring. sub[][] store the counts the palindrome of Substring
        int [][] sub = new int[n][n];

        //Paling [][] = true if substring[i..j] is palindrome
        boolean [][] paling = new boolean[n][n];

        // Palindrome of single String
        for(int i=0;i<n;i++)
        {
            paling[i][i] = true;
        }
        // Palindrome of length 2
        for(int i=0;i<n-1;i++)
        {
            if(str[i]==str[i+1])
            {
                paling[i][i+1]=true;
                sub[i][i+1] = 1;
            }
        }
        // Palindromes of length more than 2. This loop is
        // similar to Matrix Chain Multiplication. We start
        // with a gap of length 2 and fill the DP table in a
        // way that gap between starting and ending indexes
        // increases one-by one by outer loop.

        for(int j=2;j<n;j++)
        {
            for(int i=0;i<n-j;i++)
            {
                int gap = j+i;
                //if current string is Palindrome
                if(str[i] == str[gap] && paling[i+1][gap-1])
                {
                    paling[i][gap] = true;
                }
                // Add current palindrome substring ( + 1)
                // and rest palindrome substring (dp[i][j-1]
                // + dp[i+1][j]) remove common palindrome
                // substrings (- dp[i+1][j-1])

                if(paling[i][gap]==true)
                {
                    
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
