class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        if(m == n)
        {
            for(int i = 0; i<n; i++)
            {
                for(int j = 0; j<i; j++)
                {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        }
        else{
            int ans[][] = new int[m][n];
            for(int i = 0; i<m; i++)
            {
                for(int j = 0; j<n; j++)
                {
                    ans[i][j] = matrix[j][i];
                }
            }
            return ans;
        }
    }
}