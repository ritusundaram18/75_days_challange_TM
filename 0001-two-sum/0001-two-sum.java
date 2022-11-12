class Solution {
    public int[] twoSum(int[] nums, int target) {

        //unsorted ayyay hai to HM ka use karungi
        //put karungi
        //num = nums[i], rem = targe-num
        // fir check karungi  rem HM m hai ya nahi
        //agar HM m hai aur uska indec i  itna hi hai to continu karungi
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i =0; i< nums.length;i++)
        {
            map.put(nums[i],i);
        }
        //searching
        for(int i=0;i< nums.length;i++)
        {
            int num = nums[i];
            int rem = target -num;
            
            if(map.containsKey(rem))
            {
                int index = map.get(rem);
                if(index == i)
                    continue;
                
                return new int[]{i,index};
            }
        }
        return new int[]{};
    }
}