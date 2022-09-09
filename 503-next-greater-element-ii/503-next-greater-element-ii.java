class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> st = new Stack<>();
        int res[]=new int[nums.length];
        Arrays.fill(res,-1);
        for(int i=0;i<nums.length*2;i++)
        {
            while(st.size() >0 && nums[i%nums.length]>nums[st.peek()])
            {
                res[st.pop()]=nums[i%nums.length];
            }
            st.push(i%nums.length);
        }
         return res;
    }
}