class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        int start = 0;
        int end = 0;
        int max = 0;
        int len = s.length();
        Set<Character> st =new HashSet<>();
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
            max = Math.max(max, (end-start));
        }
        return max;
    }
}