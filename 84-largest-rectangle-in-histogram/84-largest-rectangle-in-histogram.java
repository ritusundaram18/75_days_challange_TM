class Solution {
    public int largestRectangleArea(int[] heights) {
 
        int max=Integer.MIN_VALUE;
        int[] a1=nge(heights);
        int[] a2= ngprevious(heights);
      for(int i=0;i<heights.length;i++)
      {
          int area = (a2[i]-a1[i]-1)*heights[i];
          max=Math.max(max,area);
      }
    return max;    
    }
    
    public int[] nge(int[] arr)
    {
        Stack<Integer> st =new Stack<>();
        int n=arr.length;
        int ngleft[]=new int[n];
                //loop from start
        for(int i=0;i<n;i++)
        {
                while(st.size()>0 && arr[st.peek()]>=arr[i])
                {
                    // ngleft[st.pop()]=arr[i];
                        st.pop();
                }   
        
        if(st.size() ==0)
        {
            ngleft[i]=-1;
        }
        else{
            ngleft[i]=st.peek();
        }
        st.push(i);  
        }
        return ngleft;
        
    }
    
    //right side
    public int[] ngprevious(int[] arr)
    {
        Stack<Integer> st2= new Stack<>();
        
        int n=arr.length;
        int ngright[]=new int[n];
        
        for(int i=n-1;i>=0;i--)
        {
             while(st2.size()>0 && arr[st2.peek()] >=arr[i])
            {
                 st2.pop();
             }
            
             if(st2.size() ==0)
             {
                 ngright[i]=n;
             }
            
            else{
            ngright[i]=st2.peek();
            }
             st2.push(i); 
        }
        return ngright;
    }
    
}