class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int f=b_s_low(nums,0,n-1,target);
        int s=f==-1?-1:b_s_high(nums,0,n-1,target);
        return new int[]{f,s};
    }   
    int temp=-1;
    int b_s_low(int[] nums, int low, int high, int target)
    {
        if(low>high)
            return temp;
        else{
        int mid=(low+high)/2;
            
            
        if(nums[mid]==target)
        temp=mid;
        
        if(nums[mid]>=target )
           return  b_s_low(nums,low,mid-1,target);
        else
             
            return  b_s_low(nums,mid+1,high,target);
     }
    }
    
    
    int temp1=-1;
    int b_s_high(int[] nums, int low, int high, int target)
    {
        
        if (low>high)
            return temp1;
        else
            {
            int mid=(low+high)/2;
            if (nums[mid]==target)
            temp1=mid;
            if (nums[mid]>target) // left side
            return b_s_high(nums,low, mid-1, target);
            else
            return b_s_high(nums,mid+1,high,target);
            }   
                }

    }

