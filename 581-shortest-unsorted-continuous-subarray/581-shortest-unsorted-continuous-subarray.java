class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int nums2[]=nums.clone();
        Arrays.sort(nums2);
        
        int start=0;
        int end=nums.length-1;
        
        while(start <nums.length &&nums[start] == nums2[start])
        {
            start++;
        }
        while(end>start &&nums[end] == nums2[end])
        {
            end--;
        }
        return (end-start)+1;
    }
}