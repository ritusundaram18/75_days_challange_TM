class Solution {
    public int missingNumber(int[] nums) {
        int x = 0;
        
        for(int i=0; i<= nums.length; i++){
            x ^= i;
        }
        for(int j =0; j<nums.length;j++){
            x ^=nums[j];
        }
        return x;
    }
}