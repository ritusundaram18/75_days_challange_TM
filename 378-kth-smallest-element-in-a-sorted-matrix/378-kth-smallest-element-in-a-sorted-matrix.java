class Solution {
    class Cell{
        int row;
        int col;
        int val;
        Cell(int row, int col, int val)
        {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }
    
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Cell> minHeap = new PriorityQueue<>((a,b) -> a.val-b.val);
        
        for(int i=0; i<matrix.length;i++){
            Cell cell = new Cell(i,0,matrix[i][0]);
            minHeap.add(cell);
        }
        int count = 0;
        while(minHeap.size() > 0){
            Cell temp = minHeap.remove();
            ++count;
            if(count == k){
                return temp.val;      
            }
            if(temp.col == matrix[0].length -1){
                continue;
            }
            int new_row=temp.row;
            int new_col = temp.col+1;
            int new_val = matrix[new_row][new_col];
            Cell next_cell = new Cell(new_row, new_col,new_val);
            minHeap.add(next_cell);
        }
         return -1;
    }
   
}