class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2)
    {
        int m = grid2.length;
        int n = grid2[0].length;

        int count = 0;

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid2[i][j] == 1)
                {
                    if(dfs(grid1, grid2, i, j))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public boolean dfs(int grid1[][],int grid2[][],int r,int c)
    {
        if(r<0 || c<0 || r>=grid2.length || c>=grid2[0].length || grid2[r][c]==0)
        {
            return true;
        }
        grid2[r][c]=0;
        boolean res = true;
        if(grid1[r][c]==0)
        {
            res = false;
        }
        boolean down = dfs(grid1, grid2, r+1, c);
        boolean up = dfs(grid1, grid2, r-1, c);
        boolean right = dfs(grid1, grid2, r, c+1);
        boolean left = dfs(grid1, grid2, r, c-1);
        return res && down && up && right && left;
    }
}