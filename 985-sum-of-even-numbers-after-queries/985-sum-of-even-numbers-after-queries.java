class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum=0;
        int n=queries.length;
        
        for(int x:nums)
        {
            if(x %2 ==0)
             evenSum +=x;   
        }
        
        int ans[] =new int[n];
        for(int i=0;i<n;i++)
        {
            int newVal=queries[i][0];
            int idx = queries[i][1];
            
            int oldVal=nums[idx];
            
            if(oldVal %2== 0)
            {
                evenSum -=oldVal;  
            }
            nums[idx] +=newVal;
            
            if(nums[idx]%2==0)
                
                evenSum +=nums[idx];
                ans[i] =evenSum;
        }
        return ans;
    }
}