class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        int i=0;
        int m=0;
        int n=0;
        
        while(i<tokens.length)
        {
            if(tokens[i].equals("+")){
                i++;
                m=st.pop();
                n=st.pop();
                st.push(m+n);
            }
            else if(tokens[i].equals("-")){
                i++;
                m=st.pop();
                n=st.pop();
                st.push(n-m);
            }
            else if(tokens[i].equals("*")){
                i++;
                m=st.pop();
                n=st.pop();
                st.push(m*n);
            }
            else if(tokens[i].equals("/")){
                i++;
                m=st.pop();
                n=st.pop();
                st.push(n/m);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
                i++;
            }
            
        }
        return st.pop();
    }
}