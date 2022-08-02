class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        int components = 0;
        
    boolean visited[][] = new boolean[row][col];
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    dfs(grid,i,j,visited);
                    ++components;
                }
            }
        }
        return  components;
    }
    
    void dfs(char grid[][], int row, int col, boolean visited[][]){
        
        if(row<0 || col<0 || row>=grid.length || col>= grid[0].length  || visited[row][col] == true || grid[row][col] == '0'){
            return;
        }
        visited[row][col] = true;
        dfs(grid, row, col-1,visited);
        dfs(grid, row, col+1,visited);
        dfs(grid, row-1, col,visited);
        dfs(grid, row+1, col,visited);
    }
}