class Solution {
    class Cell {
        int row;
        int col;
        int time;
        public Cell(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Cell> q = new LinkedList<>();
        int freshOranges = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 2) {
                    q.add(new Cell(i,j,0));
                } else if(grid[i][j] == 1) {
                    ++freshOranges;
                }
            }
        }
        
        int x[] = {-1,1,0,0};
        int y[] = {0,0,-1,1};
        
        int minTime = 0;
        
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                Cell top =  q.remove();
                int new_x;
                int new_y;
                for(int j=0;j<4;j++) { // up,down,left,right
                    new_x = top.row + x[j];
                    new_y = top.col + y[j];
                    
                    // boundary check+safety check
                    
                    if(new_x>=0 && new_x < grid.length && new_y>=0 && new_y < grid[0].length && grid[new_x][new_y] == 1) {
                        grid[new_x][new_y] = 2;
                        freshOranges--;
                        if(freshOranges == 0) { // rottened every fresh oranges
                            minTime = top.time+1;
                            return minTime;
                        }
                        q.add(new Cell(new_x,new_y,top.time+1));
                    }
                    
                }
            }
        }
            
            return freshOranges == 0 ? minTime : -1;
        }
    }

