class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> freq = new ArrayList<>(map.values());
        
        Collections.sort(freq,Collections.reverseOrder());
        
        int count =0;
        int totalEl=n;
        int i=0;
        
        while(totalEl >n/2)
        {
            totalEl=totalEl-freq.get(i);
            i++;
            count++;
        }
        return count;
    }
}