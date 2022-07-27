class Solution {
    public int majorityElement(int[] nums) {
        
    int life =0;
        
        int c=Integer.MIN_VALUE;
        
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            if(life == 0)
            {
                c=nums[i];
                life++;
            }
            else if(nums[i] == c)
                life++;
            else 
                life--;
        }
    return c;
    }
}