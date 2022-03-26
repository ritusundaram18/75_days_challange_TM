class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        // for(int i : nums)
        for(int i=0; i< nums.length; i++)
            sum += nums[i];
        
        int Lsum = 0;
        int Rsum = sum;
        // for(int i: nums)
         for(int i=0; i< nums.length; i++)
        {
            Rsum -=nums[i];
            
            if(Rsum == Lsum)
                return i;
             
            Lsum += nums[i]; 
        }
        return -1;
    }
}