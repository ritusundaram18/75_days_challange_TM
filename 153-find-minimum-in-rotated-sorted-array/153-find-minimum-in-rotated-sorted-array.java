class Solution {
    public int findMin(int[] nums) {
    
        int s = 0; 
    int e = nums.length -1;
	while(s < e){
		int m= s+ (e - s)/2;
		if(nums[m]>nums[e]) s = m+1;
		else e = m;
	}
	return nums[s];
 }
}
        
        
        //         int lo = 0;
//         int hi = nums.length-1;
        
//         if(nums[lo] <= nums[hi])
//             return nums[0];
        
//         while(lo <= hi){
//             int mid = (lo+hi)/2;
//         if(nums[mid] > nums[mid+1])
//             return nums[mid+1];
        
//         else if(nums[mid] <nums[mid-1])
//             return nums[mid];
        
//         else if(nums[lo] <= nums[mid])
//             lo = mid+1;
//         else if(nums[mid] <= nums[hi])
//             hi = mid -1;
//         }
// //     return -1;
// }
// }