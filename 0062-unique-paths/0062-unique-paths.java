class Solution {
    public int uniquePaths(int m, int n) {
  
        int memo[][] = new int[m][n];
        
        
        for(int r=0;r<n;r++)
        {
            memo[0][r]=1;
        }
        for(int c=0;c<m;c++)
        {
            memo[c][0]=1;
        }
        
        for(int r=1;r<m;r++)
        {
            for(int c=1;c<n;c++)
            {
                memo[r][c] = memo[r-1][c]+memo[r][c-1];
            }
        }
    return memo[m-1][n-1];
    }
}