class Solution {
    public int islandPerimeter(int[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == 1)
                {
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }
    public int dfs(int grid[][],int r,int c)
    {
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length)
        {
            return 1;
        }
        if(grid[r][c]==0)
        {
            return 1;
        }
        if(grid[r][c]==-1)
        {
            return 0;
        }
        grid[r][c] = -1;
        int p = 0;
        p+=dfs(grid,r+1,c);
        p+=dfs(grid,r-1,c);
        p+=dfs(grid,r,c+1);
        p+=dfs(grid,r,c-1);
        return p;
    }
}