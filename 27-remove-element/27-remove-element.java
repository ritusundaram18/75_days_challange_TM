class Solution {
     public int removeElement(int[] nums, int val) {
    
         int c =0;
         for(int i=0;i< nums.length; i++)
         {
             if(nums[i] != val)
             {
                 nums[c++] = nums[i];
             }
         }
         return c;
     
     }
}


//method 2 ........................
// class Solution {
//     public int removeElement(int[] nums, int val) {
     
//         int maxvalid = 0;
//         int n = nums.length;
        
//         for(int i=0; i<n; i++){
//             if(nums[i] != val){
//                 swap(nums,i,maxvalid++);
//             }
//         }
//         return maxvalid;
//     }
//     void swap(int[] arr, int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }