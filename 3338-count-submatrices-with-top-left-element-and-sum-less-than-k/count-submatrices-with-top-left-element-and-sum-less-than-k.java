class Solution {
    public int countSubmatrices(int[][] grid, int k)
    {
        int m = grid.length;
        int n = grid[0].length;
        int ps[][] = new int[m+1][n+1];
        int c = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ps[i+1][j+1] = grid[i][j] + ps[i+1][j] + ps[i][j+1] - ps[i][j];
                if(ps[i+1][j+1] <= k)
                {
                    c++;
                }
            }
        }
        return c;
    }
}