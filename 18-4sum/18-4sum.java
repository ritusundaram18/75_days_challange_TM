class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i,j,left,right;
        int n=nums.length;
        List<List<Integer>> list= new ArrayList<>();
       
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                long sum=target-nums[j];
                sum-=nums[i];
                left=j+1;
                right=n-1;
                while(left<right)
                {
                    int sum2=nums[left]+nums[right];
                    if(sum2>sum)
                    {
                        right--;
                    }
                    else if(sum2<sum)
                    {
                        left++;
                    }
                    else
                    {
                        List<Integer>ans=new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[left]);
                        ans.add(nums[right]);
                        list.add(ans);
                       
                        while(left<right && nums[left]==ans.get(2))
                        {
                            left++;
                        }
                        while(left<right && nums[right]==ans.get(3))
                        {
                            right--;
                        }
                    }
                }
                  while(j+1 < n && nums[j+1]==nums[j])
                        {
                            j++;
                        }
            }
            while(i+1 < n && nums[i+1]==nums[i])
            {
                i++;
            }
        }
        return list;
    }
}