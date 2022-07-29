class Solution {
    public int majorityElement(int[] nums) {
        
        int life=0;
        int candidate =0;
        for(int i=0;i<nums.length;i++)
        {
            if(life ==0){
                candidate =nums[i];
                life++;
            }
            else if(nums[i]==candidate)
                life++;
            else 
                life--;
        }
        return candidate;
    }
}