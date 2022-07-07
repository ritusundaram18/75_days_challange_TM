class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int[] Inter:intervals)
        {
            if(Inter[1]<newInterval[0])
                list.add(Inter);
            
            else if(Inter[0]>newInterval[1])
            {
                list.add(newInterval);
                newInterval = Inter;
            }
            else{
                newInterval[0] = Math.min(newInterval[0],Inter[0]);
                newInterval[1] = Math.max(newInterval[1],Inter[1]);
                
            }
        }
        list.add(newInterval);
        return list.toArray(new int[list.size()][]);
        
    }
}