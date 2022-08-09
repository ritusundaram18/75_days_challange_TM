class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        if(arr==null||arr.length==0)
            return 0;
        Arrays.sort(arr);
        
        Map<Integer,Long> mp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            long count=1l;
             for(int j=0;j<i;j++)
             {
                if(arr[i]%arr[j] ==0 && mp.containsKey(arr[i]/arr[j]))
                    count +=mp.get(arr[j])*mp.get(arr[i]/arr[j]);
        }
               mp.put(arr[i],count);
        }
     
        long totalCount=0l;
        for(Map.Entry<Integer,Long> entry:mp.entrySet())
        {
            totalCount+=entry.getValue();
        }
        return (int)(totalCount%(1000000000+7));
        
    }
}