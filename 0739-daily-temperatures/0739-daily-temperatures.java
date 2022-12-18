class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans= new int[temperatures.length];
        int days=0;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<temperatures.length;i++)
        {
            while(st.size() >0 && temperatures[st.peek()] < temperatures[i]){
                days=i-st.peek();
                ans[st.peek()]=days;
                st.pop();
            }
            st.push(i);
        }
        return ans;
        
    }
}