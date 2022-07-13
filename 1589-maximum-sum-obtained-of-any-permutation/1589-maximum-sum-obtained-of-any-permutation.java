class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int a[]=new int[nums.length];
        
        // ..marking
        for(int[] req:requests)
        {
        
         a[req[0]]+=1;
            if(req[1]+1 <nums.length)
            a[req[1] +1] -=1;
        }
        //step3 add
        for(int i=1;i<a.length;i++)
        {
            a[i] +=a[i-1];
        }
        Arrays.sort(nums);
        Arrays.sort(a);
        long sum =0;
        for(int i=0;i<a.length;i++)
        {
            sum =(sum + a[i]*(long)nums[i])%1000000007;
        }
        return (int)sum;
        
    }
}