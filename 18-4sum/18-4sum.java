class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        int len = nums.length;
        
        int j,k;
        int sum;
        for(int i = 0; i< len; i++)
        {
            for(int x =i+1; x<len; x++)
            {
                j=x+1;
                k=len-1;
            
            while(j<k)
            {
                sum = nums[i]+nums[x]+nums[j]+nums[k];
                if(sum ==  target)
                {
                    List<Integer> output = new ArrayList<>();
                    output.add(nums[i]);
                    output.add(nums[x]);
                    output.add(nums[j]);
                    output.add(nums[k]);
                    result.add(output);
                    j++;
                    k--;
                 }
                else if(sum > target)
                    k--;
                else 
                    j++;
            }
        }
        
    }
        return new ArrayList(result);
        
}
}