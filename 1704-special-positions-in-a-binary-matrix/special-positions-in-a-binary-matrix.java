class Solution {
    public int numSpecial(int[][] mat)
    {
        int c = 0;
        int m = mat[0].length;
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    if(check(mat,i,j))
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }
    public boolean check(int mat[][],int i,int j)
    {
        for(int k=0;k<mat[0].length;k++)
        {
            if(j==k)
            {
                continue;
            }
            if(mat[i][k]==1)
            {
                return false;
            }
        }
        for(int k=0;k<mat.length;k++)
        {
            if(i==k)
            {
                continue;
            }
            if(mat[k][j]==1)
            {
                return false;
            }
        }
        return true;
    }
}