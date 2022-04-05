class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        
        if(len == 0)
        {
            return;
        }
        int l=0;
        int m = 0;
        int temp;
        int h=len-1;
        
        while(m <= h)
        {
            if(nums[m]==1)
            {
                m++;
            }else if(nums[m] ==0){
                temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                m++;
                l++;               
            }
            else if(nums[m] == 2)
                     {
                         temp = nums[h];
                         nums[h] = nums[m];
                         nums[m] = temp;
                         h--;
                        }
        }
        
    }
}