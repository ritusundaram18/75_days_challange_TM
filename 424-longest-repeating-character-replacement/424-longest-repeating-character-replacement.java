class Solution {
    public int characterReplacement(String s, int k) {
        int N = s.length();
        int[] chr_counts = new int[26];
        
        int start =0;
        int maxLen =0;
        int maxCount = 0;
        
        for(int end =0; end < N; end++)
        {
            chr_counts[s.charAt(end)-'A']++;
            int current_char_count = chr_counts[s.charAt(end)-'A'];
            maxCount = Math.max(maxCount, current_char_count);
            
            while(end-start-maxCount+1>k)
            {
                chr_counts[s.charAt(start)-'A']--;
                start++;
            }
            maxLen = Math.max(maxLen,end-start+1);
        }
        return maxLen;
    }
}