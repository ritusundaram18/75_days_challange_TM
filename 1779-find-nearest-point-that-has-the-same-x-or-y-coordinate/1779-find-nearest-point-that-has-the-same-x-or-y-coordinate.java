class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int n=points.length;
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(x==points[i][0] || y==points[i][1]){
                int d=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if(d <min){
                    min=d;
                    index =i;
                }
            }
        }
        if(min ==Integer.MAX_VALUE) return -1;
            return index;
        
    }
}