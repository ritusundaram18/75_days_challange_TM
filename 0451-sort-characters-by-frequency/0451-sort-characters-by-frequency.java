class Solution {
    class Pair{
        char key;
        int val;
        Pair(char key , int val){
            this.key = key;
            this.val = val;
        }
    }
    public String frequencySort(String s) {
        if(s == null)
            return null;
        char[] arr = s.toCharArray();//
        Map<Character, Integer> map = new HashMap<>();
        Queue<Pair> maxHeap = new PriorityQueue<>((a,b) -> b.val - a.val);
            
        for(char ch: arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char key: map.keySet()){
            Pair pair = new Pair(key, map.get(key));
            maxHeap.add(pair);
        }
        
        // Queue<Characterr> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
         String res= "";
              
        while(!maxHeap.isEmpty()){
            Pair cur = maxHeap.remove();
            for(int i = 0; i < cur.val; i++){
                res +=cur.key; 
            }
            
            }
        return res;
            
        }        
        
    }
