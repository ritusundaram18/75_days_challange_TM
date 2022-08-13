class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        Map<String, Integer> map = new HashMap();
        for(String word:words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
        List<Integer> result = new ArrayList();
        int wordsCount = words.length;
        int wordLength=words[0].length();
        
        
        for(int i=0;i<=s.length()-(wordsCount*wordLength);i++)
        {
            Map<String,Integer> seen = new HashMap();
            
            for(int j=0;j<wordsCount;j++)
            {
                int nextIndexOfWord=i+j*wordLength;
                String nextWord=s.substring(nextIndexOfWord,nextIndexOfWord+wordLength);
                
                if(!map.containsKey(nextWord))
                    break;
                
                seen.put(nextWord,seen.getOrDefault(nextWord,0)+1);
                
                if(seen.get(nextWord)>map.getOrDefault(nextWord,0))
                    break;
                
                if(j+1==wordsCount)
                    result.add(i);
            }
        }
        return result;
    }
}