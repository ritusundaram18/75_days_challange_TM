class Solution {
    public int firstUniqChar(String s) {
    Map<Character,Integer> map = new HashMap<>();
        
        //fill the HM
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) +1);
        }
        // check first occurnce 
        for(int i = 0;i< s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map.get(ch) == 1)
                return i;
        }
        return -1;
    }
}