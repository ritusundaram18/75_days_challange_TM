class Solution {
    public int maxProduct(int[] nums) {
       int left=0;
       int right=0;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            left=(left==0?1:left)*nums[i];
            right=(right==0?1:right)*nums[nums.length-1-i];
            max=Math.max(max,Math.max(left,right));
        }
        return max;
    }
}