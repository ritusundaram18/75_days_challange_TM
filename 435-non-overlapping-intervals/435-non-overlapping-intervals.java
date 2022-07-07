class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        
        ArrayList<int[]> list = new ArrayList<>();
        int nOI=0;
        for(int[] Interval:intervals)
        {
            if(list.size() == 0)
                list.add(Interval);
            
            else{
                int prevInterval[] =list.get(list.size()-1);
                
                if(prevInterval[1]>Interval[0])
                {
                    nOI++;
                    prevInterval[1]=Math.min(prevInterval[1],Interval[1]);
                }
                else
                    list.add(Interval);
            }
        }
        return nOI;
    }
}