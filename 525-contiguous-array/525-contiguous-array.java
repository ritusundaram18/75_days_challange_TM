class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        int maxLen=0;
        for(int i=0; i< nums.length;i++)
        {
            if(nums[i] == 1)
                sum =sum+1;
            else if(nums[i] == 0)
                sum= sum + -1;
            
            if(map.containsKey(sum))
            {
                int start_idx=map.get(sum);
                int length =i-start_idx;
                maxLen=Math.max(length,maxLen);
            }
            else
                map.put(sum,i);    
                
            }
        return maxLen;
    }
}