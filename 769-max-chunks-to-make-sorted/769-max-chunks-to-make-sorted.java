class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = 0;
        int chunk =0;
         for(int idx=0;idx< arr.length; idx++)
         {
             max = Math.max(arr[idx], max);
             
             if(idx == max)
                 chunk++;
         }
        return chunk;
    }
}