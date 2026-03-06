class Solution {
    public int closedIsland(int[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        for(int j=0;j<n;j++) dfs(grid,0,j);
        for(int j=0;j<n;j++) dfs(grid,m-1,j);
        for(int i=0;i<m;i++) dfs(grid,i,0);
        for(int i=0;i<m;i++) dfs(grid,i,n-1);
        int c = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    dfs(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    public void dfs(int grid[][],int r,int c)
    {
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=0)
        {
            return;
        } 
        grid[r][c] = 1;
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}