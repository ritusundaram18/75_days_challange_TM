class Solution {
    public int orangesRotting(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
       
        Queue<int[]>q=new LinkedList<>();
       
        int fresh=0;
       
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    fresh++;
                }
                else if(grid[i][j]==2)
                {
                    int arr[]=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    q.add(arr);
                   
                }
            }
        }
       
        int time=0;
        int direction[][]={{0,-1},{0,1},{-1,0},{1,0}};
       
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int curr[]=q.poll();
               
                for(int dir[] : direction)
                {
                    int x=curr[0]+dir[0];
                    int y=curr[1]+dir[1];
                   
                    if(x<0||y<0||x>=r||y>=c||grid[x][y]==2||grid[x][y]==0)
                    {
                        continue;
                    }
                    grid[x][y]=2;
                    int arr[]=new int[2];
                    arr[0]=x;
                    arr[1]=y;
                    q.add(arr);
                    fresh--;
                }
            }
           
            if(!q.isEmpty())
            {
                time++;
            }
        }
       
        if(fresh==0)
        {
            return time;
        }
        else
        {
            return -1;
        }
    }
}