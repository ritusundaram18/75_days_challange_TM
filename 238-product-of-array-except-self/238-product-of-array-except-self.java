class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
        int ans[] = new int[n];
        int k=0;
        int mult =1;
        
        for(int i=0; i< n; i++)
        {
            ans[k] = mult*nums[i];
            mult = ans[k];
            k++;
        }
        mult=1;
        for(int i=nums.length-1; i>0;i--)
        {
            ans[i]=ans[i-1]*mult;
            mult *=nums[i];
        }
        ans[0]= mult;
        return ans;
    }
}