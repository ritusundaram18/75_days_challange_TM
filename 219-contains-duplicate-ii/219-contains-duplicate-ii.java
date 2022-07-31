class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            // if(map.containsKey(nums[i])&& Math.abs(map.get(i-nums[i]))<=k)
            if(map.containsKey(nums[i]))
            {
                int a=map.get(nums[i]);
                if(Math.abs(i-a)<=k)
               return true;
            }
            map.put(nums[i],i);
        
        }
        return false;
        
        
        
        
        
//         int i = 0, j = nums.length-1;
//          int diff=0;
//         while(i<j)
//         {
           
//             while(j>i)
//             {
//                 if(nums[i]==nums[j])
//                 {
//                     diff=i-j;
//                         if(Math.abs(diff) <= k)
//                             return true;
//                 }
//                 j--;
//             }
//            i++; 
//         j = nums.length-1;
//         }
//         return false;
    }  
        
    }