class Solution {
    public boolean checkPossibility(int[] nums) {
        // boolean flag =false;
        int pos=-1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                if(pos!=-1)
                {    return false;}
                      pos = i;
            }
        }
        return pos == 0 ||pos ==-1 || pos ==nums.length-2||nums[pos] <= nums[pos+2] || nums[pos-1] <= nums[pos+1];
               
    }
}