class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
         int area_a=(ax2-ax1)*(ay2-ay1);
        int area_b=(bx2-bx1)*(by2-by1);
        int overlap_x1=Math.max(ax1,bx1);
        int overlap_y1=Math.max(ay1,by1);
        int overlap_x2=Math.min(ax2,bx2);
        int overlap_y2=Math.min(ay2,by2);
        int overlap_area=Math.max((overlap_x2-overlap_x1),0)*Math.max((overlap_y2-overlap_y1),0);
        int total_area=area_a+area_b-overlap_area;
        return total_area;
        
    }
}