class Solution {
    public int maxProfit(int k, int[] prices) {
        
         int n = prices.length;
        int[][] dp = new int[k+1][n];   //Space : O(KN)
        
        if(n < 2) return 0;
        
        //Time O(K*N)
        for(int i = 1; i <= k; i++) {
            int effectiveBuyPrice = prices[0];
            for(int j = 1; j < n; j++) {
                //Profit by selling on current price (j) 
                // Profit = SP-EBP
                // SP => price[j]
                // BP => Effective Buy Price -> price[j] - previous profit (dp[k-1][j])
                dp[i][j] = Math.max(dp[i][j-1], prices[j] - effectiveBuyPrice);
                effectiveBuyPrice = Math.min(effectiveBuyPrice, prices[j] - dp[i-1][j]);
            }
        }
        return dp[k][n-1];   
        
    }
}