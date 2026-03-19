class Solution {
    public int numberOfSubmatrices(char[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        int sx[] = new int[n];
        int sy[] = new int[n];
        int res = 0;
        for(int i=0;i<m;i++)
        {
            int rx = 0, ry = 0;
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='X') rx++;
                else if(grid[i][j]=='Y') ry++;
                sx[j]+=rx;
                sy[j]+=ry;
                if(sx[j] > 0 && sx[j] == sy[j])
                {
                    res++;
                }
            }
        }
        return res;
    }
}