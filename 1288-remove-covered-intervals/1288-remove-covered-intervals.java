class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int[] cur = new int[]{-1,-1};
        
        int result =0;
        
        for(int[] in:intervals){
            if(in[0] > cur[0] && in[1] > cur[1])
            {
                cur[0] = in[0];
                result++;
            }
            cur[1] = Math.max(cur[1],in[1]);
        }
        return result;
        
    }
}