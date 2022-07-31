class Solution {
    public int lengthOfLongestSubstring(String s) {
    
       int start = 0;
        int end =0;
        int max =0;
        int len = s.length();
        
        Set<Character> st = new HashSet<>();
        while(end < len)
        {
            char ch = s.charAt(end);
            while(st.contains(ch))
            {
                st.remove(s.charAt(start));
                start++;
            }
            st.add(ch);
            end++;
            max = Math.max(max,(end-start));
        }
        return max;
        
    }
}
// completed in 2min:40sec
//yeh basically sliding window ka problem hai
//toh start and end variable lenge he lenge
//max = lenge max subrting ckeck karnae k liye
//set ka use karnge, agar character phele se he present hai , toh remove kr denge  start index se
//aur nahi  hai to set me add kr denge , end++ kr denge aur max check kr lenge
//lasr me max return kr denge
//ACCQUIRE till it become invalid & RELEASE till become invalid