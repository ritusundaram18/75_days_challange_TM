class Solution {
    public int longestValidParentheses(String s) {
        //()()()()(()()()   -5 
        
        Stack<Integer> st=new Stack<>();
        int a1=0;
        int a2=s.length();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(i);
            }
            else{
                if(!st.isEmpty() && s.charAt(st.peek())=='(')
                {
                    st.pop();
                }  
                else{
                    st.push(i);
                }
            }
        }//for
        if(st.size()==0)
            return s.length();
        else{
            while(!st.isEmpty())
            {
                int var=st.pop();
                a1=Math.max(a1,a2-var-1);
                a2=var;  
            }
        }
        
        return Math.max(a1,a2);
        
    }
}