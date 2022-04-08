class Solution {
    public int findPeakElement(int[] nums) {
        // public int findPeakElement(int[] nums)
        
        if(nums.length==1)return 0;
        
        int low = 0 , high = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if((mid==0 || nums[mid]>nums[mid-1]) && (mid==nums.length-1 || nums[mid]>nums[mid+1]))return mid;
            
            if(nums[mid]>nums[mid+1]){
                high = mid;
            }else{ 
                low = mid+1;
            }
        }
        
        return high;
    }
        
    }